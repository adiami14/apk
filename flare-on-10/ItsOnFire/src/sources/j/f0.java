package j;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018��2\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020��2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lj/f0;", "", "a", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "b", "result", "onCancellation", "c", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:j/f0.class */
public final class f0 {
    @JvmField
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Object f479a;
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Function1<Throwable, Unit> f480b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        this.f479a = obj;
        this.f480b = function1;
    }

    public static /* synthetic */ f0 d(f0 f0Var, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = f0Var.f479a;
        }
        if ((i2 & 2) != 0) {
            function1 = f0Var.f480b;
        }
        return f0Var.c(obj, function1);
    }

    @Nullable
    public final Object a() {
        return this.f479a;
    }

    @NotNull
    public final Function1<Throwable, Unit> b() {
        return this.f480b;
    }

    @NotNull
    public final f0 c(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        return new f0(obj, function1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return Intrinsics.areEqual(this.f479a, f0Var.f479a) && Intrinsics.areEqual(this.f480b, f0Var.f480b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f479a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f480b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f479a + ", onCancellation=" + this.f480b + ')';
    }
}
