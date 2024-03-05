package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView.class */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    public static final int GENERATED_ITEM_PADDING = 4;
    public static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    public MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView$ActionMenuChildView.class */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView$ActionMenuPresenterCallback.class */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView$LayoutParams.class */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty
        public int cellsUsed;
        @ViewDebug.ExportedProperty
        public boolean expandable;
        public boolean expanded;
        @ViewDebug.ExportedProperty
        public int extraPixels;
        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;
        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i2, int i3, boolean z) {
            super(i2, i3);
            this.isOverflowButton = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView$MenuBuilderCallback.class */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ActionMenuView$OnMenuItemClickListener.class */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f2);
        this.mGeneratedItemPadding = (int) (f2 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public static int measureChildForCells(View view, int i2, int i3, int i4, int i5) {
        int i6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.hasText();
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            i6 = i7;
            if (measuredWidth % i2 != 0) {
                i6 = i7 + 1;
            }
            if (z2 && i6 < 2) {
                i6 = 2;
            }
        }
        if (layoutParams.isOverflowButton || !z2) {
            z = false;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    private void onMeasureExactFormat(int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        long j2;
        int i5;
        int i6;
        long j3;
        int i7;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - (paddingLeft + paddingRight);
        int i9 = this.mMinCellSize;
        int i10 = i8 / i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i11 = i9 + ((i8 % i9) / i10);
        int childCount = getChildCount();
        boolean z4 = false;
        int i12 = 0;
        long j4 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = i10;
        int i18 = size2;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                i7 = i12;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z5) {
                    int i19 = this.mGeneratedItemPadding;
                    childAt.setPadding(i19, 0, i19, 0);
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = false;
                layoutParams.extraPixels = 0;
                layoutParams.cellsUsed = 0;
                layoutParams.expandable = false;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                layoutParams.preventEdgeOffset = z5 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i11, layoutParams.isOverflowButton ? 1 : i17, childMeasureSpec, paddingTop);
                i13 = Math.max(i13, measureChildForCells);
                i7 = i12;
                if (layoutParams.expandable) {
                    i7 = i12 + 1;
                }
                if (layoutParams.isOverflowButton) {
                    z4 = true;
                }
                i17 -= measureChildForCells;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j4 |= 1 << i15;
                }
            }
            i15++;
            i12 = i7;
        }
        boolean z6 = false;
        int i20 = i17;
        boolean z7 = z4 && i14 == 2;
        while (i12 > 0 && i20 > 0) {
            int i21 = Integer.MAX_VALUE;
            int i22 = 0;
            int i23 = 0;
            long j5 = 0;
            while (true) {
                j2 = j5;
                if (i23 >= childCount) {
                    break;
                }
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                if (layoutParams2.expandable) {
                    int i24 = layoutParams2.cellsUsed;
                    if (i24 < i21) {
                        j3 = 1 << i23;
                        i6 = i24;
                        i5 = 1;
                    } else {
                        i5 = i22;
                        i6 = i21;
                        j3 = j2;
                        if (i24 == i21) {
                            i5 = i22 + 1;
                            j3 = j2 | (1 << i23);
                            i6 = i21;
                        }
                    }
                } else {
                    i5 = i22;
                    i6 = i21;
                    j3 = j2;
                }
                i23++;
                i22 = i5;
                i21 = i6;
                j5 = j3;
            }
            z = z6;
            i4 = i16;
            j4 |= j2;
            if (i22 > i20) {
                break;
            }
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt2 = getChildAt(i25);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                long j6 = 1 << i25;
                if ((j2 & j6) == 0) {
                    long j7 = j4;
                    if (layoutParams3.cellsUsed == i21 + 1) {
                        j7 = j4 | j6;
                    }
                    j4 = j7;
                } else {
                    if (z7 && layoutParams3.preventEdgeOffset && i20 == 1) {
                        int i26 = this.mGeneratedItemPadding;
                        childAt2.setPadding(i26 + i11, 0, i26, 0);
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i20--;
                }
            }
            i16 = i4;
            z6 = true;
        }
        z = z6;
        i4 = i16;
        boolean z8 = !z4 && i14 == 1;
        if (i20 > 0 && j4 != 0 && (i20 < i14 - 1 || z8 || i13 > 1)) {
            float bitCount = Long.bitCount(j4);
            if (!z8) {
                float f2 = bitCount;
                if ((j4 & 1) != 0) {
                    f2 = bitCount;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        f2 = bitCount - 0.5f;
                    }
                }
                int i27 = childCount - 1;
                bitCount = f2;
                if ((j4 & (1 << i27)) != 0) {
                    bitCount = f2;
                    if (!((LayoutParams) getChildAt(i27).getLayoutParams()).preventEdgeOffset) {
                        bitCount = f2 - 0.5f;
                    }
                }
            }
            int i28 = bitCount > 0.0f ? (int) ((i20 * i11) / bitCount) : 0;
            int i29 = 0;
            while (true) {
                z2 = z;
                if (i29 >= childCount) {
                    break;
                }
                if ((j4 & (1 << i29)) == 0) {
                    z3 = z;
                } else {
                    View childAt3 = getChildAt(i29);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i28;
                        layoutParams4.expanded = true;
                        if (i29 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i28) / 2;
                        }
                        z3 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i28;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i28) / 2;
                        z3 = true;
                    } else {
                        if (i29 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i28 / 2;
                        }
                        z3 = z;
                        if (i29 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i28 / 2;
                            z3 = z;
                        }
                    }
                }
                i29++;
                z = z3;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            for (int i30 = 0; i30 < childCount; i30++) {
                View childAt4 = getChildAt(i30);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i11) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i18 = i4;
        }
        setMeasuredDimension(i8, i18);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            ActionMenuPresenterCallback actionMenuPresenterCallback = this.mActionMenuPresenterCallback;
            if (actionMenuPresenterCallback == null) {
                actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(actionMenuPresenterCallback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i2) {
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        boolean z = false;
        if (i2 < getChildCount()) {
            z = false;
            if (childAt instanceof ActionMenuChildView) {
                z = false | ((ActionMenuChildView) childAt).needsDividerAfter();
            }
        }
        boolean z2 = z;
        if (i2 > 0) {
            z2 = z;
            if (childAt2 instanceof ActionMenuChildView) {
                z2 = z | ((ActionMenuChildView) childAt2).needsDividerBefore();
            }
        }
        return z2;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.mFormatItems) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i12 = measuredWidth;
                    if (hasSupportDividerBeforeChildAt(i11)) {
                        i12 = measuredWidth + dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i6 + i12;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i6 = width - i12;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= i12;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i8 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i10 - (i9 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                int i18 = width2;
                if (childAt3.getVisibility() != 8) {
                    if (layoutParams2.isOverflowButton) {
                        i18 = width2;
                    } else {
                        int i19 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i20 = i7 - (measuredHeight3 / 2);
                        childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                        i18 = i19 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                    }
                }
                i17++;
                width2 = i18;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt4 = getChildAt(i21);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            int i22 = paddingLeft;
            if (childAt4.getVisibility() != 8) {
                if (layoutParams3.isOverflowButton) {
                    i22 = paddingLeft;
                } else {
                    int i23 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i24 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                    i22 = i23 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
                }
            }
            i21++;
            paddingLeft = i22;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        MenuBuilder menuBuilder;
        boolean z = this.mFormatItems;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.mFormatItems = z2;
        if (z != z2) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.setExpandedActionViewsExclusive(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.mPopupTheme != i2) {
            this.mPopupTheme = i2;
            if (i2 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }
}
