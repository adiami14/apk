package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��l\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n��\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001��¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001��¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001��¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118��¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001��¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001��¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001��¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001��¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001��¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001��¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001��¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00030.\"\b\u0012\u0004\u0012\u00028��0\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001��¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00030.\"\b\u0012\u0004\u0012\u00028��0\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001��¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00030.\"\b\u0012\u0004\u0012\u00028��0\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001��¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028��0\u00030.\"\b\u0012\u0004\u0012\u00028��0\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001��¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028��\u0018\u00010.07\"\u0004\b��\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001��¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b��\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028��0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001��¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028��0\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001��¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lo/i;", "flow", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "b", "Lkotlin/coroutines/Continuation;", "", "transform", "p", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "flow2", "c", "Lkotlin/Function4;", "Lo/j;", "", "Lkotlin/ExtensionFunctionType;", "q", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "i", "T3", "flow3", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "Lkotlin/Function5;", "j", "(Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function5;)Lo/i;", "T4", "flow4", "e", "(Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function5;)Lo/i;", "Lkotlin/Function6;", "k", "(Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function6;)Lo/i;", "T5", "flow5", "f", "(Lo/i;Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function6;)Lo/i;", "Lkotlin/Function7;", "l", "(Lo/i;Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function7;)Lo/i;", "T", "", "flows", "Lkotlin/Function2;", "g", "([Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "m", "([Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "o", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/Function0;", "r", "()Lkotlin/jvm/functions/Function0;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Lo/i;", "h", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Lo/i;", "other", "s", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: ItsOnFire.jar:o/b0.class */
public final /* synthetic */ class b0 {

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$a.class */
    public static final class a<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1198j;

        /* renamed from: k */
        public final /* synthetic */ Function4 f1199k;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.b0$a$a */
        /* loaded from: ItsOnFire.jar:o/b0$a$a.class */
        public static final class C0067a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1200j;

            /* renamed from: k */
            public /* synthetic */ Object f1201k;

            /* renamed from: l */
            public /* synthetic */ Object f1202l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1203m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1203m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                C0067a c0067a = new C0067a(continuation, this.f1203m);
                c0067a.f1201k = jVar;
                c0067a.f1202l = objArr;
                return c0067a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1200j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1201k;
                    Object[] objArr = (Object[]) this.f1202l;
                    Function4 function4 = this.f1203m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f1201k = jVar;
                    this.f1200j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function4.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    obj = invoke;
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1201k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1201k = null;
                this.f1200j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public a(o.i[] iVarArr, Function4 function4) {
            this.f1198j = iVarArr;
            this.f1199k = function4;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1198j, b0.a(), new C0067a(null, this.f1199k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$b.class */
    public static final class b<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1204j;

        /* renamed from: k */
        public final /* synthetic */ Function5 f1205k;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$b$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1206j;

            /* renamed from: k */
            public /* synthetic */ Object f1207k;

            /* renamed from: l */
            public /* synthetic */ Object f1208l;

            /* renamed from: m */
            public final /* synthetic */ Function5 f1209m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f1209m = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1209m);
                aVar.f1207k = jVar;
                aVar.f1208l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1206j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1207k;
                    Object[] objArr = (Object[]) this.f1208l;
                    Function5 function5 = this.f1209m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f1207k = jVar;
                    this.f1206j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function5.invoke(obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    obj = invoke;
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1207k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1207k = null;
                this.f1206j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public b(o.i[] iVarArr, Function5 function5) {
            this.f1204j = iVarArr;
            this.f1205k = function5;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1204j, b0.a(), new a(null, this.f1205k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$c.class */
    public static final class c<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1210j;

        /* renamed from: k */
        public final /* synthetic */ Function6 f1211k;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$c$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1212j;

            /* renamed from: k */
            public /* synthetic */ Object f1213k;

            /* renamed from: l */
            public /* synthetic */ Object f1214l;

            /* renamed from: m */
            public final /* synthetic */ Function6 f1215m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function6 function6) {
                super(3, continuation);
                this.f1215m = function6;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1215m);
                aVar.f1213k = jVar;
                aVar.f1214l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1212j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1213k;
                    Object[] objArr = (Object[]) this.f1214l;
                    Function6 function6 = this.f1215m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f1213k = jVar;
                    this.f1212j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    obj = invoke;
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1213k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1213k = null;
                this.f1212j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public c(o.i[] iVarArr, Function6 function6) {
            this.f1210j = iVarArr;
            this.f1211k = function6;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1210j, b0.a(), new a(null, this.f1211k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$d.class */
    public static final class d<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i f1216j;

        /* renamed from: k */
        public final /* synthetic */ o.i f1217k;

        /* renamed from: l */
        public final /* synthetic */ Function3 f1218l;

        public d(o.i iVar, o.i iVar2, Function3 function3) {
            this.f1216j = iVar;
            this.f1217k = iVar2;
            this.f1218l = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, new o.i[]{this.f1216j, this.f1217k}, b0.a(), new g(this.f1218l, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$e.class */
    public static final class e<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1219j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1220k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/b0$e$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1221j;

            /* renamed from: k */
            public int f1222k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                e.this = r4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1221j = obj;
                this.f1222k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(o.i[] iVarArr, Function2 function2) {
            this.f1219j = iVarArr;
            this.f1220k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1219j;
            Intrinsics.needClassReification();
            h hVar = new h(this.f1219j);
            Intrinsics.needClassReification();
            Object a2 = p.m.a(jVar, iVarArr, hVar, new i(this.f1220k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1219j;
            Intrinsics.needClassReification();
            h hVar = new h(this.f1219j);
            Intrinsics.needClassReification();
            i iVar = new i(this.f1220k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, hVar, iVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$f.class */
    public static final class f<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1224j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1225k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = Typography.degree)
        /* loaded from: ItsOnFire.jar:o/b0$f$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1226j;

            /* renamed from: k */
            public int f1227k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                f.this = r4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1226j = obj;
                this.f1227k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(o.i[] iVarArr, Function2 function2) {
            this.f1224j = iVarArr;
            this.f1225k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1224j;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f1224j);
            Intrinsics.needClassReification();
            Object a2 = p.m.a(jVar, iVarArr, jVar2, new k(this.f1225k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1224j;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f1224j);
            Intrinsics.needClassReification();
            k kVar = new k(this.f1225k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, jVar2, kVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010��\n��\n\u0002\u0010\u0002\n��\u0010\b\u001a\u00020\u0007\"\u0004\b��\u0010��\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lo/j;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$g.class */
    public static final class g<R> extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1229j;

        /* renamed from: k */
        public /* synthetic */ Object f1230k;

        /* renamed from: l */
        public /* synthetic */ Object f1231l;

        /* renamed from: m */
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1232m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f1232m = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
            g gVar = new g(this.f1232m, continuation);
            gVar.f1230k = jVar;
            gVar.f1231l = objArr;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1229j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1230k;
                Object[] objArr = (Object[]) this.f1231l;
                Function3<T1, T2, Continuation<? super R>, Object> function3 = this.f1232m;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f1230k = jVar;
                this.f1229j = 1;
                Object invoke = function3.invoke(obj2, obj3, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1230k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1230k = null;
            this.f1229j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\u0002\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$h.class */
    public static final class h<T> extends Lambda implements Function0<T[]> {

        /* renamed from: j */
        public final /* synthetic */ o.i<T>[] f1233j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(o.i<? extends T>[] iVarArr) {
            super(0);
            this.f1233j = iVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final T[] invoke() {
            int length = this.f1233j.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$i.class */
    public static final class i<R, T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1234j;

        /* renamed from: k */
        public /* synthetic */ Object f1235k;

        /* renamed from: l */
        public /* synthetic */ Object f1236l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1237m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super i> continuation) {
            super(3, continuation);
            this.f1237m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            i iVar = new i(this.f1237m, continuation);
            iVar.f1235k = jVar;
            iVar.f1236l = tArr;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1234j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1235k;
                Object[] objArr = (Object[]) this.f1236l;
                this.f1235k = jVar;
                this.f1234j = 1;
                Object invoke = this.f1237m.invoke(objArr, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1235k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1235k = null;
            this.f1234j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object j(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1235k;
            Object invoke = this.f1237m.invoke((Object[]) this.f1236l, this);
            InlineMarker.mark(0);
            jVar.emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\u0002\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$j.class */
    public static final class j<T> extends Lambda implements Function0<T[]> {

        /* renamed from: j */
        public final /* synthetic */ o.i<T>[] f1238j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o.i<T>[] iVarArr) {
            super(0);
            this.f1238j = iVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final T[] invoke() {
            int length = this.f1238j.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$k.class */
    public static final class k<R, T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1239j;

        /* renamed from: k */
        public /* synthetic */ Object f1240k;

        /* renamed from: l */
        public /* synthetic */ Object f1241l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1242m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super k> continuation) {
            super(3, continuation);
            this.f1242m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            k kVar = new k(this.f1242m, continuation);
            kVar.f1240k = jVar;
            kVar.f1241l = tArr;
            return kVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1239j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1240k;
                Object[] objArr = (Object[]) this.f1241l;
                this.f1240k = jVar;
                this.f1239j = 1;
                Object invoke = this.f1242m.invoke(objArr, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1240k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1240k = null;
            this.f1239j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object j(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1240k;
            Object invoke = this.f1242m.invoke((Object[]) this.f1241l, this);
            InlineMarker.mark(0);
            jVar.emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$l.class */
    public static final class l<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1243j;

        /* renamed from: k */
        public /* synthetic */ Object f1244k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1245l;

        /* renamed from: m */
        public final /* synthetic */ Function4 f1246m;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$l$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1247j;

            /* renamed from: k */
            public /* synthetic */ Object f1248k;

            /* renamed from: l */
            public /* synthetic */ Object f1249l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1250m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1250m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1250m);
                aVar.f1248k = jVar;
                aVar.f1249l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1247j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1248k;
                    Object[] objArr = (Object[]) this.f1249l;
                    Function4 function4 = this.f1250m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f1247j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function4.invoke(jVar, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(o.i[] iVarArr, Continuation continuation, Function4 function4) {
            super(2, continuation);
            this.f1245l = iVarArr;
            this.f1246m = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.f1245l, continuation, this.f1246m);
            lVar.f1244k = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1243j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1244k;
                o.i[] iVarArr = this.f1245l;
                Function0 a2 = b0.a();
                a aVar = new a(null, this.f1246m);
                this.f1243j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$m.class */
    public static final class m<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1251j;

        /* renamed from: k */
        public /* synthetic */ Object f1252k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1253l;

        /* renamed from: m */
        public final /* synthetic */ Function4 f1254m;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$m$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1255j;

            /* renamed from: k */
            public /* synthetic */ Object f1256k;

            /* renamed from: l */
            public /* synthetic */ Object f1257l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1258m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1258m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1258m);
                aVar.f1256k = jVar;
                aVar.f1257l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1255j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1256k;
                    Object[] objArr = (Object[]) this.f1257l;
                    Function4 function4 = this.f1258m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f1255j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function4.invoke(jVar, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(o.i[] iVarArr, Continuation continuation, Function4 function4) {
            super(2, continuation);
            this.f1253l = iVarArr;
            this.f1254m = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            m mVar = new m(this.f1253l, continuation, this.f1254m);
            mVar.f1252k = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1251j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1252k;
                o.i[] iVarArr = this.f1253l;
                Function0 a2 = b0.a();
                a aVar = new a(null, this.f1254m);
                this.f1251j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$n.class */
    public static final class n<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1259j;

        /* renamed from: k */
        public /* synthetic */ Object f1260k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1261l;

        /* renamed from: m */
        public final /* synthetic */ Function5 f1262m;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$n$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1263j;

            /* renamed from: k */
            public /* synthetic */ Object f1264k;

            /* renamed from: l */
            public /* synthetic */ Object f1265l;

            /* renamed from: m */
            public final /* synthetic */ Function5 f1266m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f1266m = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1266m);
                aVar.f1264k = jVar;
                aVar.f1265l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1263j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1264k;
                    Object[] objArr = (Object[]) this.f1265l;
                    Function5 function5 = this.f1266m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f1263j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function5.invoke(jVar, obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(o.i[] iVarArr, Continuation continuation, Function5 function5) {
            super(2, continuation);
            this.f1261l = iVarArr;
            this.f1262m = function5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            n nVar = new n(this.f1261l, continuation, this.f1262m);
            nVar.f1260k = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1259j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1260k;
                o.i[] iVarArr = this.f1261l;
                Function0 a2 = b0.a();
                a aVar = new a(null, this.f1262m);
                this.f1259j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$o.class */
    public static final class o<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1267j;

        /* renamed from: k */
        public /* synthetic */ Object f1268k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1269l;

        /* renamed from: m */
        public final /* synthetic */ Function6 f1270m;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$o$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1271j;

            /* renamed from: k */
            public /* synthetic */ Object f1272k;

            /* renamed from: l */
            public /* synthetic */ Object f1273l;

            /* renamed from: m */
            public final /* synthetic */ Function6 f1274m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function6 function6) {
                super(3, continuation);
                this.f1274m = function6;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1274m);
                aVar.f1272k = jVar;
                aVar.f1273l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1271j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1272k;
                    Object[] objArr = (Object[]) this.f1273l;
                    Function6 function6 = this.f1274m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f1271j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function6.invoke(jVar, obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(o.i[] iVarArr, Continuation continuation, Function6 function6) {
            super(2, continuation);
            this.f1269l = iVarArr;
            this.f1270m = function6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.f1269l, continuation, this.f1270m);
            oVar.f1268k = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1267j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1268k;
                o.i[] iVarArr = this.f1269l;
                Function0 a2 = b0.a();
                a aVar = new a(null, this.f1270m);
                this.f1267j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$p.class */
    public static final class p<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1275j;

        /* renamed from: k */
        public /* synthetic */ Object f1276k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1277l;

        /* renamed from: m */
        public final /* synthetic */ Function7 f1278m;

        @Metadata(bv = {}, d1 = {"��\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$p$a.class */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1279j;

            /* renamed from: k */
            public /* synthetic */ Object f1280k;

            /* renamed from: l */
            public /* synthetic */ Object f1281l;

            /* renamed from: m */
            public final /* synthetic */ Function7 f1282m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function7 function7) {
                super(3, continuation);
                this.f1282m = function7;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1282m);
                aVar.f1280k = jVar;
                aVar.f1281l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1279j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1280k;
                    Object[] objArr = (Object[]) this.f1281l;
                    Function7 function7 = this.f1282m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f1279j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function7.invoke(jVar, obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o.i[] iVarArr, Continuation continuation, Function7 function7) {
            super(2, continuation);
            this.f1277l = iVarArr;
            this.f1278m = function7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = new p(this.f1277l, continuation, this.f1278m);
            pVar.f1276k = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1275j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1276k;
                o.i[] iVarArr = this.f1277l;
                Function0 a2 = b0.a();
                a aVar = new a(null, this.f1278m);
                this.f1275j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$q.class */
    public static final class q<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1283j;

        /* renamed from: k */
        public /* synthetic */ Object f1284k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1285l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1286m;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\u0002\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/b0$q$a.class */
        public static final class a<T> extends Lambda implements Function0<T[]> {

            /* renamed from: j */
            public final /* synthetic */ o.i<T>[] f1287j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(o.i<? extends T>[] iVarArr) {
                super(0);
                this.f1287j = iVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: a */
            public final T[] invoke() {
                int length = this.f1287j.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$q$b.class */
        public static final class b<T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1288j;

            /* renamed from: k */
            public /* synthetic */ Object f1289k;

            /* renamed from: l */
            public /* synthetic */ Object f1290l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1291m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f1291m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(this.f1291m, continuation);
                bVar.f1289k = jVar;
                bVar.f1290l = tArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1288j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1289k;
                    Object[] objArr = (Object[]) this.f1290l;
                    this.f1289k = null;
                    this.f1288j = 1;
                    if (this.f1291m.invoke(jVar, objArr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1291m.invoke((o.j) this.f1289k, (Object[]) this.f1290l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(o.i<? extends T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f1285l = iVarArr;
            this.f1286m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            q qVar = new q(this.f1285l, this.f1286m, continuation);
            qVar.f1284k = obj;
            return qVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1284k;
            o.i<T>[] iVarArr = this.f1285l;
            Intrinsics.needClassReification();
            a aVar = new a(this.f1285l);
            Intrinsics.needClassReification();
            b bVar = new b(this.f1286m, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1283j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1284k;
                o.i<T>[] iVarArr = this.f1285l;
                Intrinsics.needClassReification();
                a aVar = new a(this.f1285l);
                Intrinsics.needClassReification();
                b bVar = new b(this.f1286m, null);
                this.f1283j = 1;
                if (p.m.a(jVar, iVarArr, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$r.class */
    public static final class r<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1292j;

        /* renamed from: k */
        public /* synthetic */ Object f1293k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1294l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1295m;

        @Metadata(bv = {}, d1 = {"��\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018��\u0018\u00010\u0002\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: ItsOnFire.jar:o/b0$r$a.class */
        public static final class a<T> extends Lambda implements Function0<T[]> {

            /* renamed from: j */
            public final /* synthetic */ o.i<T>[] f1296j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o.i<T>[] iVarArr) {
                super(0);
                this.f1296j = iVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: a */
            public final T[] invoke() {
                int length = this.f1296j.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$r$b.class */
        public static final class b<T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1297j;

            /* renamed from: k */
            public /* synthetic */ Object f1298k;

            /* renamed from: l */
            public /* synthetic */ Object f1299l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1300m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f1300m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(this.f1300m, continuation);
                bVar.f1298k = jVar;
                bVar.f1299l = tArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1297j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1298k;
                    Object[] objArr = (Object[]) this.f1299l;
                    this.f1298k = null;
                    this.f1297j = 1;
                    if (this.f1300m.invoke(jVar, objArr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1300m.invoke((o.j) this.f1298k, (Object[]) this.f1299l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(o.i<T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f1294l = iVarArr;
            this.f1295m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r rVar = new r(this.f1294l, this.f1295m, continuation);
            rVar.f1293k = obj;
            return rVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1293k;
            o.i<T>[] iVarArr = this.f1294l;
            Intrinsics.needClassReification();
            a aVar = new a(this.f1294l);
            Intrinsics.needClassReification();
            b bVar = new b(this.f1295m, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1292j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1293k;
                o.i<T>[] iVarArr = this.f1294l;
                Intrinsics.needClassReification();
                a aVar = new a(this.f1294l);
                Intrinsics.needClassReification();
                b bVar = new b(this.f1295m, null);
                this.f1292j = 1;
                if (p.m.a(jVar, iVarArr, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n��\u0010\u0004\u001a\u00020\u0003\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$s.class */
    public static final class s<R> extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1301j;

        /* renamed from: k */
        public /* synthetic */ Object f1302k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1303l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1304m;

        @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: ItsOnFire.jar:o/b0$s$a.class */
        public static final class a<T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1305j;

            /* renamed from: k */
            public /* synthetic */ Object f1306k;

            /* renamed from: l */
            public /* synthetic */ Object f1307l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1308m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f1308m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(this.f1308m, continuation);
                aVar.f1306k = jVar;
                aVar.f1307l = tArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1305j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1306k;
                    Object[] objArr = (Object[]) this.f1307l;
                    this.f1306k = null;
                    this.f1305j = 1;
                    if (this.f1308m.invoke(jVar, objArr, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1308m.invoke((o.j) this.f1306k, (Object[]) this.f1307l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(o.i<? extends T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f1303l = iVarArr;
            this.f1304m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(this.f1303l, this.f1304m, continuation);
            sVar.f1302k = obj;
            return sVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1302k;
            o.i<T>[] iVarArr = this.f1303l;
            Function0 a2 = b0.a();
            Intrinsics.needClassReification();
            a aVar = new a(this.f1304m, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, a2, aVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1301j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.j jVar = (o.j) this.f1302k;
                o.i<T>[] iVarArr = this.f1303l;
                Function0 a2 = b0.a();
                Intrinsics.needClassReification();
                a aVar = new a(this.f1304m, null);
                this.f1301j = 1;
                if (p.m.a(jVar, iVarArr, a2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0017\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00028��0\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028��0\u0002H\u0096@ø\u0001��¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006��"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$t.class */
    public static final class t<R> implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1309j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1310k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: ItsOnFire.jar:o/b0$t$a.class */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1311j;

            /* renamed from: k */
            public int f1312k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                t.this = r4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1311j = obj;
                this.f1312k |= Integer.MIN_VALUE;
                return t.this.collect(null, this);
            }
        }

        public t(o.i[] iVarArr, Function2 function2) {
            this.f1309j = iVarArr;
            this.f1310k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1309j;
            Function0 a2 = b0.a();
            Intrinsics.needClassReification();
            Object a3 = p.m.a(jVar, iVarArr, a2, new u(this.f1310k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a3 == coroutine_suspended ? a3 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1309j;
            Function0 a2 = b0.a();
            Intrinsics.needClassReification();
            u uVar = new u(this.f1310k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, a2, uVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n��\n\u0002\u0010\u0002\n��\u0010\u0006\u001a\u00020\u0005\"\u0006\b��\u0010��\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: ItsOnFire.jar:o/b0$u.class */
    public static final class u<R, T> extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1314j;

        /* renamed from: k */
        public /* synthetic */ Object f1315k;

        /* renamed from: l */
        public /* synthetic */ Object f1316l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1317m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super u> continuation) {
            super(3, continuation);
            this.f1317m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            u uVar = new u(this.f1317m, continuation);
            uVar.f1315k = jVar;
            uVar.f1316l = tArr;
            return uVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1314j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1315k;
                Object[] objArr = (Object[]) this.f1316l;
                this.f1315k = jVar;
                this.f1314j = 1;
                Object invoke = this.f1317m.invoke(objArr, this);
                obj = invoke;
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1315k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1315k = null;
            this.f1314j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object j(@NotNull Object obj) {
            o.j jVar = (o.j) this.f1315k;
            Object invoke = this.f1317m.invoke((Object[]) this.f1316l, this);
            InlineMarker.mark(0);
            jVar.emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"��\n\n��\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b��\u0010��H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: ItsOnFire.jar:o/b0$v.class */
    public static final class v extends Lambda implements Function0 {

        /* renamed from: j */
        public static final v f1318j = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ Function0 a() {
        return r();
    }

    public static final /* synthetic */ <T, R> o.i<R> b(Iterable<? extends o.i<? extends T>> iterable, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new o.i[0]);
        if (array != null) {
            Intrinsics.needClassReification();
            return new f((o.i[]) array, function2);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> c(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return o.k.J0(iVar, iVar2, function3);
    }

    @NotNull
    public static final <T1, T2, T3, R> o.i<R> d(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @BuilderInference @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return new a(new o.i[]{iVar, iVar2, iVar3}, function4);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o.i<R> e(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return new b(new o.i[]{iVar, iVar2, iVar3, iVar4}, function5);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o.i<R> f(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull o.i<? extends T5> iVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return new c(new o.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, function6);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.i<R> g(o.i<? extends T>[] r5, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            o.b0$e r0 = new o.b0$e
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b0.g(o.i[], kotlin.jvm.functions.Function2):o.i");
    }

    public static final /* synthetic */ <T, R> o.i<R> h(Iterable<? extends o.i<? extends T>> iterable, @BuilderInference Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new o.i[0]);
        if (array != null) {
            Intrinsics.needClassReification();
            return o.k.I0(new r((o.i[]) array, function3, null));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> i(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super o.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return o.k.I0(new m(new o.i[]{iVar, iVar2}, null, function4));
    }

    @NotNull
    public static final <T1, T2, T3, R> o.i<R> j(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @BuilderInference @NotNull Function5<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return o.k.I0(new n(new o.i[]{iVar, iVar2, iVar3}, null, function5));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o.i<R> k(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @BuilderInference @NotNull Function6<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return o.k.I0(new o(new o.i[]{iVar, iVar2, iVar3, iVar4}, null, function6));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o.i<R> l(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull o.i<? extends T5> iVar5, @BuilderInference @NotNull Function7<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return o.k.I0(new p(new o.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, function7));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.i<R> m(o.i<? extends T>[] r6, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super o.j<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            o.b0$q r0 = new o.b0$q
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            o.i r0 = o.k.I0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b0.m(o.i[], kotlin.jvm.functions.Function3):o.i");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.i<R> n(o.i<? extends T>[] r6, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super o.j<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            o.b0$s r0 = new o.b0$s
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            o.i r0 = o.k.I0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b0.n(o.i[], kotlin.jvm.functions.Function3):o.i");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.i<R> o(o.i<? extends T>[] r5, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            o.b0$t r0 = new o.b0$t
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b0.o(o.i[], kotlin.jvm.functions.Function2):o.i");
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> o.i<R> p(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new d(iVar, iVar2, function3);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> o.i<R> q(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super o.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return o.k.I0(new l(new o.i[]{iVar, iVar2}, null, function4));
    }

    public static final <T> Function0<T[]> r() {
        return v.f1318j;
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> s(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return p.m.b(iVar, iVar2, function3);
    }
}
