package kotlin.text;

import androidx.appcompat.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0011\n��\n\u0002\u0010\u001c\n��\n\u0002\u0010(\n��*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u0096\u0002¨\u0006\u0004¸\u0006��"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/text/StringsKt___StringsKt$asIterable$$inlined$Iterable$1.class */
public final class StringsKt___StringsKt$asIterable$$inlined$Iterable$1 implements Iterable<Character>, KMappedMarker {
    public final /* synthetic */ CharSequence $this_asIterable$inlined;

    public StringsKt___StringsKt$asIterable$$inlined$Iterable$1(CharSequence charSequence) {
        this.$this_asIterable$inlined = charSequence;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Character> iterator() {
        return StringsKt__StringsKt.iterator(this.$this_asIterable$inlined);
    }
}
