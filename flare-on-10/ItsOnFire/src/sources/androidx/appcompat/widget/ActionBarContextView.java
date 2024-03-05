package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionBarContextView.class */
public class ActionBarContextView extends AbsActionBarView {
    private View mClose;
    private View mCloseButton;
    private int mCloseItemLayout;
    private View mCustomView;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.ActionMode, i2, 0);
        ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(R.styleable.ActionMode_background));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionMode_height, 0);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    private void initTitle() {
        if (this.mTitleLayout == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleLayout = linearLayout;
            this.mTitleView = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_subtitle);
            if (this.mTitleStyleRes != 0) {
                this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
            }
            if (this.mSubtitleStyleRes != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        boolean isEmpty = TextUtils.isEmpty(this.mTitle);
        boolean z = !TextUtils.isEmpty(this.mSubtitle);
        this.mSubtitleView.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout2 = this.mTitleLayout;
        int i2 = 0;
        if (!(!isEmpty)) {
            i2 = z ? 0 : 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int i2) {
        super.animateToVisibility(i2);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
        return super.canShowOverflowMenu();
    }

    public void closeMode() {
        if (this.mClose == null) {
            killMode();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
        super.dismissPopupMenus();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initForMode(final androidx.appcompat.view.ActionMode r7) {
        /*
            r6 = this;
            r0 = r6
            android.view.View r0 = r0.mClose
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L27
            r0 = r6
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = r6
            int r1 = r1.mCloseItemLayout
            r2 = r6
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.mClose = r1
        L1f:
            r0 = r6
            r1 = r8
            r0.addView(r1)
            goto L36
        L27:
            r0 = r8
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L36
            r0 = r6
            android.view.View r0 = r0.mClose
            r8 = r0
            goto L1f
        L36:
            r0 = r6
            android.view.View r0 = r0.mClose
            int r1 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.mCloseButton = r1
            r0 = r8
            androidx.appcompat.widget.ActionBarContextView$1 r1 = new androidx.appcompat.widget.ActionBarContextView$1
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>()
            r0.setOnClickListener(r1)
            r0 = r7
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r7 = r0
            r0 = r6
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.mActionMenuPresenter
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            boolean r0 = r0.dismissPopupMenus()
        L69:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            r1 = r0
            r2 = r6
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.mActionMenuPresenter = r1
            r0 = r8
            r1 = 1
            r0.setReserveOverflow(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = r0
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r7
            r1 = r6
            androidx.appcompat.widget.ActionMenuPresenter r1 = r1.mActionMenuPresenter
            r2 = r6
            android.content.Context r2 = r2.mPopupContext
            r0.addMenuPresenter(r1, r2)
            r0 = r6
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.mActionMenuPresenter
            r1 = r6
            androidx.appcompat.view.menu.MenuView r0 = r0.getMenuView(r1)
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r7 = r0
            r0 = r6
            r1 = r7
            r0.mMenuView = r1
            r0 = r7
            r1 = 0
            androidx.core.view.ViewCompat.setBackground(r0, r1)
            r0 = r6
            r1 = r6
            androidx.appcompat.widget.ActionMenuView r1 = r1.mMenuView
            r2 = r8
            r0.addView(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.initForMode(androidx.appcompat.view.ActionMode):void");
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
        return super.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view = this.mCloseButton;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hideOverflowMenu();
            this.mActionMenuPresenter.hideSubMenus();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingRight = isLayoutRtl ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.mClose;
        int i6 = paddingRight;
        if (view != null) {
            i6 = paddingRight;
            if (view.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
                int i7 = isLayoutRtl ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
                int i8 = isLayoutRtl ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
                int next = AbsActionBarView.next(paddingRight, i7, isLayoutRtl);
                i6 = AbsActionBarView.next(next + positionChild(this.mClose, next, paddingTop, paddingTop2, isLayoutRtl), i8, isLayoutRtl);
            }
        }
        LinearLayout linearLayout = this.mTitleLayout;
        int i9 = i6;
        if (linearLayout != null) {
            i9 = i6;
            if (this.mCustomView == null) {
                i9 = i6;
                if (linearLayout.getVisibility() != 8) {
                    i9 = i6 + positionChild(this.mTitleLayout, i6, paddingTop, paddingTop2, isLayoutRtl);
                }
            }
        }
        View view2 = this.mCustomView;
        if (view2 != null) {
            positionChild(view2, i9, paddingTop, paddingTop2, isLayoutRtl);
        }
        int paddingLeft = isLayoutRtl ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            positionChild(actionMenuView, paddingLeft, paddingTop, paddingTop2, !isLayoutRtl);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i2);
            int i4 = this.mContentHeight;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.mClose;
            int i6 = paddingLeft;
            if (view != null) {
                int measureChildView = measureChildView(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
                i6 = measureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.mMenuView;
            int i7 = i6;
            if (actionMenuView != null) {
                i7 = i6;
                if (actionMenuView.getParent() == this) {
                    i7 = measureChildView(this.mMenuView, i6, makeMeasureSpec, 0);
                }
            }
            LinearLayout linearLayout = this.mTitleLayout;
            int i8 = i7;
            if (linearLayout != null) {
                i8 = i7;
                if (this.mCustomView == null) {
                    if (this.mTitleOptional) {
                        this.mTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.mTitleLayout.getMeasuredWidth();
                        boolean z = measuredWidth <= i7;
                        i8 = i7;
                        if (z) {
                            i8 = i7 - measuredWidth;
                        }
                        this.mTitleLayout.setVisibility(z ? 0 : 8);
                    } else {
                        i8 = measureChildView(linearLayout, i7, makeMeasureSpec, 0);
                    }
                }
            }
            View view2 = this.mCustomView;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i9 = layoutParams.width;
                int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i11 = i8;
                if (i9 >= 0) {
                    i11 = Math.min(i9, i8);
                }
                int i12 = layoutParams.height;
                int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i14 = i5;
                if (i12 >= 0) {
                    i14 = Math.min(i12, i5);
                }
                this.mCustomView.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i14, i13));
            }
            if (this.mContentHeight > 0) {
                setMeasuredDimension(size, i4);
                return;
            }
            int childCount = getChildCount();
            int i15 = 0;
            int i16 = 0;
            while (i16 < childCount) {
                int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
                int i17 = i15;
                if (measuredHeight > i15) {
                    i17 = measuredHeight;
                }
                i16++;
                i15 = i17;
            }
            setMeasuredDimension(size, i15);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
        super.postShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i2) {
        this.mContentHeight = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.mCustomView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (linearLayout = this.mTitleLayout) != null) {
            removeView(linearLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i2, long j2) {
        return super.setupAnimatorToVisibility(i2, j2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.showOverflowMenu();
        }
        return false;
    }
}
