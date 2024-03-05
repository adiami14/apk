package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Stable
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u000e\n��\b\u0007\u0018��2\u00020\u0001Bp\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001��¢\u0006\u0002\u0010\u0011J\u0095\u0001\u0010>\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001��ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020BH\u0016R4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R4\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R4\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R4\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R4\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R4\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R4\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0018\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R4\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001��ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/material/Colors;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "isLight", "", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material_release", "error$delegate", "()Z", "setLight$material_release", "(Z)V", "isLight$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "onError$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "onPrimary$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "onSecondary$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "onSurface$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material_release", "primary$delegate", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "primaryVariant$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "secondary$delegate", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "secondaryVariant$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "surface$delegate", "copy", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/material/Colors.class */
public final class Colors {
    @NotNull
    private final MutableState background$delegate;
    @NotNull
    private final MutableState error$delegate;
    @NotNull
    private final MutableState isLight$delegate;
    @NotNull
    private final MutableState onBackground$delegate;
    @NotNull
    private final MutableState onError$delegate;
    @NotNull
    private final MutableState onPrimary$delegate;
    @NotNull
    private final MutableState onSecondary$delegate;
    @NotNull
    private final MutableState onSurface$delegate;
    @NotNull
    private final MutableState primary$delegate;
    @NotNull
    private final MutableState primaryVariant$delegate;
    @NotNull
    private final MutableState secondary$delegate;
    @NotNull
    private final MutableState secondaryVariant$delegate;
    @NotNull
    private final MutableState surface$delegate;

    private Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m2404boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ Colors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z);
    }

    /* renamed from: copy-pvPzIIM$default  reason: not valid java name */
    public static /* synthetic */ Colors m1219copypvPzIIM$default(Colors colors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = colors.m1228getPrimary0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            j3 = colors.m1229getPrimaryVariant0d7_KjU();
        }
        if ((i2 & 4) != 0) {
            j4 = colors.m1230getSecondary0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j5 = colors.m1231getSecondaryVariant0d7_KjU();
        }
        if ((i2 & 16) != 0) {
            j6 = colors.m1221getBackground0d7_KjU();
        }
        if ((i2 & 32) != 0) {
            j7 = colors.m1232getSurface0d7_KjU();
        }
        if ((i2 & 64) != 0) {
            j8 = colors.m1222getError0d7_KjU();
        }
        if ((i2 & 128) != 0) {
            j9 = colors.m1225getOnPrimary0d7_KjU();
        }
        if ((i2 & 256) != 0) {
            j10 = colors.m1226getOnSecondary0d7_KjU();
        }
        if ((i2 & 512) != 0) {
            j11 = colors.m1223getOnBackground0d7_KjU();
        }
        if ((i2 & 1024) != 0) {
            j12 = colors.m1227getOnSurface0d7_KjU();
        }
        if ((i2 & 2048) != 0) {
            j13 = colors.m1224getOnError0d7_KjU();
        }
        if ((i2 & 4096) != 0) {
            z = colors.isLight();
        }
        return colors.m1220copypvPzIIM(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z);
    }

    @NotNull
    /* renamed from: copy-pvPzIIM  reason: not valid java name */
    public final Colors m1220copypvPzIIM(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, null);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m1221getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m1222getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m1223getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m1224getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m1225getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m1226getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1227getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m1228getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getPrimaryVariant-0d7_KjU  reason: not valid java name */
    public final long m1229getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m1230getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getSecondaryVariant-0d7_KjU  reason: not valid java name */
    public final long m1231getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m2424unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m1232getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m2424unboximpl();
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release  reason: not valid java name */
    public final void m1233setBackground8_81llA$material_release(long j2) {
        this.background$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setError-8_81llA$material_release  reason: not valid java name */
    public final void m1234setError8_81llA$material_release(long j2) {
        this.error$delegate.setValue(Color.m2404boximpl(j2));
    }

    public final void setLight$material_release(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setOnBackground-8_81llA$material_release  reason: not valid java name */
    public final void m1235setOnBackground8_81llA$material_release(long j2) {
        this.onBackground$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setOnError-8_81llA$material_release  reason: not valid java name */
    public final void m1236setOnError8_81llA$material_release(long j2) {
        this.onError$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m1237setOnPrimary8_81llA$material_release(long j2) {
        this.onPrimary$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m1238setOnSecondary8_81llA$material_release(long j2) {
        this.onSecondary$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setOnSurface-8_81llA$material_release  reason: not valid java name */
    public final void m1239setOnSurface8_81llA$material_release(long j2) {
        this.onSurface$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m1240setPrimary8_81llA$material_release(long j2) {
        this.primary$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m1241setPrimaryVariant8_81llA$material_release(long j2) {
        this.primaryVariant$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m1242setSecondary8_81llA$material_release(long j2) {
        this.secondary$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m1243setSecondaryVariant8_81llA$material_release(long j2) {
        this.secondaryVariant$delegate.setValue(Color.m2404boximpl(j2));
    }

    /* renamed from: setSurface-8_81llA$material_release  reason: not valid java name */
    public final void m1244setSurface8_81llA$material_release(long j2) {
        this.surface$delegate.setValue(Color.m2404boximpl(j2));
    }

    @NotNull
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m2422toStringimpl(m1228getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m2422toStringimpl(m1229getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m2422toStringimpl(m1230getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m2422toStringimpl(m1231getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m2422toStringimpl(m1221getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m2422toStringimpl(m1232getSurface0d7_KjU())) + ", error=" + ((Object) Color.m2422toStringimpl(m1222getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m2422toStringimpl(m1225getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m2422toStringimpl(m1226getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m2422toStringimpl(m1223getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m2422toStringimpl(m1227getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m2422toStringimpl(m1224getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }
}
