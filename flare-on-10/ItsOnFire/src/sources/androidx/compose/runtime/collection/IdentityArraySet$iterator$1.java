package androidx.compose.runtime.collection;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"��\u001b\n��\n\u0002\u0010(\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028��H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"androidx/compose/runtime/collection/IdentityArraySet$iterator$1", "", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/collection/IdentityArraySet$iterator$1.class */
public final class IdentityArraySet$iterator$1<T> implements Iterator<T>, KMappedMarker {
    private int index;
    public final /* synthetic */ IdentityArraySet<T> this$0;

    public IdentityArraySet$iterator$1(IdentityArraySet<T> identityArraySet) {
        this.this$0 = identityArraySet;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.this$0.size();
    }

    @Override // java.util.Iterator
    @NotNull
    public T next() {
        Object[] values = this.this$0.getValues();
        int i2 = this.index;
        this.index = i2 + 1;
        T t2 = (T) values[i2];
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
