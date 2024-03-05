package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionBarContainer.class */
public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    public Drawable mBackground;
    private View mContextView;
    private int mHeight;
    public boolean mIsSplit;
    public boolean mIsStacked;
    private boolean mIsTransitioning;
    public Drawable mSplitBackground;
    public Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.setBackground(this, new ActionBarBackgroundDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.mBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.mHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int getMeasuredHeightWithMargins(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean isCollapsed(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mBackground;
        if (drawable != null && drawable.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null && drawable2.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.mSplitBackground.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = findViewById(R.id.action_bar);
        this.mContextView = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.mTabContainer;
        boolean z2 = false;
        boolean z3 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = view2.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view2.layout(i2, (measuredHeight - measuredHeight2) - i6, i4, measuredHeight - i6);
        }
        if (this.mIsSplit) {
            Drawable drawable2 = this.mSplitBackground;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z2 = true;
            }
        } else {
            boolean z4 = false;
            if (this.mBackground != null) {
                if (this.mActionBarView.getVisibility() == 0) {
                    drawable = this.mBackground;
                    left = this.mActionBarView.getLeft();
                    top = this.mActionBarView.getTop();
                    right = this.mActionBarView.getRight();
                    view = this.mActionBarView;
                } else {
                    View view3 = this.mContextView;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.mBackground.setBounds(0, 0, 0, 0);
                        z4 = true;
                    } else {
                        drawable = this.mBackground;
                        left = this.mContextView.getLeft();
                        top = this.mContextView.getTop();
                        right = this.mContextView.getRight();
                        view = this.mContextView;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.mIsStacked = z3;
            z2 = z4;
            if (z3) {
                Drawable drawable3 = this.mStackedBackground;
                z2 = z4;
                if (drawable3 != null) {
                    drawable3.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                    z2 = true;
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            r0 = r8
            r9 = r0
            r0 = r6
            android.view.View r0 = r0.mActionBarView
            if (r0 != 0) goto L30
            r0 = r8
            r9 = r0
            r0 = r8
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L30
            r0 = r6
            int r0 = r0.mHeight
            r10 = r0
            r0 = r8
            r9 = r0
            r0 = r10
            if (r0 < 0) goto L30
            r0 = r10
            r1 = r8
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
        L30:
            r0 = r6
            r1 = r7
            r2 = r9
            super.onMeasure(r1, r2)
            r0 = r6
            android.view.View r0 = r0.mActionBarView
            if (r0 != 0) goto L3e
            return
        L3e:
            r0 = r9
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r8 = r0
            r0 = r6
            android.view.View r0 = r0.mTabContainer
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lb6
            r0 = r11
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto Lb6
            r0 = r8
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto Lb6
            r0 = r6
            r1 = r6
            android.view.View r1 = r1.mActionBarView
            boolean r0 = r0.isCollapsed(r1)
            if (r0 != 0) goto L79
            r0 = r6
            android.view.View r0 = r0.mActionBarView
            r11 = r0
        L6f:
            r0 = r6
            r1 = r11
            int r0 = r0.getMeasuredHeightWithMargins(r1)
            r7 = r0
            goto L8f
        L79:
            r0 = r6
            r1 = r6
            android.view.View r1 = r1.mContextView
            boolean r0 = r0.isCollapsed(r1)
            if (r0 != 0) goto L8d
            r0 = r6
            android.view.View r0 = r0.mContextView
            r11 = r0
            goto L6f
        L8d:
            r0 = 0
            r7 = r0
        L8f:
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L9d
            r0 = r9
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8 = r0
            goto La0
        L9d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = r0
        La0:
            r0 = r6
            r1 = r6
            int r1 = r1.getMeasuredWidth()
            r2 = r7
            r3 = r6
            r4 = r6
            android.view.View r4 = r4.mTabContainer
            int r3 = r3.getMeasuredHeightWithMargins(r4)
            int r2 = r2 + r3
            r3 = r8
            int r2 = java.lang.Math.min(r2, r3)
            r0.setMeasuredDimension(r1, r2)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.mBackground;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.mBackground);
        }
        this.mBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.mActionBarView;
            if (view != null) {
                this.mBackground.setBounds(view.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
            }
        }
        boolean z = true;
        if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r6.mSplitBackground == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r6.mStackedBackground == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSplitBackground(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L16
            r0 = r8
            r1 = 0
            r0.setCallback(r1)
            r0 = r6
            r1 = r6
            android.graphics.drawable.Drawable r1 = r1.mSplitBackground
            r0.unscheduleDrawable(r1)
        L16:
            r0 = r6
            r1 = r7
            r0.mSplitBackground = r1
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L44
            r0 = r7
            r1 = r6
            r0.setCallback(r1)
            r0 = r6
            boolean r0 = r0.mIsSplit
            if (r0 == 0) goto L44
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L44
            r0 = r7
            r1 = 0
            r2 = 0
            r3 = r6
            int r3 = r3.getMeasuredWidth()
            r4 = r6
            int r4 = r4.getMeasuredHeight()
            r0.setBounds(r1, r2, r3, r4)
        L44:
            r0 = r6
            boolean r0 = r0.mIsSplit
            if (r0 == 0) goto L5b
            r0 = r9
            r10 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            if (r0 != 0) goto L72
        L55:
            r0 = 1
            r10 = r0
            goto L72
        L5b:
            r0 = r9
            r10 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.mBackground
            if (r0 != 0) goto L72
            r0 = r9
            r10 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.mStackedBackground
            if (r0 != 0) goto L72
            goto L55
        L72:
            r0 = r6
            r1 = r10
            r0.setWillNotDraw(r1)
            r0 = r6
            r0.invalidate()
            r0 = r6
            r0.invalidateOutline()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.mStackedBackground;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.mStackedBackground);
        }
        this.mStackedBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mIsStacked && (drawable2 = this.mStackedBackground) != null) {
                drawable2.setBounds(this.mTabContainer.getLeft(), this.mTabContainer.getTop(), this.mTabContainer.getRight(), this.mTabContainer.getBottom());
            }
        }
        boolean z = true;
        if (!this.mIsSplit ? this.mBackground != null || this.mStackedBackground != null : this.mSplitBackground != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabContainer;
        if (view != null) {
            removeView(view);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.mIsTransitioning = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.mStackedBackground;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.mSplitBackground;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.mBackground && !this.mIsSplit) || (drawable == this.mStackedBackground && this.mIsStacked) || ((drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable));
    }
}
