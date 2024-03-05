package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/widget/ListViewAutoScrollHelper.class */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView mTarget;

    public ListViewAutoScrollHelper(@NonNull ListView listView) {
        super(listView);
        this.mTarget = listView;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int i2) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int i2) {
        ListView listView = this.mTarget;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i2 > 0) {
            return firstVisiblePosition + childCount < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight();
        } else if (i2 < 0) {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        } else {
            return false;
        }
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int i2, int i3) {
        ListViewCompat.scrollListBy(this.mTarget, i3);
    }
}
