package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��D\n��\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH��\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH��\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a \u0010\u0011\u001a\u00020\u0012*\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013H\u0002\u001a\"\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014\u0018\u00010\u0013*\u00020\u0012H\u0002\"\u001e\u0010��\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"AcceptableClasses", "", "Ljava/lang/Class;", "", "[Ljava/lang/Class;", "DisposableSaveableStateRegistry", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "view", "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "id", "", "savedStateRegistryOwner", "canBeSavedToBundle", "", "value", "toBundle", "Landroid/os/Bundle;", "", "", "toMap", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt.class */
public final class DisposableSaveableStateRegistry_androidKt {
    @NotNull
    private static final Class<? extends Object>[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull View view, @NotNull SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewParent parent = view.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            Object tag = view2.getTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag);
            String str = tag instanceof String ? (String) tag : null;
            String str2 = str;
            if (str == null) {
                str2 = String.valueOf(view2.getId());
            }
            return DisposableSaveableStateRegistry(str2, owner);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    @NotNull
    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(@NotNull String id, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
        boolean z;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        final String str = ((Object) SaveableStateRegistry.class.getSimpleName()) + ':' + id;
        final SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "savedStateRegistryOwner.savedStateRegistry");
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
        final SaveableStateRegistry SaveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(consumeRestoredStateForKey == null ? null : toMap(consumeRestoredStateForKey), new Function1<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object it) {
                boolean canBeSavedToBundle;
                Intrinsics.checkNotNullParameter(it, "it");
                canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(it);
                return Boolean.valueOf(canBeSavedToBundle);
            }
        });
        try {
            savedStateRegistry.registerSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.compose.ui.platform.g
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle m4210DisposableSaveableStateRegistry$lambda0;
                    m4210DisposableSaveableStateRegistry$lambda0 = DisposableSaveableStateRegistry_androidKt.m4210DisposableSaveableStateRegistry$lambda0(SaveableStateRegistry.this);
                    return m4210DisposableSaveableStateRegistry$lambda0;
                }
            });
            z = true;
        } catch (IllegalArgumentException e2) {
            z = false;
        }
        final boolean z2 = z;
        return new DisposableSaveableStateRegistry(SaveableStateRegistry, new Function0<Unit>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (z2) {
                    savedStateRegistry.unregisterSavedStateProvider(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisposableSaveableStateRegistry$lambda-0  reason: not valid java name */
    public static final Bundle m4210DisposableSaveableStateRegistry$lambda0(SaveableStateRegistry saveableStateRegistry) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry, "$saveableStateRegistry");
        return toBundle(saveableStateRegistry.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        boolean z = true;
        if (!(obj instanceof SnapshotMutableState)) {
            Class<? extends Object>[] clsArr = AcceptableClasses;
            int length = clsArr.length;
            int i2 = 0;
            while (i2 < length) {
                i2++;
                if (clsArr[i2].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
        if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
            T value = snapshotMutableState.getValue();
            if (value != 0) {
                z = canBeSavedToBundle(value);
            }
            return z;
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "this.keySet()");
        for (String key : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(key);
            if (parcelableArrayList == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            }
            Intrinsics.checkNotNullExpressionValue(key, "key");
            linkedHashMap.put(key, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
