package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"��\u0011\n��\n\u0002\u0010\u001c\n��\n\u0002\u0010(\n��*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = Typography.degree)
/* loaded from: ItsOnFire.jar:kotlin/collections/CollectionsKt__IterablesKt$Iterable$1.class */
public final class CollectionsKt__IterablesKt$Iterable$1<T> implements Iterable<T>, KMappedMarker {
    public final /* synthetic */ Function0<Iterator<T>> $iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt__IterablesKt$Iterable$1(Function0<? extends Iterator<? extends T>> function0) {
        this.$iterator = function0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return this.$iterator.invoke();
    }
}
