package kotlin.collections;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.RandomAccess;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��'\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Byte;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/collections/ArraysKt___ArraysJvmKt$asList$1.class */
public final class ArraysKt___ArraysJvmKt$asList$1 extends AbstractList<Byte> implements RandomAccess {
    public final /* synthetic */ byte[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$1(byte[] bArr) {
        this.$this_asList = bArr;
    }

    public boolean contains(byte b2) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(this.$this_asList, b2);
        return contains;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Byte) {
            return contains(((Number) obj).byteValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public Byte get(int i2) {
        return Byte.valueOf(this.$this_asList[i2]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    public int indexOf(byte b2) {
        int indexOf;
        indexOf = ArraysKt___ArraysKt.indexOf(this.$this_asList, b2);
        return indexOf;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Byte) {
            return indexOf(((Number) obj).byteValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public int lastIndexOf(byte b2) {
        int lastIndexOf;
        lastIndexOf = ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b2);
        return lastIndexOf;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Byte) {
            return lastIndexOf(((Number) obj).byteValue());
        }
        return -1;
    }
}
