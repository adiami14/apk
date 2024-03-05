package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010��\n\u0002\b\u000f\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b��\u0018��2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020.J\u0015\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H��¢\u0006\u0002\b3JW\u0010/\u001a\u0002002\u0006\u0010)\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH��¢\u0006\u0004\b3\u00105J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030:H\u0096\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u0006\u0010=\u001a\u000202J\u0006\u0010>\u001a\u000204J\u000e\u0010?\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0007J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001507H\u0002J:\u0010A\u001a\u0002HB\"\u0004\b��\u0010B2!\u0010C\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(1\u0012\u0004\u0012\u0002HB0DH\u0086\bø\u0001��¢\u0006\u0002\u0010GJO\u0010H\u001a\u0002002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH��¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e072\u0006\u0010L\u001a\u00020\u0015H��¢\u0006\u0002\bMJ\u0006\u0010N\u001a\u000200J:\u0010O\u001a\u0002HB\"\u0004\b��\u0010B2!\u0010C\u001a\u001d\u0012\u0013\u0012\u001104¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b()\u0012\u0004\u0012\u0002HB0DH\u0086\bø\u0001��¢\u0006\u0002\u0010GJ \u0010P\u001a\u00020\u0015*\u00060Qj\u0002`R2\u0006\u0010S\u001a\u00020\u00152\u0006\u0010T\u001a\u00020\u0015H\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n��R0\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n��\u001a\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n��\u001a\u0004\b*\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchorIndex", "anchor", "asString", "", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "dataIndexes", "", "groupSizes", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "slotsOf", "group", "slotsOf$runtime_release", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.LEVEL, "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/SlotTable.class */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;
    @NotNull
    private int[] groups = new int[0];
    @NotNull
    private Object[] slots = new Object[0];
    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01b3 A[LOOP:2: B:37:0x01aa->B:39:0x01b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int emitGroup(java.lang.StringBuilder r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.emitGroup(java.lang.StringBuilder, int, int):int");
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i2) {
        return i2 >= slotTable.groupsSize ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i2);
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    private static final int verifyWellFormed$validateGroup(Ref.IntRef intRef, SlotTable slotTable, int i2, int i3) {
        int i4;
        int i5 = intRef.element;
        int i6 = i5 + 1;
        intRef.element = i6;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i5);
        if ((access$parentAnchor == i2 ? 1 : null) == null) {
            throw new IllegalStateException(("Invalid parent index detected at " + i5 + ", expected parent index to be " + i2 + " found " + access$parentAnchor).toString());
        }
        int access$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i5) + i5;
        if ((access$groupSize <= slotTable.groupsSize ? 1 : null) != null) {
            if ((access$groupSize <= i3 ? 1 : null) != null) {
                int access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i5);
                int access$dataAnchor2 = i5 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i6);
                if ((access$dataAnchor2 <= slotTable.slots.length ? 1 : null) == null) {
                    throw new IllegalStateException(("Slots for " + i5 + " extend past the end of the slot table").toString());
                }
                if ((access$dataAnchor <= access$dataAnchor2 ? 1 : null) != null) {
                    if ((SlotTableKt.access$slotAnchor(slotTable.groups, i5) <= access$dataAnchor2 ? 1 : null) != null) {
                        if ((access$dataAnchor2 - access$dataAnchor >= ((SlotTableKt.access$isNode(slotTable.groups, i5) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i5) ? 1 : 0)) + (SlotTableKt.access$hasAux(slotTable.groups, i5) ? 1 : 0) ? 1 : null) != null) {
                            boolean access$isNode = SlotTableKt.access$isNode(slotTable.groups, i5);
                            if (((access$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i5)] == null) ? null : 1) != null) {
                                int i7 = 0;
                                while (true) {
                                    i4 = i7;
                                    if (intRef.element >= access$groupSize) {
                                        break;
                                    }
                                    i7 = i4 + verifyWellFormed$validateGroup(intRef, slotTable, i5, access$groupSize);
                                }
                                int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i5);
                                int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i5);
                                if ((access$nodeCount == i4 ? 1 : null) == null) {
                                    throw new IllegalStateException(("Incorrect node count detected at " + i5 + ", expected " + access$nodeCount + ", received " + i4).toString());
                                }
                                int i8 = intRef.element - i5;
                                Object[] objArr = null;
                                if (access$groupSize2 == i8) {
                                    objArr = 1;
                                }
                                if (objArr != null) {
                                    if (access$isNode) {
                                        i4 = 1;
                                    }
                                    return i4;
                                }
                                throw new IllegalStateException(("Incorrect slot count detected at " + i5 + ", expected " + access$groupSize2 + ", received " + i8).toString());
                            }
                            throw new IllegalStateException(Intrinsics.stringPlus("No node recorded for a node group at ", Integer.valueOf(i5)).toString());
                        }
                        throw new IllegalStateException(Intrinsics.stringPlus("Not enough slots added for group ", Integer.valueOf(i5)).toString());
                    }
                    throw new IllegalStateException(Intrinsics.stringPlus("Slots start out of range at ", Integer.valueOf(i5)).toString());
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Invalid data anchor at ", Integer.valueOf(i5)).toString());
            }
            throw new IllegalStateException(Intrinsics.stringPlus("A group extends past its parent group at ", Integer.valueOf(i5)).toString());
        }
        throw new IllegalStateException(Intrinsics.stringPlus("A group extends past the end of the table at ", Integer.valueOf(i5)).toString());
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (anchor.getValid()) {
            return anchor.getLocation$runtime_release();
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    @NotNull
    public final String asString() {
        String sb;
        if (this.writer) {
            sb = super.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append('\n');
            int groupsSize = getGroupsSize();
            if (groupsSize > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= groupsSize) {
                        break;
                    }
                    i2 = i3 + emitGroup(sb2, i3, 0);
                }
            } else {
                sb2.append("<EMPTY>");
            }
            sb = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
        }
        return sb;
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (!(reader.getTable$runtime_release() == this && this.readers > 0)) {
            throw new IllegalArgumentException("Unexpected reader close()".toString());
        }
        this.readers--;
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int i2, @NotNull Object[] slots, int i3, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (!(writer.getTable$runtime_release() == this && this.writer)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(groups, i2, slots, i3, anchors);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.readers <= 0)) {
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if ((r0 >= 0 && kotlin.jvm.internal.Intrinsics.areEqual(getAnchors$runtime_release().get(r0), r5)) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ownsAnchor(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Anchor r5) {
        /*
            r4 = this;
            r0 = r5
            java.lang.String r1 = "anchor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            boolean r0 = r0.getValid()
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L49
            r0 = r4
            java.util.ArrayList<androidx.compose.runtime.Anchor> r0 = r0.anchors
            r1 = r5
            int r1 = r1.getLocation$runtime_release()
            r2 = r4
            int r2 = r2.groupsSize
            int r0 = androidx.compose.runtime.SlotTableKt.access$search(r0, r1, r2)
            r8 = r0
            r0 = r8
            if (r0 < 0) goto L3e
            r0 = r4
            java.util.ArrayList r0 = r0.getAnchors$runtime_release()
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            r1 = r5
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            r0 = 1
            r8 = r0
            goto L41
        L3e:
            r0 = 0
            r8 = r0
        L41:
            r0 = r8
            if (r0 == 0) goto L49
            goto L4b
        L49:
            r0 = 0
            r7 = r0
        L4b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.ownsAnchor(androidx.compose.runtime.Anchor):boolean");
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotReader openReader = openReader();
        try {
            T invoke = block.invoke(openReader);
            InlineMarker.finallyStart(1);
            openReader.close();
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            openReader.close();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int i2, @NotNull Object[] slots, int i3, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = i2;
        this.slots = slots;
        this.slotsSize = i3;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i2) {
        this.version = i2;
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int i2) {
        List list;
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, i2);
        int i3 = i2 + 1;
        int access$dataAnchor2 = i3 < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i3) : this.slots.length;
        list = ArraysKt___ArraysKt.toList(this.slots);
        return list.subList(access$dataAnchor, access$dataAnchor2);
    }

    public final void verifyWellFormed() {
        int i2;
        int i3;
        Ref.IntRef intRef = new Ref.IntRef();
        int i4 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i2 = intRef.element;
                i3 = this.groupsSize;
                if (i2 >= i3) {
                    break;
                }
                verifyWellFormed$validateGroup(intRef, this, -1, i2 + SlotTableKt.access$groupSize(this.groups, i2));
            }
            if (!(i2 == i3)) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + getGroupsSize()).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            int indexFor = arrayList.get(i5).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= getGroupsSize())) {
                throw new IllegalArgumentException("Location out of bound".toString());
            }
            if (!(i4 < indexFor)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            i4 = indexFor;
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotWriter openWriter = openWriter();
        try {
            T invoke = block.invoke(openWriter);
            InlineMarker.finallyStart(1);
            openWriter.close();
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            openWriter.close();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
