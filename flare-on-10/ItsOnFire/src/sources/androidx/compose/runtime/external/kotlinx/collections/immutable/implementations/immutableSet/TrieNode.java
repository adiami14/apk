package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��:\n\u0002\u0018\u0002\n��\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b��\u0018�� _*\u0004\b��\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001a\u001a\u00028��H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028��H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001a\u001a\u00028��H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028��2\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H��¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028��2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028��0��2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001a\u001a\u00028��2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028��0��2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001a\u001a\u00028��2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028��2\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028��0��2\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028��0��H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode.class */
public final class TrieNode<E> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
    private int bitmap;
    @NotNull
    private Object[] buffer;
    @Nullable
    private MutabilityOwnership ownedBy;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i2, @NotNull Object[] buffer) {
        this(i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    public TrieNode(int i2, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.bitmap = i2;
        this.buffer = buffer;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i2, E e2) {
        Object[] addElementAtIndex;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i2), e2);
        return new TrieNode<>(this.bitmap | i2, addElementAtIndex);
    }

    private final int calculateSize() {
        int i2 = this.bitmap;
        Object[] objArr = this.buffer;
        if (i2 == 0) {
            return objArr.length;
        }
        int length = objArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Object obj = objArr[i3];
            int i5 = i3 + 1;
            i4 += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
            i3 = i5;
        }
        return i4;
    }

    private final TrieNode<E> collisionAdd(E e2) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(e2)) {
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e2);
        return new TrieNode<>(0, addElementAtIndex);
    }

    private final boolean collisionContainsElement(E e2) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains((E[]) this.buffer, e2);
        return contains;
    }

    private final TrieNode<E> collisionRemove(E e2) {
        int indexOf;
        indexOf = ArraysKt___ArraysKt.indexOf((E[]) this.buffer, e2);
        TrieNode<E> trieNode = this;
        if (indexOf != -1) {
            trieNode = collisionRemoveElementAtIndex(indexOf);
        }
        return trieNode;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i2) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
        return new TrieNode<>(0, removeCellAtIndex);
    }

    private final E elementAtIndex(int i2) {
        return (E) this.buffer[i2];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.buffer[i2] != trieNode.buffer[i2]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i2) {
        return (this.bitmap & i2) == 0;
    }

    private final TrieNode<E> makeNode(int i2, E e2, int i3, E e3, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode<>(0, new Object[]{e2, e3}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i2, i4);
        int indexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (indexSegment != indexSegment2) {
            Object[] objArr = new Object[2];
            if (indexSegment < indexSegment2) {
                objArr[0] = e2;
                objArr[1] = e3;
            } else {
                objArr[0] = e3;
                objArr[1] = e2;
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), objArr, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i2, e2, i3, e3, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        E elementAtIndex = elementAtIndex(i2);
        return makeNode(elementAtIndex == null ? 0 : elementAtIndex.hashCode(), elementAtIndex, i3, e2, i4 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i2, int i3, E e2, int i4) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i2, E e2, MutabilityOwnership mutabilityOwnership) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i2);
        if (this.ownedBy != mutabilityOwnership) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e2);
            return new TrieNode<>(this.bitmap | i2, addElementAtIndex, mutabilityOwnership);
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e2);
        this.buffer = addElementAtIndex2;
        this.bitmap = i2 | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        if (collisionContainsElement(e2)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release()) {
            addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e2);
            return new TrieNode<>(0, addElementAtIndex, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, 0, e2);
        this.buffer = addElementAtIndex2;
        return this;
    }

    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        int i2;
        Object[] copyOf;
        TrieNode<E> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m2010assert(i2 <= i3);
            int i5 = i2;
            if (!collisionContainsElement((E) objArr2[i3])) {
                copyOf2[length + i2] = objArr2[i3];
                i5 = i2 + 1;
                CommonFunctionsKt.m2010assert(length + i5 <= copyOf2.length);
            }
            i3++;
            i4 = i5;
        }
        int length2 = i2 + this.buffer.length;
        deltaCounter.plusAssign(copyOf2.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 == copyOf2.length) {
            copyOf = copyOf2;
        } else {
            copyOf = Arrays.copyOf(copyOf2, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        if (Intrinsics.areEqual(this.ownedBy, mutabilityOwnership)) {
            this.buffer = copyOf;
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode<>(0, copyOf, mutabilityOwnership);
        }
        return trieNode2;
    }

    private final TrieNode<E> mutableCollisionRemove(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexOf;
        indexOf = ArraysKt___ArraysKt.indexOf((E[]) this.buffer, e2);
        TrieNode<E> trieNode = this;
        if (indexOf != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            trieNode = mutableCollisionRemoveElementAtIndex(indexOf, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return trieNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        int i2;
        TrieNode<E> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        TrieNode<E>[] trieNodeArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr = this.buffer;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 >= objArr.length) {
                break;
            }
            CommonFunctionsKt.m2010assert(i2 <= i3);
            int i5 = i2;
            if (!trieNode.collisionContainsElement((E) objArr[i3])) {
                trieNodeArr[0 + i2] = objArr[i3];
                i5 = i2 + 1;
                CommonFunctionsKt.m2010assert(0 + i5 <= trieNodeArr.length);
            }
            i3++;
            i4 = i5;
        }
        deltaCounter.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            trieNode2 = EMPTY;
        } else if (i2 == 1) {
            trieNode2 = trieNodeArr[0];
        } else if (i2 == this.buffer.length) {
            trieNode2 = this;
        } else if (i2 == trieNodeArr.length) {
            trieNode2 = new TrieNode<>(0, trieNodeArr, mutabilityOwnership);
        } else {
            Object[] copyOf = Arrays.copyOf(trieNodeArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            trieNode2 = new TrieNode<>(0, copyOf, mutabilityOwnership);
        }
        return trieNode2;
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
            return new TrieNode<>(0, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
        this.buffer = removeCellAtIndex2;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        int i2;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        TrieNode<E>[] trieNodeArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr = this.buffer;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 >= objArr.length) {
                break;
            }
            CommonFunctionsKt.m2010assert(i2 <= i3);
            int i5 = i2;
            if (trieNode.collisionContainsElement((E) objArr[i3])) {
                trieNodeArr[0 + i2] = objArr[i3];
                i5 = i2 + 1;
                CommonFunctionsKt.m2010assert(0 + i5 <= trieNodeArr.length);
            }
            i3++;
            i4 = i5;
        }
        deltaCounter.plusAssign(i2);
        if (i2 == 0) {
            trieNode = EMPTY;
        } else if (i2 == 1) {
            trieNode = trieNodeArr[0];
        } else if (i2 == this.buffer.length) {
            trieNode = this;
        } else if (i2 != trieNode.buffer.length) {
            if (i2 == trieNodeArr.length) {
                trieNode = new TrieNode<>(0, trieNodeArr, mutabilityOwnership);
            } else {
                Object[] copyOf = Arrays.copyOf(trieNodeArr, i2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                trieNode = new TrieNode<>(0, copyOf, mutabilityOwnership);
            }
        }
        return trieNode;
    }

    private final TrieNode<E> mutableMoveElementToNode(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy != mutabilityOwnership) {
            removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
            return new TrieNode<>(this.bitmap ^ i3, removeCellAtIndex, mutabilityOwnership);
        }
        removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
        this.buffer = removeCellAtIndex2;
        this.bitmap ^= i3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i2, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.buffer;
        TrieNode<E> trieNode2 = trieNode;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            trieNode2 = trieNode;
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode2 = r02;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i2] = trieNode2;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = trieNode2;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i2) {
        Object obj = this.buffer[i2];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
    }

    private final TrieNode<E> removeCellAtIndex(int i2, int i3) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
        return new TrieNode<>(this.bitmap ^ i3, removeCellAtIndex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v13 */
    private final TrieNode<E> updateNodeAtIndex(int i2, TrieNode<E> trieNode) {
        ?? r0 = trieNode.buffer;
        TrieNode<E> trieNode2 = trieNode;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            trieNode2 = trieNode;
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode2 = r02;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2] = trieNode2;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    @NotNull
    public final TrieNode<E> add(int i2, E e2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e2);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e2, obj) ? this : moveElementToNode(indexOfCellAt$runtime_release, i2, e2, i3);
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        TrieNode<E> collisionAdd = i3 == 30 ? nodeAtIndex.collisionAdd(e2) : nodeAtIndex.add(i2, e2, i3 + 5);
        return nodeAtIndex == collisionAdd ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, collisionAdd);
    }

    public final boolean contains(int i2, E e2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            return i3 == 30 ? nodeAtIndex.collisionContainsElement(e2) : nodeAtIndex.contains(i2, e2, i3 + 5);
        }
        return Intrinsics.areEqual(e2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull TrieNode<E> otherNode, int i2) {
        boolean z;
        boolean contains;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (i2 > 30) {
            Object[] objArr = otherNode.buffer;
            int length = objArr.length;
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= length) {
                    break;
                }
                Object obj = objArr[i3];
                i3++;
                contains = ArraysKt___ArraysKt.contains(getBuffer(), obj);
                if (!contains) {
                    z = false;
                    break;
                }
            }
            return z;
        }
        int i4 = this.bitmap;
        int i5 = otherNode.bitmap;
        int i6 = i4 & i5;
        int i7 = i6;
        if (i6 != i5) {
            return false;
        }
        while (i7 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i7);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = getBuffer()[indexOfCellAt$runtime_release];
            Object obj3 = otherNode.getBuffer()[indexOfCellAt$runtime_release2];
            boolean z2 = obj2 instanceof TrieNode;
            boolean z3 = obj3 instanceof TrieNode;
            if (z2 && z3) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                TrieNode trieNode = (TrieNode) obj2;
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                if (!trieNode.containsAll((TrieNode) obj3, i2 + 5)) {
                    return false;
                }
            } else if (z2) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                if (!((TrieNode) obj2).contains(obj3 == null ? 0 : obj3.hashCode(), obj3, i2 + 5)) {
                    return false;
                }
            } else if (z3 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i7 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i2) {
        return Integer.bitCount(this.bitmap & (i2 - 1));
    }

    @NotNull
    public final TrieNode<E> mutableAdd(int i2, E e2, int i3, @NotNull PersistentHashSetBuilder<?> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(indexSegment, e2, mutator.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            TrieNode<E> mutableCollisionAdd = i3 == 30 ? nodeAtIndex.mutableCollisionAdd(e2, mutator) : nodeAtIndex.mutableAdd(i2, e2, i3 + 5, mutator);
            return nodeAtIndex == mutableCollisionAdd ? this : mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableCollisionAdd, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.areEqual(e2, obj)) {
            return this;
        } else {
            mutator.setSize(mutator.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime_release, i2, e2, i3, mutator.getOwnership$runtime_release());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v36 */
    @NotNull
    public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int i2, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        TrieNode<E> trieNode2;
        TrieNode<E> trieNode3;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        } else if (i2 > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i3 = this.bitmap;
            int i4 = otherNode.bitmap | i3;
            TrieNode<E> trieNode4 = (i4 == i3 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime_release())) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], mutator.getOwnership$runtime_release());
            int i5 = 0;
            while (i4 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i4);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object[] buffer = trieNode4.getBuffer();
                if (hasNoCellAt(lowestOneBit)) {
                    trieNode2 = otherNode.getBuffer()[indexOfCellAt$runtime_release2];
                } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                    trieNode2 = getBuffer()[indexOfCellAt$runtime_release];
                } else {
                    trieNode2 = getBuffer()[indexOfCellAt$runtime_release];
                    E e2 = (E) otherNode.getBuffer()[indexOfCellAt$runtime_release2];
                    boolean z = trieNode2 instanceof TrieNode;
                    boolean z2 = e2 instanceof TrieNode;
                    if (z && z2) {
                        if (trieNode2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                        TrieNode trieNode5 = (TrieNode) trieNode2;
                        if (e2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                        trieNode2 = trieNode5.mutableAddAll((TrieNode) e2, i2 + 5, intersectionSizeRef, mutator);
                    } else if (z) {
                        if (trieNode2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                        TrieNode trieNode6 = (TrieNode) trieNode2;
                        int size = mutator.size();
                        TrieNode<E> mutableAdd = trieNode6.mutableAdd(e2 == null ? 0 : e2.hashCode(), e2, i2 + 5, mutator);
                        trieNode2 = mutableAdd;
                        if (mutator.size() == size) {
                            trieNode3 = mutableAdd;
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            trieNode2 = trieNode3;
                        }
                        Unit unit = Unit.INSTANCE;
                    } else if (z2) {
                        if (e2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                        TrieNode trieNode7 = (TrieNode) e2;
                        int size2 = mutator.size();
                        TrieNode<E> mutableAdd2 = trieNode7.mutableAdd(trieNode2 == null ? 0 : trieNode2.hashCode(), trieNode2, i2 + 5, mutator);
                        trieNode2 = mutableAdd2;
                        if (mutator.size() == size2) {
                            trieNode3 = mutableAdd2;
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            trieNode2 = trieNode3;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } else if (Intrinsics.areEqual(trieNode2, e2)) {
                        intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        trieNode2 = makeNode(trieNode2 == null ? 0 : trieNode2.hashCode(), trieNode2, e2 == null ? 0 : e2.hashCode(), e2, i2 + 5, mutator.getOwnership$runtime_release());
                    }
                }
                buffer[i5] = trieNode2;
                i5++;
                i4 ^= lowestOneBit;
            }
            if (elementsIdentityEquals(trieNode4)) {
                trieNode = this;
            } else {
                trieNode = trieNode4;
                if (otherNode.elementsIdentityEquals(trieNode4)) {
                    trieNode = otherNode;
                }
            }
            return trieNode;
        }
    }

    @NotNull
    public final TrieNode<E> mutableRemove(int i2, E e2, int i3, @NotNull PersistentHashSetBuilder<?> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            TrieNode<E> mutableCollisionRemove = i3 == 30 ? nodeAtIndex.mutableCollisionRemove(e2, mutator) : nodeAtIndex.mutableRemove(i2, e2, i3 + 5, mutator);
            return (this.ownedBy == mutator.getOwnership$runtime_release() || nodeAtIndex != mutableCollisionRemove) ? mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableCollisionRemove, mutator.getOwnership$runtime_release()) : this;
        }
        TrieNode<E> trieNode = this;
        if (Intrinsics.areEqual(e2, obj)) {
            mutator.setSize(mutator.size() - 1);
            trieNode = mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        }
        return trieNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d9, code lost:
        if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r0).contains(r0 == null ? 0 : r0.hashCode(), r0, r10 + 5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f5, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
        r11.plusAssign(1);
        r17 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.EMPTY;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v96, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object[]] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r9, int r10, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r11, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r12) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0194, code lost:
        if (((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) r24).contains(r0 == null ? 0 : r0.hashCode(), r0, r10 + 5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01af, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r24) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b2, code lost:
        r11.plusAssign(1);
        r24 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v92, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object[]] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRetainAll(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r9, int r10, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r11, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r12) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    @NotNull
    public final TrieNode<E> remove(int i2, E e2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            TrieNode<E> collisionRemove = i3 == 30 ? nodeAtIndex.collisionRemove(e2) : nodeAtIndex.remove(i2, e2, i3 + 5);
            return nodeAtIndex == collisionRemove ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, collisionRemove);
        }
        TrieNode<E> trieNode = this;
        if (Intrinsics.areEqual(e2, obj)) {
            trieNode = removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
        }
        return trieNode;
    }

    public final void setBitmap(int i2) {
        this.bitmap = i2;
    }

    public final void setBuffer(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }
}
