package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0003\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018��2\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020��2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR1\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lj/d0;", "", "Lj/r;", "cont", "", "cause", "", "i", "a", "Lj/o;", "b", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lj/o;", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Throwable;", "h", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lj/o;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/d0.class */
public final class d0 {
    @JvmField
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Object f453a;
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final o f454b;
    @JvmField
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Function1<Throwable, Unit> f455c;
    @JvmField
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Object f456d;
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f457e;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@Nullable Object obj, @Nullable o oVar, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.f453a = obj;
        this.f454b = oVar;
        this.f455c = function1;
        this.f456d = obj2;
        this.f457e = th;
    }

    public /* synthetic */ d0(Object obj, o oVar, Function1 function1, Object obj2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? null : oVar, (i2 & 4) != 0 ? null : function1, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ d0 g(d0 d0Var, Object obj, o oVar, Function1 function1, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = d0Var.f453a;
        }
        if ((i2 & 2) != 0) {
            oVar = d0Var.f454b;
        }
        if ((i2 & 4) != 0) {
            function1 = d0Var.f455c;
        }
        if ((i2 & 8) != 0) {
            obj2 = d0Var.f456d;
        }
        if ((i2 & 16) != 0) {
            th = d0Var.f457e;
        }
        return d0Var.f(obj, oVar, function1, obj2, th);
    }

    @Nullable
    public final Object a() {
        return this.f453a;
    }

    @Nullable
    public final o b() {
        return this.f454b;
    }

    @Nullable
    public final Function1<Throwable, Unit> c() {
        return this.f455c;
    }

    @Nullable
    public final Object d() {
        return this.f456d;
    }

    @Nullable
    public final Throwable e() {
        return this.f457e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return Intrinsics.areEqual(this.f453a, d0Var.f453a) && Intrinsics.areEqual(this.f454b, d0Var.f454b) && Intrinsics.areEqual(this.f455c, d0Var.f455c) && Intrinsics.areEqual(this.f456d, d0Var.f456d) && Intrinsics.areEqual(this.f457e, d0Var.f457e);
        }
        return false;
    }

    @NotNull
    public final d0 f(@Nullable Object obj, @Nullable o oVar, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        return new d0(obj, oVar, function1, obj2, th);
    }

    public final boolean h() {
        return this.f457e != null;
    }

    public int hashCode() {
        Object obj = this.f453a;
        int i2 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        o oVar = this.f454b;
        int hashCode2 = oVar == null ? 0 : oVar.hashCode();
        Function1<Throwable, Unit> function1 = this.f455c;
        int hashCode3 = function1 == null ? 0 : function1.hashCode();
        Object obj2 = this.f456d;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.f457e;
        if (th != null) {
            i2 = th.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final void i(@NotNull r<?> rVar, @NotNull Throwable th) {
        o oVar = this.f454b;
        if (oVar != null) {
            rVar.m(oVar, th);
        }
        Function1<Throwable, Unit> function1 = this.f455c;
        if (function1 != null) {
            rVar.p(function1, th);
        }
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f453a + ", cancelHandler=" + this.f454b + ", onCancellation=" + this.f455c + ", idempotentResume=" + this.f456d + ", cancelCause=" + this.f457e + ')';
    }
}
