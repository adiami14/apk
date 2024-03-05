package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��.\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H��\u001a1\u0010\u0005\u001a\u0002H\u0006\"\b\b��\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\bH��\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\bH��\"\u000e\u0010��\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0010"}, d2 = {"viewAdaptersKey", "", "tagKey", "key", "", "getOrAddAdapter", "T", "Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "id", "factory", "Lkotlin/Function0;", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "getViewAdapter", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/node/ViewInterop_androidKt.class */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T extends ViewAdapter> T getOrAddAdapter(@NotNull View view, int i2, @NotNull Function0<? extends T> factory) {
        T t2;
        ViewAdapter viewAdapter;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i3 = 0;
        while (true) {
            t2 = null;
            if (i3 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i3);
            if (viewAdapter.getId() == i2) {
                break;
            }
            i3++;
        }
        if (viewAdapter instanceof ViewAdapter) {
            t2 = viewAdapter;
        }
        if (t2 == null) {
            t2 = factory.invoke();
            viewAdapter2.getAdapters().add(t2);
        }
        return t2;
    }

    @NotNull
    public static final MergedViewAdapter getViewAdapter(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i2 = viewAdaptersKey;
        Object tag = view.getTag(i2);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        MergedViewAdapter mergedViewAdapter2 = mergedViewAdapter;
        if (mergedViewAdapter == null) {
            mergedViewAdapter2 = new MergedViewAdapter();
            view.setTag(i2, mergedViewAdapter2);
        }
        return mergedViewAdapter2;
    }

    @Nullable
    public static final MergedViewAdapter getViewAdapterIfExists(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(viewAdaptersKey);
        return tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
    }

    public static final int tagKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.hashCode() | 50331648;
    }
}