package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ScrollingTabContainerView.class */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    public int mMaxTabWidth;
    private int mSelectedTabIndex;
    public int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    public LinearLayoutCompat mTabLayout;
    public Runnable mTabSelector;
    private Spinner mTabSpinner;
    public final VisibilityAnimListener mVisAnimListener;
    public ViewPropertyAnimator mVisibilityAnim;

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ScrollingTabContainerView$TabAdapter.class */
    public class TabAdapter extends BaseAdapter {
        public TabAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((TabView) ScrollingTabContainerView.this.mTabLayout.getChildAt(i2)).getTab();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ScrollingTabContainerView.this.createTabView((ActionBar.Tab) getItem(i2), true);
            } else {
                ((TabView) view).bindTab((ActionBar.Tab) getItem(i2));
            }
            return view;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ScrollingTabContainerView$TabClickListener.class */
    public class TabClickListener implements View.OnClickListener {
        public TabClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).getTab().select();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ScrollingTabContainerView$TabView.class */
    public class TabView extends LinearLayout {
        private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] BG_ATTRS;
        private View mCustomView;
        private ImageView mIconView;
        private ActionBar.Tab mTab;
        private TextView mTextView;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TabView(android.content.Context r8, androidx.appcompat.app.ActionBar.Tab r9, boolean r10) {
            /*
                r6 = this;
                r0 = r6
                r1 = r7
                androidx.appcompat.widget.ScrollingTabContainerView.this = r1
                int r0 = androidx.appcompat.R.attr.actionBarTabStyle
                r11 = r0
                r0 = r6
                r1 = r8
                r2 = 0
                r3 = r11
                r0.<init>(r1, r2, r3)
                r0 = 1
                int[] r0 = new int[r0]
                r7 = r0
                r0 = r7
                r1 = 0
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r0[r1] = r2
                r0 = r6
                r1 = r7
                r0.BG_ATTRS = r1
                r0 = r6
                r1 = r9
                r0.mTab = r1
                r0 = r8
                r1 = 0
                r2 = r7
                r3 = r11
                r4 = 0
                androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r1, r2, r3, r4)
                r7 = r0
                r0 = r7
                r1 = 0
                boolean r0 = r0.hasValue(r1)
                if (r0 == 0) goto L40
                r0 = r6
                r1 = r7
                r2 = 0
                android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
                r0.setBackgroundDrawable(r1)
            L40:
                r0 = r7
                r0.recycle()
                r0 = r10
                if (r0 == 0) goto L4f
                r0 = r6
                r1 = 8388627(0x800013, float:1.175497E-38)
                r0.setGravity(r1)
            L4f:
                r0 = r6
                r0.update()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.TabView.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.ActionBar$Tab, boolean):void");
        }

        public void bindTab(ActionBar.Tab tab) {
            this.mTab = tab;
            update();
        }

        public ActionBar.Tab getTab() {
            return this.mTab;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (ScrollingTabContainerView.this.mMaxTabWidth > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = ScrollingTabContainerView.this.mMaxTabWidth;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void update() {
            ActionBar.Tab tab = this.mTab;
            View customView = tab.getCustomView();
            CharSequence charSequence = null;
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.mCustomView = customView;
                TextView textView = this.mTextView;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.mIconView;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.mCustomView;
            if (view != null) {
                removeView(view);
                this.mCustomView = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.mIconView == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.mIconView = appCompatImageView;
                }
                this.mIconView.setImageDrawable(icon);
                this.mIconView.setVisibility(0);
            } else {
                ImageView imageView2 = this.mIconView;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.mIconView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(text);
            if (z) {
                if (this.mTextView == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.mTextView = appCompatTextView;
                }
                this.mTextView.setText(text);
                this.mTextView.setVisibility(0);
            } else {
                TextView textView2 = this.mTextView;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.mTextView.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.mIconView;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.getContentDescription());
            }
            if (!z) {
                charSequence = tab.getContentDescription();
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ScrollingTabContainerView$VisibilityAnimListener.class */
    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        public VisibilityAnimListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            scrollingTabContainerView.mVisibilityAnim = null;
            scrollingTabContainerView.setVisibility(this.mFinalVisibility);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewPropertyAnimator, int i2) {
            this.mFinalVisibility = i2;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimator;
            return this;
        }
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
        LinearLayoutCompat createTabLayout = createTabLayout();
        this.mTabLayout = createTabLayout;
        addView(createTabLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    private boolean isCollapsed() {
        Spinner spinner = this.mTabSpinner;
        return spinner != null && spinner.getParent() == this;
    }

    private void performCollapse() {
        if (isCollapsed()) {
            return;
        }
        if (this.mTabSpinner == null) {
            this.mTabSpinner = createSpinner();
        }
        removeView(this.mTabLayout);
        addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
        if (this.mTabSpinner.getAdapter() == null) {
            this.mTabSpinner.setAdapter((SpinnerAdapter) new TabAdapter());
        }
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mTabSelector = null;
        }
        this.mTabSpinner.setSelection(this.mSelectedTabIndex);
    }

    private boolean performExpand() {
        if (isCollapsed()) {
            removeView(this.mTabSpinner);
            addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.mTabSpinner.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void addTab(ActionBar.Tab tab, int i2, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, i2, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i2) {
        final View childAt = this.mTabLayout.getChildAt(i2);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: androidx.appcompat.widget.ScrollingTabContainerView.1
            @Override // java.lang.Runnable
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        };
        this.mTabSelector = runnable2;
        post(runnable2);
    }

    public void animateToVisibility(int i2) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator viewPropertyAnimator = this.mVisibilityAnim;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            alpha = animate().alpha(1.0f);
        } else {
            alpha = animate().alpha(0.0f);
        }
        alpha.setDuration(200L);
        alpha.setInterpolator(sAlphaInterpolator);
        alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i2));
        alpha.start();
    }

    public TabView createTabView(ActionBar.Tab tab, boolean z) {
        TabView tabView = new TabView(getContext(), tab, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
        } else {
            tabView.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new TabClickListener();
            }
            tabView.setOnClickListener(this.mTabClickListener);
        }
        return tabView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((TabView) view).getTab().select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        this.mMaxTabWidth = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (!z && this.mAllowCollapse) {
            this.mTabLayout.measure(0, makeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                performCollapse();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.mSelectedTabIndex);
                return;
            }
        }
        performExpand();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i2) {
        this.mTabLayout.removeViewAt(i2);
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i2) {
        this.mContentHeight = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.mSelectedTabIndex = i2;
        int childCount = this.mTabLayout.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i2);
            }
            i3++;
        }
        Spinner spinner = this.mTabSpinner;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }

    public void updateTab(int i2) {
        ((TabView) this.mTabLayout.getChildAt(i2)).update();
        Spinner spinner = this.mTabSpinner;
        if (spinner != null) {
            ((TabAdapter) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
