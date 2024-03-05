package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b��\u0018�� }*\u0004\b��\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002}~B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0091\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0014H��¢\u0006\u0002\b\u001aJ\u009c\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u001cH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010\u001cH\u0002JO\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028��2\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0002J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00028��H\u0002¢\u0006\u0002\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010)\u001a\u00028��H\u0002¢\u0006\u0002\u0010,J+\u0010-\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010/J#\u00100\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010)\u001a\u00028��H\u0002¢\u0006\u0002\u00101J+\u00100\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00104\u001a\u00020\u0005H\u0002J#\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u00107J\u001c\u00108\u001a\u00020(2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��H\u0002J\r\u0010:\u001a\u00020\u0005H��¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H��¢\u0006\u0002\b=J%\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010?J\u0015\u0010@\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H��¢\u0006\u0002\bAJ\u0010\u0010B\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H\u0002J1\u0010C\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010DJ\u0015\u0010E\u001a\u00028��2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010FJ[\u0010G\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00028��2\u0006\u0010J\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00028��2\u0006\u0010M\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010NJI\u0010O\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028��2\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010PJ=\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010TJ8\u0010U\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010V\u001a\u00020W2\u0006\u0010$\u001a\u00020\u000bH\u0002J?\u0010X\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010TJ7\u0010X\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010)\u001a\u00028��2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010YJ2\u0010Z\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00104\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002J9\u0010[\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\\JQ\u0010]\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028��2\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010^JK\u0010_\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010`JJ\u0010a\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010V\u001a\u00020W2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SJT\u0010b\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010V\u001a\u00020W2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002JM\u0010c\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010`JE\u0010c\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010dJ:\u0010e\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002J.\u0010f\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002JX\u0010h\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002J8\u0010k\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010$\u001a\u00020\u000bH\u0002J=\u0010l\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010mJ!\u0010n\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010g\u001a\u00020\u0005H��¢\u0006\u0002\boJ\u0015\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H��¢\u0006\u0002\bpJ9\u0010q\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010rJ9\u0010s\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010tJ1\u0010s\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028��2\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010uJ&\u0010v\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J&\u0010w\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002JP\u0010x\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0018\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J8\u0010y\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��H\u0002J)\u0010z\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u00010��2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010{J\u0015\u0010|\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010FR0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n��R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n��¨\u0006\u007f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "dataMap", "", "nodeMap", "buffer", "", "(II[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "<set-?>", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "accept", "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "shift", "hash", "accept$runtime_release", "asInsertResult", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "bufferMoveEntryToNode", "keyIndex", "positionMask", "newKeyHash", "newKey", "newValue", "owner", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "calculateSize", "collisionContainsKey", "", "key", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "i", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", "elementsIdentityEquals", "otherNode", "entryCount", "entryCount$runtime_release", "entryKeyIndex", "entryKeyIndex$runtime_release", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "hasEntryAt", "hasEntryAt$runtime_release", "hasNodeAt", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyAtIndex", "(I)Ljava/lang/Object;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPut", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAll", "mutablePutAllFromOtherNodeCell", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveEntryAtIndex", "mutableRemoveNodeAtIndex", "nodeIndex", "mutableReplaceNode", "targetNode", "newNode", "mutableUpdateNodeAtIndex", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "nodeAtIndex$runtime_release", "nodeIndex$runtime_release", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "remove", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "removeNodeAtIndex", "replaceNode", "updateNodeAtIndex", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "valueAtKeyIndex", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode.class */
public final class TrieNode<K, V> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);
    @NotNull
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    @Nullable
    private final MutabilityOwnership ownedBy;

    @Metadata(d1 = {"��\u0018\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion.class */
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

    @Metadata(d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n��\b��\u0018��*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJD\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030��2*\u0010\u0010\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bø\u0001��R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult.class */
    public static final class ModificationResult<K, V> {
        @NotNull
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> node, int i2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.sizeDelta = i2;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
            this.node = trieNode;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i2, int i3, @NotNull Object[] buffer) {
        this(i2, i3, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    public TrieNode(int i2, int i3, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.dataMap = i2;
        this.nodeMap = i3;
        this.ownedBy = mutabilityOwnership;
        this.buffer = buffer;
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5, int i2, int i3) {
        function5.invoke(this, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i4 = this.nodeMap;
        while (true) {
            int i5 = i4;
            if (i5 == 0) {
                return;
            }
            int lowestOneBit = Integer.lowestOneBit(i5);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(function5, (Integer.numberOfTrailingZeros(lowestOneBit) << i3) + i2, i3 + 5);
            i4 = i5 - lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5, MutabilityOwnership mutabilityOwnership) {
        K keyAtIndex = keyAtIndex(i2);
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i2, nodeIndex$runtime_release(i3) + 1, makeNode(keyAtIndex == null ? 0 : keyAtIndex.hashCode(), keyAtIndex, valueAtKeyIndex(i2), i4, k2, v2, i5 + 5, mutabilityOwnership));
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += nodeAtIndex$runtime_release(i2).calculateSize();
        }
        return bitCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 > r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean collisionContainsKey(K r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r6 = r0
            r0 = r6
            int r0 = r0.getFirst()
            r7 = r0
            r0 = r6
            int r0 = r0.getLast()
            r8 = r0
            r0 = r6
            int r0 = r0.getStep()
            r9 = r0
            r0 = r9
            if (r0 <= 0) goto L2d
            r0 = r7
            r10 = r0
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L3b
        L2d:
            r0 = r9
            if (r0 >= 0) goto L5f
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L5f
            r0 = r7
            r10 = r0
        L3b:
            r0 = r5
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            r2 = r10
            r1 = r1[r2]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4b
            r0 = 1
            return r0
        L4b:
            r0 = r10
            r1 = r8
            if (r0 != r1) goto L55
            goto L5f
        L55:
            r0 = r10
            r1 = r9
            int r0 = r0 + r1
            r10 = r0
            goto L3b
        L5f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.collisionContainsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 > r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final V collisionGet(K r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r6 = r0
            r0 = r6
            int r0 = r0.getFirst()
            r7 = r0
            r0 = r6
            int r0 = r0.getLast()
            r8 = r0
            r0 = r6
            int r0 = r0.getStep()
            r9 = r0
            r0 = r9
            if (r0 <= 0) goto L2d
            r0 = r7
            r10 = r0
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L3b
        L2d:
            r0 = r9
            if (r0 >= 0) goto L63
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L63
            r0 = r7
            r10 = r0
        L3b:
            r0 = r5
            r1 = r4
            r2 = r10
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4f
            r0 = r4
            r1 = r10
            java.lang.Object r0 = r0.valueAtKeyIndex(r1)
            return r0
        L4f:
            r0 = r10
            r1 = r8
            if (r0 != r1) goto L59
            goto L63
        L59:
            r0 = r10
            r1 = r9
            int r0 = r0 + r1
            r10 = r0
            goto L3b
        L63:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.collisionGet(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r0 > r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> collisionPut(K r10, V r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = r9
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r12 = r0
            r0 = r12
            int r0 = r0.getFirst()
            r13 = r0
            r0 = r12
            int r0 = r0.getLast()
            r14 = r0
            r0 = r12
            int r0 = r0.getStep()
            r15 = r0
            r0 = r15
            if (r0 <= 0) goto L30
            r0 = r13
            r16 = r0
            r0 = r13
            r1 = r14
            if (r0 <= r1) goto L40
        L30:
            r0 = r15
            if (r0 >= 0) goto L95
            r0 = r14
            r1 = r13
            if (r0 > r1) goto L95
            r0 = r13
            r16 = r0
        L40:
            r0 = r10
            r1 = r9
            r2 = r16
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L81
            r0 = r11
            r1 = r9
            r2 = r16
            java.lang.Object r1 = r1.valueAtKeyIndex(r2)
            if (r0 != r1) goto L59
            r0 = 0
            return r0
        L59:
            r0 = r9
            java.lang.Object[] r0 = r0.buffer
            r10 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r10
            r1 = r16
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            r0[r1] = r2
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = r10
            r1.<init>(r2, r3, r4)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult r0 = r0.asUpdateResult()
            return r0
        L81:
            r0 = r16
            r1 = r14
            if (r0 != r1) goto L8b
            goto L95
        L8b:
            r0 = r16
            r1 = r15
            int r0 = r0 + r1
            r16 = r0
            goto L40
        L95:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = r9
            java.lang.Object[] r4 = r4.buffer
            r5 = 0
            r6 = r10
            r7 = r11
            java.lang.Object[] r4 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$insertEntryAtIndex(r4, r5, r6, r7)
            r1.<init>(r2, r3, r4)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult r0 = r0.asInsertResult()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.collisionPut(java.lang.Object, java.lang.Object):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 > r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> collisionRemove(K r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r6 = r0
            r0 = r6
            int r0 = r0.getFirst()
            r7 = r0
            r0 = r6
            int r0 = r0.getLast()
            r8 = r0
            r0 = r6
            int r0 = r0.getStep()
            r9 = r0
            r0 = r9
            if (r0 <= 0) goto L2d
            r0 = r7
            r10 = r0
            r0 = r7
            r1 = r8
            if (r0 <= r1) goto L3b
        L2d:
            r0 = r9
            if (r0 >= 0) goto L63
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L63
            r0 = r7
            r10 = r0
        L3b:
            r0 = r5
            r1 = r4
            r2 = r10
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4f
            r0 = r4
            r1 = r10
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.collisionRemoveEntryAtIndex(r1)
            return r0
        L4f:
            r0 = r10
            r1 = r8
            if (r0 != r1) goto L59
            goto L63
        L59:
            r0 = r10
            r1 = r9
            int r0 = r0 + r1
            r10 = r0
            goto L3b
        L63:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.collisionRemove(java.lang.Object):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r0 > r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> collisionRemove(K r5, V r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r7 = r0
            r0 = r7
            int r0 = r0.getFirst()
            r8 = r0
            r0 = r7
            int r0 = r0.getLast()
            r9 = r0
            r0 = r7
            int r0 = r0.getStep()
            r10 = r0
            r0 = r10
            if (r0 <= 0) goto L30
            r0 = r8
            r11 = r0
            r0 = r8
            r1 = r9
            if (r0 <= r1) goto L40
        L30:
            r0 = r10
            if (r0 >= 0) goto L75
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L75
            r0 = r8
            r11 = r0
        L40:
            r0 = r5
            r1 = r4
            r2 = r11
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L61
            r0 = r6
            r1 = r4
            r2 = r11
            java.lang.Object r1 = r1.valueAtKeyIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L61
            r0 = r4
            r1 = r11
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.collisionRemoveEntryAtIndex(r1)
            return r0
        L61:
            r0 = r11
            r1 = r9
            if (r0 != r1) goto L6b
            goto L75
        L6b:
            r0 = r11
            r1 = r10
            int r0 = r0 + r1
            r11 = r0
            goto L40
        L75:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.collisionRemove(java.lang.Object, java.lang.Object):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr, i2));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap == trieNode.nodeMap && this.dataMap == trieNode.dataMap) {
            int length = this.buffer.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.buffer[i2] != trieNode.buffer[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean hasNodeAt(int i2) {
        return (this.nodeMap & i2) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i2, K k2, V v2) {
        return new TrieNode<>(i2 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i2), k2, v2));
    }

    private final K keyAtIndex(int i2) {
        return (K) this.buffer[i2];
    }

    private final TrieNode<K, V> makeNode(int i2, K k2, V v2, int i3, K k3, V v3, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k2, v2, k3, v3}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i2, i4);
        int indexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (indexSegment != indexSegment2) {
            Object[] objArr = new Object[4];
            if (indexSegment < indexSegment2) {
                objArr[0] = k2;
                objArr[1] = v2;
                objArr[2] = k3;
                objArr[3] = v3;
            } else {
                objArr[0] = k3;
                objArr[1] = v3;
                objArr[2] = k2;
                objArr[3] = v2;
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, objArr, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i2, k2, v2, i3, k3, v3, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5) {
        return new TrieNode<>(this.dataMap ^ i3, this.nodeMap | i3, bufferMoveEntryToNode(i2, i3, i4, k2, v2, i5, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r0 > r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableCollisionPut(K r10, V r11, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.mutableCollisionPut(java.lang.Object, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r0 > r0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableCollisionPutAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> r8, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r9, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.mutableCollisionPutAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r0 > r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableCollisionRemove(K r5, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r7 = r0
            r0 = r7
            int r0 = r0.getFirst()
            r8 = r0
            r0 = r7
            int r0 = r0.getLast()
            r9 = r0
            r0 = r7
            int r0 = r0.getStep()
            r10 = r0
            r0 = r10
            if (r0 <= 0) goto L30
            r0 = r8
            r11 = r0
            r0 = r8
            r1 = r9
            if (r0 <= r1) goto L40
        L30:
            r0 = r10
            if (r0 >= 0) goto L69
            r0 = r9
            r1 = r8
            if (r0 > r1) goto L69
            r0 = r8
            r11 = r0
        L40:
            r0 = r5
            r1 = r4
            r2 = r11
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L55
            r0 = r4
            r1 = r11
            r2 = r6
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.mutableCollisionRemoveEntryAtIndex(r1, r2)
            return r0
        L55:
            r0 = r11
            r1 = r9
            if (r0 != r1) goto L5f
            goto L69
        L5f:
            r0 = r11
            r1 = r10
            int r0 = r0 + r1
            r11 = r0
            goto L40
        L69:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.mutableCollisionRemove(java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r0 > r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableCollisionRemove(K r5, V r6, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = r4
            java.lang.Object[] r1 = r1.buffer
            int r1 = r1.length
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            r1 = 2
            kotlin.ranges.IntProgression r0 = kotlin.ranges.RangesKt.step(r0, r1)
            r8 = r0
            r0 = r8
            int r0 = r0.getFirst()
            r9 = r0
            r0 = r8
            int r0 = r0.getLast()
            r10 = r0
            r0 = r8
            int r0 = r0.getStep()
            r11 = r0
            r0 = r11
            if (r0 <= 0) goto L34
            r0 = r9
            r12 = r0
            r0 = r9
            r1 = r10
            if (r0 <= r1) goto L44
        L34:
            r0 = r11
            if (r0 >= 0) goto L7a
            r0 = r10
            r1 = r9
            if (r0 > r1) goto L7a
            r0 = r9
            r12 = r0
        L44:
            r0 = r5
            r1 = r4
            r2 = r12
            java.lang.Object r1 = r1.keyAtIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L66
            r0 = r6
            r1 = r4
            r2 = r12
            java.lang.Object r1 = r1.valueAtKeyIndex(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L66
            r0 = r4
            r1 = r12
            r2 = r7
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.mutableCollisionRemoveEntryAtIndex(r1, r2)
            return r0
        L66:
            r0 = r12
            r1 = r10
            if (r0 != r1) goto L70
            goto L7a
        L70:
            r0 = r12
            r1 = r11
            int r0 = r0 + r1
            r12 = r0
            goto L44
        L7a:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.mutableCollisionRemove(java.lang.Object, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i2);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i2), persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i2, K k2, V v2, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i2);
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(i2 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k2, v2), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k2, v2);
        this.dataMap = i2 | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i2, int i3, int i4, K k2, V v2, int i5, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] bufferMoveEntryToNode = bufferMoveEntryToNode(i2, i3, i4, k2, v2, i5, mutabilityOwnership);
        if (mutabilityOwnership2 == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode;
            this.dataMap ^= i3;
            this.nodeMap |= i3;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i3, this.nodeMap | i3, bufferMoveEntryToNode, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i2, int i3, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> makeNode;
        if (hasNodeAt(i2)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i2));
            if (trieNode.hasNodeAt(i2)) {
                makeNode = nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i2)), i3 + 5, deltaCounter, persistentHashMapBuilder);
            } else {
                makeNode = nodeAtIndex$runtime_release;
                if (trieNode.hasEntryAt$runtime_release(i2)) {
                    int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i2);
                    K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                    V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                    int size = persistentHashMapBuilder.size();
                    TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(keyAtIndex == null ? 0 : keyAtIndex.hashCode(), keyAtIndex, valueAtKeyIndex, i3 + 5, persistentHashMapBuilder);
                    makeNode = mutablePut;
                    if (persistentHashMapBuilder.size() == size) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                        makeNode = mutablePut;
                    }
                }
            }
        } else if (trieNode.hasNodeAt(i2)) {
            makeNode = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i2));
            if (hasEntryAt$runtime_release(i2)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i2);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                int i4 = i3 + 5;
                if (makeNode.containsKey(keyAtIndex2 == null ? 0 : keyAtIndex2.hashCode(), keyAtIndex2, i4)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    makeNode = makeNode.mutablePut(keyAtIndex2 == null ? 0 : keyAtIndex2.hashCode(), keyAtIndex2, valueAtKeyIndex(entryKeyIndex$runtime_release2), i4, persistentHashMapBuilder);
                }
            }
        } else {
            int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i2);
            K keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
            V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
            int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i2);
            K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$runtime_release4);
            makeNode = makeNode(keyAtIndex3 == null ? 0 : keyAtIndex3.hashCode(), keyAtIndex3, valueAtKeyIndex2, keyAtIndex4 == null ? 0 : keyAtIndex4.hashCode(), keyAtIndex4, trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release4), i3 + 5, persistentHashMapBuilder.getOwnership$runtime_release());
        }
        return makeNode;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != persistentHashMapBuilder.getOwnership$runtime_release()) {
            return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i2), persistentHashMapBuilder.getOwnership$runtime_release());
        }
        this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i2);
        this.dataMap ^= i3;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] access$removeNodeAtIndex = TrieNodeKt.access$removeNodeAtIndex(objArr, i2);
        if (mutabilityOwnership2 == mutabilityOwnership) {
            this.buffer = access$removeNodeAtIndex;
            this.nodeMap ^= i3;
            return this;
        }
        return new TrieNode<>(this.dataMap, this.nodeMap ^ i3, access$removeNodeAtIndex, mutabilityOwnership);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != r7) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableReplaceNode(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> r6, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> r7, int r8, int r9, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r10) {
        /*
            r5 = this;
            r0 = r7
            if (r0 != 0) goto L12
            r0 = r5
            r1 = r8
            r2 = r9
            r3 = r10
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.mutableRemoveNodeAtIndex(r1, r2, r3)
            r11 = r0
            goto L2d
        L12:
            r0 = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership r0 = r0.ownedBy
            r1 = r10
            if (r0 == r1) goto L23
            r0 = r5
            r11 = r0
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L2d
        L23:
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = r10
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode r0 = r0.mutableUpdateNodeAtIndex(r1, r2, r3)
            r11 = r0
        L2d:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.mutableReplaceNode(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, int, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode");
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i2, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else if (this.ownedBy == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i2] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
        }
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i2, V v2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            this.buffer[i2 + 1] = v2;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2 + 1] = v2;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, this.nodeMap ^ i3, TrieNodeKt.access$removeNodeAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i2, int i3) {
        TrieNode<K, V> trieNode3;
        if (trieNode2 == null) {
            trieNode3 = removeNodeAtIndex(i2, i3);
        } else {
            trieNode3 = this;
            if (trieNode != trieNode2) {
                trieNode3 = updateNodeAtIndex(i2, i3, trieNode2);
            }
        }
        return trieNode3;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i2, int i3, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i2] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
        } else if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else {
            return new TrieNode<>(this.dataMap ^ i3, this.nodeMap ^ i3, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i2, entryKeyIndex$runtime_release(i3), objArr[0], objArr[1]));
        }
    }

    private final TrieNode<K, V> updateValueAtIndex(int i2, V v2) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i2 + 1] = v2;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i2) {
        return (V) this.buffer[i2 + 1];
    }

    public final void accept$runtime_release(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        accept(visitor, 0, 0);
    }

    public final boolean containsKey(int i2, K k2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            return i3 == 30 ? nodeAtIndex$runtime_release.collisionContainsKey(k2) : nodeAtIndex$runtime_release.containsKey(i2, k2, i3 + 5);
        }
        return false;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i2) {
        return Integer.bitCount(this.dataMap & (i2 - 1)) * 2;
    }

    @Nullable
    public final V get(int i2, K k2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(entryKeyIndex$runtime_release);
            }
            return null;
        } else if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            return i3 == 30 ? nodeAtIndex$runtime_release.collisionGet(k2) : nodeAtIndex$runtime_release.get(i2, k2, i3 + 5);
        } else {
            return null;
        }
    }

    @NotNull
    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i2) {
        return (this.dataMap & i2) != 0;
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int i2, K k2, V v2, int i3, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
                mutator.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                return valueAtKeyIndex(entryKeyIndex$runtime_release) == v2 ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v2, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i2, k2, v2, i3, mutator.getOwnership$runtime_release());
        } else if (!hasNodeAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(indexSegment, k2, v2, mutator.getOwnership$runtime_release());
        } else {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            TrieNode<K, V> mutableCollisionPut = i3 == 30 ? nodeAtIndex$runtime_release.mutableCollisionPut(k2, v2, mutator) : nodeAtIndex$runtime_release.mutablePut(i2, k2, v2, i3 + 5, mutator);
            return nodeAtIndex$runtime_release == mutableCollisionPut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutableCollisionPut, mutator.getOwnership$runtime_release());
        }
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int i2, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        int i3;
        int i4;
        TrieNode<K, V> trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        } else if (i2 > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership$runtime_release());
        } else {
            int i5 = this.nodeMap | otherNode.nodeMap;
            int i6 = this.dataMap;
            int i7 = otherNode.dataMap;
            int i8 = i6 & i7;
            int i9 = (i6 ^ i7) & i5;
            while (i8 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i8);
                if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                    i9 |= lowestOneBit;
                } else {
                    i5 |= lowestOneBit;
                }
                i8 ^= lowestOneBit;
            }
            if ((i5 & i9) == 0) {
                TrieNode<K, V> trieNode2 = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime_release()) && this.dataMap == i9 && this.nodeMap == i5) ? this : new TrieNode<>(i9, i5, new Object[(Integer.bitCount(i9) * 2) + Integer.bitCount(i5)]);
                int i10 = 0;
                int i11 = i5;
                while (true) {
                    int i12 = i11;
                    i3 = i9;
                    i4 = 0;
                    if (i12 == 0) {
                        break;
                    }
                    int lowestOneBit2 = Integer.lowestOneBit(i12);
                    trieNode2.getBuffer$runtime_release()[(trieNode2.getBuffer$runtime_release().length - 1) - i10] = mutablePutAllFromOtherNodeCell(otherNode, lowestOneBit2, i2, intersectionCounter, mutator);
                    i10++;
                    i11 = i12 ^ lowestOneBit2;
                }
                while (i3 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i3);
                    int i13 = i4 * 2;
                    if (otherNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                        int entryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode2.getBuffer$runtime_release()[i13] = otherNode.keyAtIndex(entryKeyIndex$runtime_release);
                        trieNode2.getBuffer$runtime_release()[i13 + 1] = otherNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                        if (hasEntryAt$runtime_release(lowestOneBit3)) {
                            intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                        }
                    } else {
                        int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode2.getBuffer$runtime_release()[i13] = keyAtIndex(entryKeyIndex$runtime_release2);
                        trieNode2.getBuffer$runtime_release()[i13 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    }
                    i4++;
                    i3 ^= lowestOneBit3;
                }
                if (elementsIdentityEquals(trieNode2)) {
                    trieNode = this;
                } else {
                    trieNode = trieNode2;
                    if (otherNode.elementsIdentityEquals(trieNode2)) {
                        trieNode = otherNode;
                    }
                }
                return trieNode;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i2, K k2, int i3, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            TrieNode<K, V> trieNode = this;
            if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
                trieNode = mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, mutator);
            }
            return trieNode;
        }
        TrieNode<K, V> trieNode2 = this;
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            trieNode2 = mutableReplaceNode(nodeAtIndex$runtime_release, i3 == 30 ? nodeAtIndex$runtime_release.mutableCollisionRemove(k2, mutator) : nodeAtIndex$runtime_release.mutableRemove(i2, k2, i3 + 5, mutator), nodeIndex$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        }
        return trieNode2;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i2, K k2, V v2, int i3, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (!hasEntryAt$runtime_release(indexSegment)) {
            TrieNode<K, V> trieNode = this;
            if (hasNodeAt(indexSegment)) {
                int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
                TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
                trieNode = mutableReplaceNode(nodeAtIndex$runtime_release, i3 == 30 ? nodeAtIndex$runtime_release.mutableCollisionRemove(k2, v2, mutator) : nodeAtIndex$runtime_release.mutableRemove(i2, k2, v2, i3 + 5, mutator), nodeIndex$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
            }
            return trieNode;
        }
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
        TrieNode<K, V> trieNode2 = this;
        if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
            trieNode2 = this;
            if (Intrinsics.areEqual(v2, valueAtKeyIndex(entryKeyIndex$runtime_release))) {
                trieNode2 = mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, mutator);
            }
        }
        return trieNode2;
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i2) {
        Object obj = this.buffer[i2];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int nodeIndex$runtime_release(int i2) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (i2 - 1));
    }

    @Nullable
    public final ModificationResult<K, V> put(int i2, K k2, V v2, int i3) {
        ModificationResult<K, V> modificationResult;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v2) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime_release, v2).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i2, k2, v2, i3).asInsertResult();
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i3 == 30) {
                ModificationResult<K, V> collisionPut = nodeAtIndex$runtime_release.collisionPut(k2, v2);
                modificationResult = collisionPut;
                if (collisionPut == null) {
                    return null;
                }
            } else {
                ModificationResult<K, V> put = nodeAtIndex$runtime_release.put(i2, k2, v2, i3 + 5);
                modificationResult = put;
                if (put == null) {
                    return null;
                }
            }
            modificationResult.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, modificationResult.getNode()));
            return modificationResult;
        } else {
            return insertEntryAt(indexSegment, k2, v2).asInsertResult();
        }
    }

    @Nullable
    public final TrieNode<K, V> remove(int i2, K k2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            TrieNode<K, V> trieNode = this;
            if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
                trieNode = removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment);
            }
            return trieNode;
        }
        TrieNode<K, V> trieNode2 = this;
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            trieNode2 = replaceNode(nodeAtIndex$runtime_release, i3 == 30 ? nodeAtIndex$runtime_release.collisionRemove(k2) : nodeAtIndex$runtime_release.remove(i2, k2, i3 + 5), nodeIndex$runtime_release, indexSegment);
        }
        return trieNode2;
    }

    @Nullable
    public final TrieNode<K, V> remove(int i2, K k2, V v2, int i3) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (!hasEntryAt$runtime_release(indexSegment)) {
            TrieNode<K, V> trieNode = this;
            if (hasNodeAt(indexSegment)) {
                int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
                TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
                trieNode = replaceNode(nodeAtIndex$runtime_release, i3 == 30 ? nodeAtIndex$runtime_release.collisionRemove(k2, v2) : nodeAtIndex$runtime_release.remove(i2, k2, v2, i3 + 5), nodeIndex$runtime_release, indexSegment);
            }
            return trieNode;
        }
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
        TrieNode<K, V> trieNode2 = this;
        if (Intrinsics.areEqual(k2, keyAtIndex(entryKeyIndex$runtime_release))) {
            trieNode2 = this;
            if (Intrinsics.areEqual(v2, valueAtKeyIndex(entryKeyIndex$runtime_release))) {
                trieNode2 = removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment);
            }
        }
        return trieNode2;
    }
}
