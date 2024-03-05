package j;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018�� \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020��2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lj/s0;", "Lj/s3;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "toString", "Lkotlin/coroutines/CoroutineContext;", "context", "y", "oldState", "", "w", "", "q", "id", "s", "", "hashCode", "", "other", "", "equals", "j", "J", "v", "()J", "<init>", "(J)V", "k", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
/* loaded from: ItsOnFire.jar:j/s0.class */
public final class s0 extends AbstractCoroutineContextElement implements s3<String> {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f554k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public final long f555j;

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj/s0$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lj/s0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:j/s0$a.class */
    public static final class a implements CoroutineContext.Key<s0> {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public s0(long j2) {
        super(f554k);
        this.f555j = j2;
    }

    public static /* synthetic */ s0 t(s0 s0Var, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = s0Var.f555j;
        }
        return s0Var.s(j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.f555j == ((s0) obj).f555j;
    }

    public int hashCode() {
        return Long.hashCode(this.f555j);
    }

    public final long q() {
        return this.f555j;
    }

    @NotNull
    public final s0 s(long j2) {
        return new s0(j2);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.f555j + ')';
    }

    public final long v() {
        return this.f555j;
    }

    @Override // j.s3
    /* renamed from: w */
    public void K(@NotNull CoroutineContext coroutineContext, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 == null) goto L11;
     */
    @Override // j.s3
    @org.jetbrains.annotations.NotNull
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Y(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r8) {
        /*
            r7 = this;
            r0 = r8
            j.t0$a r1 = j.t0.f557k
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            j.t0 r0 = (j.t0) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L1c
            r0 = r8
            java.lang.String r0 = r0.v()
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L1f
        L1c:
            java.lang.String r0 = "coroutine"
            r8 = r0
        L1f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            java.lang.String r1 = " @"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            int r0 = kotlin.text.StringsKt.lastIndexOf$default(r0, r1, r2, r3, r4, r5)
            r11 = r0
            r0 = r11
            r12 = r0
            r0 = r11
            if (r0 >= 0) goto L44
            r0 = r9
            int r0 = r0.length()
            r12 = r0
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r8
            int r2 = r2.length()
            r3 = r12
            int r2 = r2 + r3
            r3 = 10
            int r2 = r2 + r3
            r1.<init>(r2)
            r13 = r0
            r0 = r9
            r1 = 0
            r2 = r12
            java.lang.String r0 = r0.substring(r1, r2)
            r14 = r0
            r0 = r14
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r13
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            java.lang.String r1 = " @"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            r1 = 35
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            r1 = r7
            long r1 = r1.f555j
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r13
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r10
            r1 = r8
            r0.setName(r1)
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.s0.Y(kotlin.coroutines.CoroutineContext):java.lang.String");
    }
}
