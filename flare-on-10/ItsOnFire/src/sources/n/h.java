package n;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.o0;
import j.r2;
import j.s0;
import j.t0;
import j.v2;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.q0;
@Metadata(bv = {}, d1 = {"��Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n��\n\u0002\u0010\u0011\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018��2\u00020\u0001:\u0002\u0095\u0001B\n\b\u0002¢\u0006\u0005\b\u0094\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028��0\u001a\"\b\b��\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028��0\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028��09\"\u0004\b��\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028��092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b��\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028��H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H��¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H��¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028��09\"\u0004\b��\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028��09H��¢\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR$\u0010v\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010uR\u0016\u0010w\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010?R\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010yR#\u0010\u0080\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010{\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR$\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0084\u0001R!\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010uR\"\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008e\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008b\u0001\u0010XR\u001b\u0010\u0091\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010}¨\u0006\u0096\u0001"}, d2 = {"Ln/h;", "", "Lkotlin/Function1;", "", "", "t", "()Lkotlin/jvm/functions/Function1;", "M", "()V", "N", "Lj/n2;", "", "Ln/f;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/n2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Ln/h$a;", "Lkotlin/coroutines/CoroutineContext;", "create", "", "i", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Ln/h$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/Continuation;", "frame", "S", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "I", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "owner", "T", "(Ln/h$a;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "B", "(Lkotlin/coroutines/Continuation;)Ln/h$a;", "C", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ln/h$a;", "Ln/n;", "O", "(Ljava/util/List;)Ln/n;", "completion", "e", "(Lkotlin/coroutines/Continuation;Ln/n;)Lkotlin/coroutines/Continuation;", "E", "(Ln/h$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", "w", "(Lj/n2;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Ln/e;", "info", "m", "(Ln/e;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Ln/k;", "k", "f", "l", "(Ln/e;Ljava/util/List;)Ljava/util/List;", "G", "(Lkotlin/coroutines/Continuation;)V", "H", "F", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "b", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Ln/c;", "Ln/c;", "capturedCoroutinesMap", "installations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", "u", "K", "enableCreationStackTraces", "Lkotlin/jvm/functions/Function1;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lj/n2;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "z", "isInstalled", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:n/h.class */
public final class h {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final h f1056a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f1057b = "Coroutine creation stacktrace";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f1058c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static Thread f1059d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final n.c<a<?>, Boolean> f1060e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i f1061f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1062g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantReadWriteLock f1063h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f1064i;
    private static volatile int installations;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f1065j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public static final Function1<Boolean, Unit> f1066k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final n.c<CoroutineStackFrame, n.f> f1067l;

    @Metadata(bv = {}, d1 = {"��:\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u00028��0\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028��0\u0006H\u0016ø\u0001��¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028��0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Ln/h$a;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "j", "Lkotlin/coroutines/Continuation;", "delegate", "Ln/f;", "k", "Ln/f;", "info", "l", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "frame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;Ln/f;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/h$a.class */
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {
        @JvmField
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final Continuation<T> f1068j;
        @JvmField
        @NotNull

        /* renamed from: k  reason: collision with root package name */
        public final n.f f1069k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public final CoroutineStackFrame f1070l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Continuation<? super T> continuation, @NotNull n.f fVar, @Nullable CoroutineStackFrame coroutineStackFrame) {
            this.f1068j = continuation;
            this.f1069k = fVar;
            this.f1070l = coroutineStackFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.f1070l;
            return coroutineStackFrame != null ? coroutineStackFrame.getCallerFrame() : null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.f1068j.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.f1070l;
            return coroutineStackFrame != null ? coroutineStackFrame.getStackTraceElement() : null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            h.f1056a.E(this);
            this.f1068j.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f1068j.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018��\"\b\b��\u0010\u0001*\u00020��2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;", "n/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/h$b.class */
    public static final class b extends Lambda implements Function1<a<?>, n.e> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final n.e invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            n.e eVar = null;
            if (!h.f1056a.y(aVar) && (c2 = aVar.f1069k.c()) != null) {
                eVar = new n.e(aVar.f1069k, c2);
            }
            return eVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018��\"\b\b��\u0010\u0001*\u00020��2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/h$c.class */
    public static final class c<R> extends Lambda implements Function1<a<?>, R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<a<?>, CoroutineContext, R> f1071j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
            super(1);
            this.f1071j = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final R invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            R r2 = null;
            if (!h.f1056a.y(aVar) && (c2 = aVar.f1069k.c()) != null) {
                r2 = this.f1071j.invoke(aVar, c2);
            }
            return r2;
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\b\n\u0002\b\u0007\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:n/h$d.class */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t2).f1069k.f1038b), Long.valueOf(((a) t3).f1069k.f1038b));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030��H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln/h$a;", "it", "", "a", "(Ln/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/h$e.class */
    public static final class e extends Lambda implements Function1<a<?>, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public static final e f1072j = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Boolean invoke(@NotNull a<?> aVar) {
            return Boolean.valueOf(!h.f1056a.y(aVar));
        }
    }

    @Metadata(d1 = {"��\n\n��\n\u0002\u0010\b\n\u0002\b\u0007\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:n/h$f.class */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t2).f1069k.f1038b), Long.valueOf(((a) t3).f1069k.f1038b));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018��\"\b\b��\u0010\u0001*\u00020��2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;", "n/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:n/h$g.class */
    public static final class g extends Lambda implements Function1<a<?>, k> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final k invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            k kVar = null;
            if (!h.f1056a.y(aVar) && (c2 = aVar.f1069k.c()) != null) {
                kVar = new k(aVar.f1069k, c2);
            }
            return kVar;
        }
    }

    @Metadata(d1 = {"��\b\n��\n\u0002\u0010\u0002\n��\u0010��\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: n.h$h  reason: collision with other inner class name */
    /* loaded from: ItsOnFire.jar:n/h$h.class */
    public static final class C0060h extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public static final C0060h f1073j = new C0060h();

        public C0060h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            h.f1067l.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [n.i] */
    static {
        h hVar = new h();
        f1056a = hVar;
        f1058c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f1060e = new n.c<>(false, 1, null);
        f1061f = new Object(0L) { // from class: n.i
            public volatile long sequenceNumber;

            {
                this.sequenceNumber = r5;
            }
        };
        f1063h = new ReentrantReadWriteLock();
        f1064i = true;
        f1065j = true;
        f1066k = hVar.t();
        f1067l = new n.c<>(true);
        f1062g = AtomicLongFieldUpdater.newUpdater(i.class, "sequenceNumber");
    }

    public static /* synthetic */ void s(n2 n2Var) {
    }

    public final boolean A(StackTraceElement stackTraceElement) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return startsWith$default;
    }

    public final a<?> B(Continuation<?> continuation) {
        a<?> aVar = null;
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            aVar = C(coroutineStackFrame);
        }
        return aVar;
    }

    public final a<?> C(CoroutineStackFrame coroutineStackFrame) {
        a<?> aVar;
        while (true) {
            if (!(coroutineStackFrame instanceof a)) {
                coroutineStackFrame = coroutineStackFrame.getCallerFrame();
                if (coroutineStackFrame == null) {
                    aVar = null;
                    break;
                }
            } else {
                aVar = (a) coroutineStackFrame;
                break;
            }
        }
        return aVar;
    }

    public final void D(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement stackTraceElement : list) {
            printStream.print("\n\tat " + stackTraceElement);
        }
    }

    public final void E(a<?> aVar) {
        CoroutineStackFrame I;
        f1060e.remove(aVar);
        CoroutineStackFrame f2 = aVar.f1069k.f();
        if (f2 == null || (I = I(f2)) == null) {
            return;
        }
        f1067l.remove(I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> F(@NotNull Continuation<? super T> continuation) {
        if (z() && B(continuation) == null) {
            return e(continuation, f1065j ? O(J(new Exception())) : null);
        }
        return continuation;
    }

    public final void G(@NotNull Continuation<?> continuation) {
        S(continuation, n.g.f1054b);
    }

    public final void H(@NotNull Continuation<?> continuation) {
        S(continuation, n.g.f1055c);
    }

    public final CoroutineStackFrame I(CoroutineStackFrame coroutineStackFrame) {
        CoroutineStackFrame callerFrame;
        do {
            callerFrame = coroutineStackFrame.getCallerFrame();
            if (callerFrame == null) {
                return null;
            }
            coroutineStackFrame = callerFrame;
        } while (callerFrame.getStackTraceElement() == null);
        return callerFrame;
    }

    public final <T extends Throwable> List<StackTraceElement> J(T t2) {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        int i2 = -1;
        if (length2 >= 0) {
            while (true) {
                i2 = length2;
                length2 = i2 - 1;
                if (Intrinsics.areEqual(stackTrace[i2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    break;
                } else if (length2 < 0) {
                    i2 = -1;
                    break;
                }
            }
        }
        if (!f1064i) {
            int i3 = length - i2;
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 < i3) {
                arrayList.add(i4 == 0 ? q0.d(f1057b) : stackTrace[i4 + i2]);
                i4++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i2) + 1);
        arrayList2.add(q0.d(f1057b));
        while (true) {
            i2++;
            while (i2 < length) {
                if (A(stackTrace[i2])) {
                    arrayList2.add(stackTrace[i2]);
                    int i5 = i2 + 1;
                    while (i5 < length && A(stackTrace[i5])) {
                        i5++;
                    }
                    int i6 = i5 - 1;
                    int i7 = i6;
                    while (i7 > i2 && stackTrace[i7].getFileName() == null) {
                        i7--;
                    }
                    if (i7 > i2 && i7 < i6) {
                        arrayList2.add(stackTrace[i7]);
                    }
                    arrayList2.add(stackTrace[i6]);
                    i2 = i5;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i2]);
        }
    }

    public final void K(boolean z) {
        f1065j = z;
    }

    public final void L(boolean z) {
        f1064i = z;
    }

    public final void M() {
        f1059d = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, C0060h.f1073j, 21, null);
    }

    public final void N() {
        Thread thread = f1059d;
        if (thread == null) {
            return;
        }
        f1059d = null;
        thread.interrupt();
        thread.join();
    }

    public final n O(List<StackTraceElement> list) {
        n nVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            n nVar2 = null;
            while (true) {
                n nVar3 = nVar2;
                nVar = nVar3;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                nVar2 = new n(nVar3, listIterator.previous());
            }
        }
        return nVar;
    }

    public final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(obj);
        sb.append('\"');
        return sb.toString();
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (!hVar.z()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            hVar.N();
            f1060e.clear();
            f1067l.clear();
            if (n.a.f1002a.a()) {
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = f1066k;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            Unit unit = Unit.INSTANCE;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                readLock.lock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            for (int i6 = 0; i6 < readHoldCount; i6++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void R(CoroutineStackFrame coroutineStackFrame, String str) {
        n.f fVar;
        ReentrantReadWriteLock.ReadLock readLock = f1063h.readLock();
        readLock.lock();
        try {
            h hVar = f1056a;
            if (hVar.z()) {
                n.c<CoroutineStackFrame, n.f> cVar = f1067l;
                n.f remove = cVar.remove(coroutineStackFrame);
                if (remove == null) {
                    a<?> C = hVar.C(coroutineStackFrame);
                    if (C == null || (fVar = C.f1069k) == null) {
                        return;
                    }
                    CoroutineStackFrame f2 = fVar.f();
                    CoroutineStackFrame I = f2 != null ? hVar.I(f2) : null;
                    remove = fVar;
                    if (I != null) {
                        cVar.remove(I);
                        remove = fVar;
                    }
                }
                remove.j(str, (Continuation) coroutineStackFrame);
                CoroutineStackFrame I2 = hVar.I(coroutineStackFrame);
                if (I2 == null) {
                    return;
                }
                cVar.put(I2, remove);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void S(Continuation<?> continuation, String str) {
        if (z()) {
            if (Intrinsics.areEqual(str, n.g.f1054b) && KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
                CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                R(coroutineStackFrame, str);
                return;
            }
            a<?> B = B(continuation);
            if (B == null) {
                return;
            }
            T(B, continuation, str);
        }
    }

    public final void T(a<?> aVar, Continuation<?> continuation, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f1063h.readLock();
        readLock.lock();
        try {
            if (f1056a.z()) {
                aVar.f1069k.j(str, continuation);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef A[LOOP:0: B:10:0x00e6->B:12:0x00ef, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(j.n2 r7, java.util.Map<j.n2, n.f> r8, java.lang.StringBuilder r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.h.d(j.n2, java.util.Map, java.lang.StringBuilder, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> e(Continuation<? super T> continuation, n nVar) {
        if (z()) {
            a<?> aVar = new a<>(continuation, new n.f(continuation.getContext(), nVar, f1062g.incrementAndGet(f1061f)), nVar);
            n.c<a<?>, Boolean> cVar = f1060e;
            cVar.put(aVar, Boolean.TRUE);
            if (!z()) {
                cVar.clear();
            }
            return aVar;
        }
        return continuation;
    }

    public final void f(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            f1056a.j(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<n.e> g() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<n.e> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new b());
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final Object[] h() {
        String joinToString$default;
        String trimIndent;
        String v2;
        List<n.e> g2 = g();
        int size = g2.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (n.e eVar : g2) {
            CoroutineContext a2 = eVar.a();
            t0 t0Var = (t0) a2.get(t0.f557k);
            String P = (t0Var == null || (v2 = t0Var.v()) == null) ? null : P(v2);
            o0 o0Var = (o0) a2.get(o0.Key);
            String P2 = o0Var != null ? P(o0Var) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(P);
            sb.append(",\n                    \"id\": ");
            s0 s0Var = (s0) a2.get(s0.f554k);
            Long l2 = null;
            if (s0Var != null) {
                l2 = Long.valueOf(s0Var.v());
            }
            sb.append(l2);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(P2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(eVar.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(eVar.g());
            sb.append("\"\n                } \n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList3.add(trimIndent);
            arrayList2.add(eVar.d());
            arrayList.add(eVar.e());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        String sb3 = sb2.toString();
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array != null) {
            Object[] array2 = arrayList2.toArray(new CoroutineStackFrame[0]);
            if (array2 != null) {
                Object[] array3 = g2.toArray(new n.e[0]);
                if (array3 != null) {
                    return new Object[]{sb3, array, array2, array3};
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final <R> List<R> i(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<R> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new c(function2));
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                InlineMarker.finallyStart(1);
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                InlineMarker.finallyEnd(1);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public final void j(PrintStream printStream) {
        Sequence asSequence;
        Sequence filter;
        Sequence<a> sortedWith;
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (!hVar.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print("Coroutines dump " + f1058c.format(Long.valueOf(System.currentTimeMillis())));
            asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
            filter = SequencesKt___SequencesKt.filter(asSequence, e.f1072j);
            sortedWith = SequencesKt___SequencesKt.sortedWith(filter, new f());
            for (a aVar : sortedWith) {
                n.f fVar = aVar.f1069k;
                List<StackTraceElement> h2 = fVar.h();
                h hVar2 = f1056a;
                List<StackTraceElement> n2 = hVar2.n(fVar.g(), fVar.f1041e, h2);
                printStream.print("\n\nCoroutine " + aVar.f1068j + ", state: " + ((Intrinsics.areEqual(fVar.g(), n.g.f1054b) && n2 == h2) ? fVar.g() + " (Last suspension stacktrace, not an actual stacktrace)" : fVar.g()));
                if (h2.isEmpty()) {
                    printStream.print("\n\tat " + q0.d(f1057b));
                    hVar2.D(printStream, fVar.e());
                } else {
                    hVar2.D(printStream, n2);
                }
            }
            Unit unit = Unit.INSTANCE;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                readLock.lock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final List<k> k() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<k> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new g());
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final List<StackTraceElement> l(@NotNull n.e eVar, @NotNull List<StackTraceElement> list) {
        return n(eVar.g(), eVar.e(), list);
    }

    @NotNull
    public final String m(@NotNull n.e eVar) {
        String joinToString$default;
        String trimIndent;
        List<StackTraceElement> l2 = l(eVar, eVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l2) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? P(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList.add(trimIndent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        return sb2.toString();
    }

    public final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object m5849constructorimpl;
        if (!Intrinsics.areEqual(str, n.g.f1054b) || thread == null) {
            return list;
        }
        try {
            Result.Companion companion = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = m5849constructorimpl;
        if (Result.m5855isFailureimpl(m5849constructorimpl)) {
            obj = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), q0.f2089a) && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i2++;
        }
        Pair<Integer, Integer> o2 = o(i2, stackTraceElementArr, list);
        int intValue = o2.component1().intValue();
        int intValue2 = o2.component2().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i2) - intValue) - 1) - intValue2);
        for (int i3 = 0; i3 < i2 - intValue2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = list.size();
        for (int i4 = intValue + 1; i4 < size; i4++) {
            arrayList.add(list.get(i4));
        }
        return arrayList;
    }

    public final Pair<Integer, Integer> o(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i3 = 0; i3 < 3; i3++) {
            int p2 = f1056a.p((i2 - 1) - i3, stackTraceElementArr, list);
            if (p2 != -1) {
                return TuplesKt.to(Integer.valueOf(p2), Integer.valueOf(i3));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    public final int p(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        Object orNull;
        int i3;
        orNull = ArraysKt___ArraysKt.getOrNull(stackTraceElementArr, i2);
        StackTraceElement stackTraceElement = (StackTraceElement) orNull;
        if (stackTraceElement == null) {
            return -1;
        }
        Iterator<StackTraceElement> it = list.iterator();
        int i4 = 0;
        while (true) {
            i3 = -1;
            if (!it.hasNext()) {
                break;
            }
            StackTraceElement next = it.next();
            if (Intrinsics.areEqual(next.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(next.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(next.getMethodName(), stackTraceElement.getMethodName())) {
                i3 = i4;
                break;
            }
            i4++;
        }
        return i3;
    }

    public final Set<a<?>> q() {
        return f1060e.keySet();
    }

    public final String r(n2 n2Var) {
        return n2Var instanceof v2 ? ((v2) n2Var).m1() : n2Var.toString();
    }

    public final Function1<Boolean, Unit> t() {
        Object m5849constructorimpl;
        Object newInstance;
        try {
            Result.Companion companion = Result.Companion;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m5849constructorimpl = Result.m5849constructorimpl(ResultKt.createFailure(th));
        }
        if (newInstance != null) {
            m5849constructorimpl = Result.m5849constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
            Object obj = m5849constructorimpl;
            if (Result.m5855isFailureimpl(m5849constructorimpl)) {
                obj = null;
            }
            return (Function1) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    public final boolean u() {
        return f1065j;
    }

    public final boolean v() {
        return f1064i;
    }

    @NotNull
    public final String w(@NotNull n2 n2Var) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1056a;
            if (hVar.z()) {
                Set<a<?>> q2 = hVar.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q2) {
                    if (((a) obj).f1068j.getContext().get(n2.f531b) != null) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(r2.B(((a) obj2).f1068j.getContext()), ((a) obj2).f1069k);
                }
                StringBuilder sb = new StringBuilder();
                f1056a.d(n2Var, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = f1063h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            f1056a.M();
            if (n.a.f1002a.a()) {
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = f1066k;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            Unit unit = Unit.INSTANCE;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                readLock.lock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            for (int i6 = 0; i6 < readHoldCount; i6++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final boolean y(a<?> aVar) {
        n2 n2Var;
        CoroutineContext c2 = aVar.f1069k.c();
        if (c2 == null || (n2Var = (n2) c2.get(n2.f531b)) == null || !n2Var.e()) {
            return false;
        }
        f1060e.remove(aVar);
        return true;
    }

    public final boolean z() {
        return installations > 0;
    }
}
