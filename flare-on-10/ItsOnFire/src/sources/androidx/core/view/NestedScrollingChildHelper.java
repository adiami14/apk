package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* loaded from: ItsOnFire.jar:androidx/core/view/NestedScrollingChildHelper.class */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(@NonNull View view) {
        this.mView = view;
    }

    private boolean dispatchNestedScrollInternal(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i7;
        int i8;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            iArr2 = getTempNestedScrollConsumed();
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        ViewParentCompat.onNestedScroll(nestedScrollingParentForType, this.mView, i2, i3, i4, i5, i6, iArr2);
        if (iArr != null) {
            this.mView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
            return true;
        }
        return true;
    }

    private ViewParent getNestedScrollingParentForType(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.mNestedScrollingParentNonTouch;
        }
        return this.mNestedScrollingParentTouch;
    }

    private int[] getTempNestedScrollConsumed() {
        if (this.mTempNestedScrollConsumed == null) {
            this.mTempNestedScrollConsumed = new int[2];
        }
        return this.mTempNestedScrollConsumed;
    }

    private void setNestedScrollingParentForType(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.mNestedScrollingParentTouch = viewParent;
        } else if (i2 != 1) {
        } else {
            this.mNestedScrollingParentNonTouch = viewParent;
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedFling(nestedScrollingParentForType, this.mView, f2, f3, z);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return ViewParentCompat.onNestedPreFling(nestedScrollingParentForType, this.mView, f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i2, i3, iArr, iArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
        if (r19[1] != 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchNestedPreScroll(int r8, int r9, @androidx.annotation.Nullable int[] r10, @androidx.annotation.Nullable int[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[], int):boolean");
    }

    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6, @Nullable int[] iArr2) {
        dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr) {
        return dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @Nullable int[] iArr, int i6) {
        return dispatchNestedScrollInternal(i2, i3, i4, i5, iArr, i6, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getNestedScrollingParentForType(i2) != null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void onStopNestedScroll(@NonNull View view) {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.mIsNestedScrollingEnabled) {
            ViewCompat.stopNestedScroll(this.mView);
        }
        this.mIsNestedScrollingEnabled = z;
    }

    public boolean startNestedScroll(int i2) {
        return startNestedScroll(i2, 0);
    }

    public boolean startNestedScroll(int i2, int i3) {
        if (hasNestedScrollingParent(i3)) {
            return true;
        }
        if (isNestedScrollingEnabled()) {
            View view = this.mView;
            for (ViewParent parent = this.mView.getParent(); parent != null; parent = parent.getParent()) {
                if (ViewParentCompat.onStartNestedScroll(parent, view, this.mView, i2, i3)) {
                    setNestedScrollingParentForType(i3, parent);
                    ViewParentCompat.onNestedScrollAccepted(parent, view, this.mView, i2, i3);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public void stopNestedScroll(int i2) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i2);
        if (nestedScrollingParentForType != null) {
            ViewParentCompat.onStopNestedScroll(nestedScrollingParentForType, this.mView, i2);
            setNestedScrollingParentForType(i2, null);
        }
    }
}
