package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
/* loaded from: ItsOnFire.jar:androidx/customview/widget/ViewDragHelper.class */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    /* loaded from: ItsOnFire.jar:androidx/customview/widget/ViewDragHelper$Callback.class */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
            return 0;
        }

        public int getOrderedChildIndex(int i2) {
            return i2;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i2, int i3) {
        }

        public boolean onEdgeLock(int i2) {
            return false;
        }

        public void onEdgeTouched(int i2, int i3) {
        }

        public void onViewCaptured(@NonNull View view, int i2) {
        }

        public void onViewDragStateChanged(int i2) {
        }

        public void onViewPositionChanged(@NonNull View view, int i2, int i3, @Px int i4, @Px int i5) {
        }

        public void onViewReleased(@NonNull View view, float f2, float f3) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i2);
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.mParentView = viewGroup;
        this.mCallback = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mEdgeSize = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(context, sInterpolator);
    }

    private boolean checkNewEdgeDrag(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        boolean z = false;
        if ((this.mInitialEdgesTouched[i2] & i3) == i3) {
            z = false;
            if ((this.mTrackingEdges & i3) != 0) {
                z = false;
                if ((this.mEdgeDragsLocked[i2] & i3) != i3) {
                    z = false;
                    if ((this.mEdgeDragsInProgress[i2] & i3) != i3) {
                        int i4 = this.mTouchSlop;
                        if (abs <= i4 && abs2 <= i4) {
                            z = false;
                        } else if (abs < abs2 * 0.5f && this.mCallback.onEdgeLock(i3)) {
                            int[] iArr = this.mEdgeDragsLocked;
                            iArr[i2] = iArr[i2] | i3;
                            return false;
                        } else {
                            z = false;
                            if ((this.mEdgeDragsInProgress[i2] & i3) == 0) {
                                z = false;
                                if (abs > this.mTouchSlop) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    private boolean checkTouchSlop(View view, float f2, float f3) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z3 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (z2 && z3) {
            int i2 = this.mTouchSlop;
            if ((f2 * f2) + (f3 * f3) > i2 * i2) {
                z = true;
            }
            return z;
        } else if (z2) {
            boolean z4 = false;
            if (Math.abs(f2) > this.mTouchSlop) {
                z4 = true;
            }
            return z4;
        } else {
            boolean z5 = false;
            if (z3) {
                z5 = false;
                if (Math.abs(f3) > this.mTouchSlop) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    private float clampMag(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            if (f2 <= 0.0f) {
                f4 = -f4;
            }
            return f4;
        }
        return f2;
    }

    private int clampMag(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            if (i2 <= 0) {
                i4 = -i4;
            }
            return i4;
        }
        return i2;
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }

    private void clearMotionHistory(int i2) {
        if (this.mInitialMotionX == null || !isPointerDown(i2)) {
            return;
        }
        this.mInitialMotionX[i2] = 0.0f;
        this.mInitialMotionY[i2] = 0.0f;
        this.mLastMotionX[i2] = 0.0f;
        this.mLastMotionY[i2] = 0.0f;
        this.mInitialEdgesTouched[i2] = 0;
        this.mEdgeDragsInProgress[i2] = 0;
        this.mEdgeDragsLocked[i2] = 0;
        this.mPointersDown = (1 << i2) & this.mPointersDown;
    }

    private int computeAxisDuration(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f2 = width / 2;
        float distanceInfluenceForSnapDuration = distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i2) / width));
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs((f2 + (distanceInfluenceForSnapDuration * f2)) / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), (int) MAX_SETTLE_DURATION);
    }

    private int computeSettleDuration(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int clampMag = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i5, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (clampMag != 0) {
            f2 = abs3;
            f3 = i6;
        } else {
            f2 = abs;
            f3 = i7;
        }
        float f6 = f2 / f3;
        if (clampMag2 != 0) {
            f4 = abs4;
            f5 = i6;
        } else {
            f4 = abs2;
            f5 = i7;
        }
        return (int) ((computeAxisDuration(i2, clampMag, this.mCallback.getViewHorizontalDragRange(view)) * f6) + (computeAxisDuration(i3, clampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f4 / f5)));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f2, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (create.mTouchSlop * (1.0f / f2));
        return create;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    private void dispatchViewReleased(float f2, float f3) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f2, f3);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i2, int i3, int i4, int i5) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i6 = i2;
        if (i4 != 0) {
            i6 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i2, i4);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i6 - left);
        }
        int i7 = i3;
        if (i5 != 0) {
            i7 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i3, i5);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i7 - top);
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i6, i7, i6 - left, i7 - top);
    }

    private void ensureMotionHistorySizeForId(int i2) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i2, int i3, int i4, int i5) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i6, i7, computeSettleDuration(this.mCapturedView, i6, i7, i4, i5));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i2, int i3) {
        int i4 = i2 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        int i5 = i4;
        if (i3 < this.mParentView.getTop() + this.mEdgeSize) {
            i5 = i4 | 4;
        }
        int i6 = i5;
        if (i2 > this.mParentView.getRight() - this.mEdgeSize) {
            i6 = i5 | 2;
        }
        int i7 = i6;
        if (i3 > this.mParentView.getBottom() - this.mEdgeSize) {
            i7 = i6 | 8;
        }
        return i7;
    }

    private boolean isValidPointerForActionMove(int i2) {
        if (isPointerDown(i2)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f2, float f3, int i2) {
        boolean checkNewEdgeDrag = checkNewEdgeDrag(f2, f3, i2, 1);
        boolean z = checkNewEdgeDrag;
        if (checkNewEdgeDrag(f3, f2, i2, 4)) {
            z = checkNewEdgeDrag | true;
        }
        boolean z2 = z;
        if (checkNewEdgeDrag(f2, f3, i2, 2)) {
            z2 = z | true;
        }
        boolean z3 = z2;
        if (checkNewEdgeDrag(f3, f2, i2, 8)) {
            z3 = z2 | true;
        }
        if (z3) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i2] = iArr[i2] | z3;
            this.mCallback.onEdgeDragStarted(z3 ? 1 : 0, i2);
        }
    }

    private void saveInitialMotion(float f2, float f3, int i2) {
        ensureMotionHistorySizeForId(i2);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i2] = f3;
        fArr2[i2] = f3;
        this.mInitialEdgesTouched[i2] = getEdgesTouched((int) f2, (int) f3);
        this.mPointersDown |= 1 << i2;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean canScroll(@NonNull View view, boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && canScroll(childAt, true, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            z2 = true;
            if (!view.canScrollHorizontally(-i2)) {
                if (view.canScrollVertically(-i3)) {
                    z2 = true;
                }
            }
            return z2;
        }
        z2 = false;
        return z2;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(@NonNull View view, int i2) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i2;
            this.mCallback.onViewCaptured(view, i2);
            setDragState(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
    }

    public boolean checkTouchSlop(int i2) {
        int length = this.mInitialMotionX.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (checkTouchSlop(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i2, int i3) {
        boolean z = false;
        if (isPointerDown(i3)) {
            boolean z2 = (i2 & 1) == 1;
            boolean z3 = (i2 & 2) == 2;
            float f2 = this.mLastMotionX[i3] - this.mInitialMotionX[i3];
            float f3 = this.mLastMotionY[i3] - this.mInitialMotionY[i3];
            if (z2 && z3) {
                int i4 = this.mTouchSlop;
                if ((f2 * f2) + (f3 * f3) > i4 * i4) {
                    z = true;
                }
                return z;
            } else if (z2) {
                boolean z4 = false;
                if (Math.abs(f2) > this.mTouchSlop) {
                    z4 = true;
                }
                return z4;
            } else {
                boolean z5 = false;
                if (z3) {
                    z5 = false;
                    if (Math.abs(f3) > this.mTouchSlop) {
                        z5 = true;
                    }
                }
                return z5;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (left != 0 || top != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            boolean z2 = computeScrollOffset;
            if (computeScrollOffset) {
                z2 = computeScrollOffset;
                if (currX == this.mScroller.getFinalX()) {
                    z2 = computeScrollOffset;
                    if (currY == this.mScroller.getFinalY()) {
                        this.mScroller.abortAnimation();
                        z2 = false;
                    }
                }
            }
            if (!z2) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        boolean z3 = false;
        if (this.mDragState == 2) {
            z3 = true;
        }
        return z3;
    }

    @Nullable
    public View findTopChildUnder(int i2, int i3) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i2, int i3, int i4, int i5) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i2, i4, i3, i5);
        setDragState(2);
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i2, int i3) {
        return isViewUnder(this.mCapturedView, i2, i3);
    }

    public boolean isEdgeTouched(int i2) {
        int length = this.mInitialEdgesTouched.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (isEdgeTouched(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i2, int i3) {
        return isPointerDown(i3) && (this.mInitialEdgesTouched[i3] & i2) != 0;
    }

    public boolean isPointerDown(int i2) {
        boolean z = true;
        if ((this.mPointersDown & (1 << i2)) == 0) {
            z = false;
        }
        return z;
    }

    public boolean isViewUnder(@Nullable View view, int i2, int i3) {
        if (view == null) {
            return false;
        }
        boolean z = false;
        if (i2 >= view.getLeft()) {
            z = false;
            if (i2 < view.getRight()) {
                z = false;
                if (i3 >= view.getTop()) {
                    z = false;
                    if (i3 < view.getBottom()) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View findTopChildUnder = findTopChildUnder((int) x, (int) y);
            saveInitialMotion(x, y, pointerId);
            tryCaptureViewForDrag(findTopChildUnder, pointerId);
            int i4 = this.mInitialEdgesTouched[pointerId];
            int i5 = this.mTrackingEdges;
            if ((i4 & i5) != 0) {
                this.mCallback.onEdgeTouched(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.mDragState != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i6 = 0; i6 < pointerCount; i6++) {
                        int pointerId2 = motionEvent.getPointerId(i6);
                        if (isValidPointerForActionMove(pointerId2)) {
                            float x2 = motionEvent.getX(i6);
                            float y2 = motionEvent.getY(i6);
                            float f2 = x2 - this.mInitialMotionX[pointerId2];
                            float f3 = y2 - this.mInitialMotionY[pointerId2];
                            reportNewEdgeDrags(f2, f3, pointerId2);
                            if (this.mDragState == 1) {
                                break;
                            }
                            View findTopChildUnder2 = findTopChildUnder((int) x2, (int) y2);
                            if (checkTouchSlop(findTopChildUnder2, f2, f3) && tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                                break;
                            }
                        }
                    }
                } else if (!isValidPointerForActionMove(this.mActivePointerId)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.mLastMotionX;
                    int i7 = this.mActivePointerId;
                    int i8 = (int) (x3 - fArr[i7]);
                    int i9 = (int) (y3 - this.mLastMotionY[i7]);
                    dragTo(this.mCapturedView.getLeft() + i8, this.mCapturedView.getTop() + i9, i8, i9);
                }
                saveLastMotion(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    saveInitialMotion(x4, y4, pointerId3);
                    if (this.mDragState != 0) {
                        if (isCapturedViewUnder((int) x4, (int) y4)) {
                            tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                            return;
                        }
                        return;
                    }
                    tryCaptureViewForDrag(findTopChildUnder((int) x4, (int) y4), pointerId3);
                    int i10 = this.mInitialEdgesTouched[pointerId3];
                    int i11 = this.mTrackingEdges;
                    if ((i10 & i11) != 0) {
                        this.mCallback.onEdgeTouched(i10 & i11, pointerId3);
                        return;
                    }
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i3 >= pointerCount2) {
                                i2 = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i3);
                            if (pointerId5 != this.mActivePointerId) {
                                View findTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                View view = this.mCapturedView;
                                if (findTopChildUnder3 == view && tryCaptureViewForDrag(view, pointerId5)) {
                                    i2 = this.mActivePointerId;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (i2 == -1) {
                            releaseViewForPointerUp();
                        }
                    }
                    clearMotionHistory(pointerId4);
                    return;
                }
            } else if (this.mDragState == 1) {
                dispatchViewReleased(0.0f, 0.0f);
            }
        } else if (this.mDragState == 1) {
            releaseViewForPointerUp();
        }
        cancel();
    }

    public void setDragState(int i2) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i2) {
            this.mDragState = i2;
            this.mCallback.onViewDragStateChanged(i2);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeTrackingEnabled(int i2) {
        this.mTrackingEdges = i2;
    }

    public void setMinVelocity(float f2) {
        this.mMinVelocity = f2;
    }

    public boolean settleCapturedViewAt(int i2, int i3) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i2, i3, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
        if (r0 != r0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i2, int i3) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i2, i3, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    public boolean tryCaptureViewForDrag(View view, int i2) {
        if (view == this.mCapturedView && this.mActivePointerId == i2) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i2)) {
            return false;
        }
        this.mActivePointerId = i2;
        captureChildView(view, i2);
        return true;
    }
}
