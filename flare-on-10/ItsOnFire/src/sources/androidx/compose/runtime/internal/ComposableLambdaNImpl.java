package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Stable
@Metadata(d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010��\n\u0002\b\u0004\n\u0002\u0018\u0002\n��\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018��2\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0013\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n��R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "key", "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/internal/ComposableLambdaNImpl.class */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    @Nullable
    private Object _block;
    private final int arity;
    private final int key;
    @Nullable
    private RecomposeScope scope;
    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i2, boolean z, int i3) {
        this.key = i2;
        this.tracked = z;
        this.arity = i3;
    }

    private final int realParamCount(int i2) {
        int i3 = (i2 - 1) - 1;
        for (int i4 = 1; i4 * 10 < i3; i4++) {
            i3--;
        }
        return i3;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        ArrayList arrayList;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list != null) {
            int i2 = 0;
            int size = list.size();
            while (true) {
                arrayList = list;
                if (i2 >= size) {
                    break;
                } else if (ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                    list.set(i2, recomposeScope);
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            arrayList = new ArrayList();
            this.scopes = arrayList;
        }
        arrayList.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN
    @Nullable
    public Object invoke(@NotNull final Object... args) {
        IntRange until;
        List slice;
        Intrinsics.checkNotNullParameter(args, "args");
        final int realParamCount = realParamCount(args.length);
        Object obj = args[realParamCount];
        if (obj != null) {
            Composer composer = (Composer) obj;
            until = RangesKt___RangesKt.until(0, args.length - 1);
            slice = ArraysKt___ArraysKt.slice(args, until);
            Object[] array = slice.toArray(new Object[0]);
            if (array != null) {
                Object obj2 = args[args.length - 1];
                if (obj2 != null) {
                    int intValue = ((Integer) obj2).intValue();
                    Composer startRestartGroup = composer.startRestartGroup(this.key);
                    trackRead(startRestartGroup);
                    int differentBits = startRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(realParamCount) : ComposableLambdaKt.sameBits(realParamCount);
                    Object obj3 = this._block;
                    if (obj3 != null) {
                        FunctionN functionN = (FunctionN) obj3;
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        spreadBuilder.addSpread(array);
                        spreadBuilder.add(Integer.valueOf(intValue | differentBits));
                        Object invoke = functionN.invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$invoke$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull Composer nc, int i2) {
                                    IntRange until2;
                                    List slice2;
                                    IntRange until3;
                                    List slice3;
                                    Intrinsics.checkNotNullParameter(nc, "nc");
                                    Object[] objArr = args;
                                    until2 = RangesKt___RangesKt.until(0, realParamCount);
                                    slice2 = ArraysKt___ArraysKt.slice(objArr, until2);
                                    Object[] array2 = slice2.toArray(new Object[0]);
                                    if (array2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    }
                                    Object obj4 = args[realParamCount + 1];
                                    if (obj4 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                    }
                                    int intValue2 = ((Integer) obj4).intValue();
                                    Object[] objArr2 = args;
                                    until3 = RangesKt___RangesKt.until(realParamCount + 2, objArr2.length);
                                    slice3 = ArraysKt___ArraysKt.slice(objArr2, until3);
                                    Object[] array3 = slice3.toArray(new Object[0]);
                                    if (array3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    }
                                    ComposableLambdaNImpl composableLambdaNImpl = this;
                                    SpreadBuilder spreadBuilder2 = new SpreadBuilder(4);
                                    spreadBuilder2.addSpread(array2);
                                    spreadBuilder2.add(nc);
                                    spreadBuilder2.add(Integer.valueOf(intValue2 | 1));
                                    spreadBuilder2.addSpread(array3);
                                    composableLambdaNImpl.invoke(spreadBuilder2.toArray(new Object[spreadBuilder2.size()]));
                                }
                            });
                        }
                        return invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.Composer");
    }

    public final void update(@NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (Intrinsics.areEqual(block, this._block)) {
            return;
        }
        boolean z = this._block == null;
        this._block = (FunctionN) block;
        if (z) {
            return;
        }
        trackWrite();
    }
}
