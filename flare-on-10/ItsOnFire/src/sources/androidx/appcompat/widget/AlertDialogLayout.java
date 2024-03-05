package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AlertDialogLayout.class */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void forceUniformWidth(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i5;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
            return 0;
        }
        return 0;
    }

    private void setChildFrame(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private boolean tryOnMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i2, 0);
            paddingTop += view.getMeasuredHeight();
            i4 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i4 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i5 = resolveMinimumHeight(view2);
            i6 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i7 = view3.getMeasuredHeight();
            paddingTop += i7;
            i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
        } else {
            i7 = 0;
        }
        int i10 = size - paddingTop;
        int i11 = i4;
        int i12 = i10;
        int i13 = paddingTop;
        if (view2 != null) {
            int min = Math.min(i10, i6);
            int i14 = i10;
            int i15 = i5;
            if (min > 0) {
                i14 = i10 - min;
                i15 = i5 + min;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            i13 = (paddingTop - i5) + view2.getMeasuredHeight();
            i12 = i14;
            i11 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        }
        int i16 = i11;
        int i17 = i13;
        if (view3 != null) {
            i16 = i11;
            i17 = i13;
            if (i12 > 0) {
                view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i7 + i12, mode));
                i17 = (i13 - i7) + view3.getMeasuredHeight();
                i16 = View.combineMeasuredStates(i11, view3.getMeasuredState());
            }
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i8 = i19;
            if (i18 >= childCount) {
                break;
            }
            View childAt2 = getChildAt(i18);
            int i20 = i8;
            if (childAt2.getVisibility() != 8) {
                i20 = Math.max(i8, childAt2.getMeasuredWidth());
            }
            i18++;
            i19 = i20;
        }
        setMeasuredDimension(View.resolveSizeAndState(i8 + getPaddingLeft() + getPaddingRight(), i2, i16), View.resolveSizeAndState(i17, i3, 0));
        if (mode2 != 1073741824) {
            forceUniformWidth(childCount, i3);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        if (tryOnMeasure(i2, i3)) {
            return;
        }
        super.onMeasure(i2, i3);
    }
}
