package kotlin.text;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��\u0084\u0001\n��\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H��\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H��\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H��\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b��\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001��¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b��\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001��¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b��\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010��\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b��\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010��\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H��\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001��\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001��¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001��¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001��\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010��\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", FirebaseAnalytics.Param.INDEX, "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/text/StringsKt")
/* loaded from: ItsOnFire.jar:kotlin/text/StringsKt__StringsKt.class */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (hasSurrogatePairAt(r5, r0) != false) goto L15;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String commonPrefixWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.lang.CharSequence r5, boolean r6) {
        /*
            r0 = r4
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r4
            int r0 = r0.length()
            r1 = r5
            int r1 = r1.length()
            int r0 = java.lang.Math.min(r0, r1)
            r7 = r0
            r0 = 0
            r8 = r0
        L1f:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L42
            r0 = r4
            r1 = r8
            char r0 = r0.charAt(r1)
            r1 = r5
            r2 = r8
            char r1 = r1.charAt(r2)
            r2 = r6
            boolean r0 = kotlin.text.CharsKt__CharKt.equals(r0, r1, r2)
            if (r0 == 0) goto L42
            int r8 = r8 + 1
            goto L1f
        L42:
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
            r0 = r4
            r1 = r9
            boolean r0 = hasSurrogatePairAt(r0, r1)
            if (r0 != 0) goto L5d
            r0 = r8
            r7 = r0
            r0 = r5
            r1 = r9
            boolean r0 = hasSurrogatePairAt(r0, r1)
            if (r0 == 0) goto L62
        L5d:
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L62:
            r0 = r4
            r1 = 0
            r2 = r7
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.commonPrefixWith(java.lang.CharSequence, java.lang.CharSequence, boolean):java.lang.String");
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (hasSurrogatePairAt(r6, (r0 - r11) - 1) != false) goto L15;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String commonSuffixWith(@org.jetbrains.annotations.NotNull java.lang.CharSequence r5, @org.jetbrains.annotations.NotNull java.lang.CharSequence r6, boolean r7) {
        /*
            r0 = r5
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r6
            java.lang.String r1 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r5
            int r0 = r0.length()
            r8 = r0
            r0 = r6
            int r0 = r0.length()
            r9 = r0
            r0 = r8
            r1 = r9
            int r0 = java.lang.Math.min(r0, r1)
            r10 = r0
            r0 = 0
            r11 = r0
        L26:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L53
            r0 = r5
            r1 = r8
            r2 = r11
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = r6
            r2 = r9
            r3 = r11
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            char r1 = r1.charAt(r2)
            r2 = r7
            boolean r0 = kotlin.text.CharsKt__CharKt.equals(r0, r1, r2)
            if (r0 == 0) goto L53
            int r11 = r11 + 1
            goto L26
        L53:
            r0 = r5
            r1 = r8
            r2 = r11
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            boolean r0 = hasSurrogatePairAt(r0, r1)
            if (r0 != 0) goto L72
            r0 = r11
            r10 = r0
            r0 = r6
            r1 = r9
            r2 = r11
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            boolean r0 = hasSurrogatePairAt(r0, r1)
            if (r0 == 0) goto L78
        L72:
            r0 = r11
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L78:
            r0 = r5
            r1 = r8
            r2 = r10
            int r1 = r1 - r2
            r2 = r8
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.commonSuffixWith(java.lang.CharSequence, java.lang.CharSequence, boolean):java.lang.String");
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z);
    }

    public static final boolean contains(@NotNull CharSequence charSequence, char c2, boolean z) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        indexOf$default = indexOf$default(charSequence, c2, 0, z, 2, (Object) null);
        return indexOf$default >= 0;
    }

    public static final boolean contains(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (indexOf$default(charSequence, (String) other, 0, z, 2, (Object) null) >= 0) {
                z2 = true;
            }
            z2 = false;
        } else {
            if (indexOf$StringsKt__StringsKt$default(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0) {
                z2 = true;
            }
            z2 = false;
        }
        return z2;
    }

    @InlineOnly
    private static final boolean contains(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return contains(charSequence, c2, z);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return contains(charSequence, charSequence2, z);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt__StringsJVMKt.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i2), charSequence2.charAt(i2), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence, char c2, boolean z) {
        boolean z2;
        int lastIndex;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() > 0) {
            lastIndex = getLastIndex(charSequence);
            if (CharsKt__CharKt.equals(charSequence.charAt(lastIndex), c2, z)) {
                z2 = true;
                return z2;
            }
        }
        z2 = false;
        return z2;
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z && (charSequence instanceof String) && (suffix instanceof String)) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default((String) charSequence, (String) suffix, false, 2, null);
            return endsWith$default;
        }
        return regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, c2, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, charSequence2, z);
    }

    @Nullable
    public static final Pair<Integer, String> findAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x009c, code lost:
        if (r0 > r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0131, code lost:
        if (r0 > r0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf$StringsKt__StringsKt(java.lang.CharSequence r7, java.util.Collection<java.lang.String> r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):kotlin.Pair");
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return findAnyOf(charSequence, collection, i2, z);
    }

    @Nullable
    public static final Pair<Integer, String> findLastAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z, true);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i2, boolean z, int i3, Object obj) {
        int lastIndex;
        if ((i3 & 2) != 0) {
            lastIndex = getLastIndex(charSequence);
            i2 = lastIndex;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return findLastAnyOf(charSequence, collection, i2, z);
    }

    @NotNull
    public static final IntRange getIndices(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static int getLastIndex(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(@NotNull CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        boolean z = false;
        if (new IntRange(0, charSequence.length() - 2).contains(i2)) {
            z = false;
            if (Character.isHighSurrogate(charSequence.charAt(i2))) {
                z = false;
                if (Character.isLowSurrogate(charSequence.charAt(i2 + 1))) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R ifBlank(C c2, Function0<? extends R> defaultValue) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        C c3 = c2;
        isBlank = StringsKt__StringsJVMKt.isBlank(c2);
        if (isBlank) {
            c3 = defaultValue.invoke();
        }
        return (R) c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R ifEmpty(C c2, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (c2.length() == 0) {
            c2 = defaultValue.invoke();
        }
        return (R) c2;
    }

    public static final int indexOf(@NotNull CharSequence charSequence, char c2, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    public static final int indexOf(@NotNull CharSequence charSequence, @NotNull String string, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? indexOf$StringsKt__StringsKt$default(charSequence, string, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(string, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x005e, code lost:
        if (r0 > r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b4, code lost:
        if (r0 > r0) goto L46;
     */
    /* JADX WARN: Incorrect condition in loop: B:75:0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int indexOf$StringsKt__StringsKt(java.lang.CharSequence r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt.indexOf$StringsKt__StringsKt(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    public static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i2, i3, z, z2);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, str, i2, z);
    }

    public static final int indexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z, false);
        return findAnyOf$StringsKt__StringsKt != null ? findAnyOf$StringsKt__StringsKt.getFirst().intValue() : -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public static final int indexOfAny(@NotNull CharSequence charSequence, @NotNull char[] chars, int i2, boolean z) {
        int coerceAtLeast;
        int lastIndex;
        boolean z2;
        char single;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            single = ArraysKt___ArraysKt.single(chars);
            return ((String) charSequence).indexOf(single, i2);
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2, 0);
        lastIndex = getLastIndex(charSequence);
        ?? it = new IntRange(coerceAtLeast, lastIndex).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                } else if (CharsKt__CharKt.equals(chars[i3], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                return nextInt;
            }
        }
        return -1;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, collection, i2, z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, cArr, i2, z);
    }

    @InlineOnly
    private static final boolean isEmpty(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @InlineOnly
    private static final boolean isNotBlank(CharSequence charSequence) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
        return !isBlank;
    }

    @InlineOnly
    private static final boolean isNotEmpty(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @InlineOnly
    private static final boolean isNullOrBlank(CharSequence charSequence) {
        boolean z;
        boolean isBlank;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    @InlineOnly
    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @NotNull
    public static final CharIterator iterator(@NotNull final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1
            private int index;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                CharSequence charSequence2 = charSequence;
                int i2 = this.index;
                this.index = i2 + 1;
                return charSequence2.charAt(i2);
            }
        };
    }

    public static final int lastIndexOf(@NotNull CharSequence charSequence, char c2, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static final int lastIndexOf(@NotNull CharSequence charSequence, @NotNull String string, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? indexOf$StringsKt__StringsKt(charSequence, string, i2, 0, z, true) : ((String) charSequence).lastIndexOf(string, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        int lastIndex;
        if ((i3 & 2) != 0) {
            lastIndex = getLastIndex(charSequence);
            i2 = lastIndex;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        int lastIndex;
        if ((i3 & 2) != 0) {
            lastIndex = getLastIndex(charSequence);
            i2 = lastIndex;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, str, i2, z);
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i2, z, true);
        return findAnyOf$StringsKt__StringsKt != null ? findAnyOf$StringsKt__StringsKt.getFirst().intValue() : -1;
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence, @NotNull char[] chars, int i2, boolean z) {
        int lastIndex;
        int coerceAtMost;
        boolean z2;
        char single;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            single = ArraysKt___ArraysKt.single(chars);
            return ((String) charSequence).lastIndexOf(single, i2);
        }
        lastIndex = getLastIndex(charSequence);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i2, lastIndex);
        for (int i3 = coerceAtMost; -1 < i3; i3--) {
            char charAt = charSequence.charAt(i3);
            int length = chars.length;
            int i4 = 0;
            while (true) {
                z2 = false;
                if (i4 >= length) {
                    break;
                } else if (CharsKt__CharKt.equals(chars[i4], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return i3;
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i2, boolean z, int i3, Object obj) {
        int lastIndex;
        if ((i3 & 2) != 0) {
            lastIndex = getLastIndex(charSequence);
            i2 = lastIndex;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, collection, i2, z);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, Object obj) {
        int lastIndex;
        if ((i3 & 2) != 0) {
            lastIndex = getLastIndex(charSequence);
            i2 = lastIndex;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, cArr, i2, z);
    }

    @NotNull
    public static final Sequence<String> lineSequence(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return splitToSequence$default(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @NotNull
    public static final List<String> lines(@NotNull CharSequence charSequence) {
        List<String> list;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        list = SequencesKt___SequencesKt.toList(lineSequence(charSequence));
        return list;
    }

    @InlineOnly
    private static final boolean matches(CharSequence charSequence, Regex regex) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches(charSequence);
    }

    @InlineOnly
    private static final String orEmpty(String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final CharSequence padEnd(@NotNull CharSequence charSequence, int i2, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        } else if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(charSequence);
            ?? it = new IntRange(1, i2 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c2);
            }
            return sb;
        }
    }

    @NotNull
    public static final String padEnd(@NotNull String str, int i2, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i2, c2).toString();
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        char c3 = c2;
        if ((i3 & 2) != 0) {
            c3 = ' ';
        }
        return padEnd(charSequence, i2, c3);
    }

    public static /* synthetic */ String padEnd$default(String str, int i2, char c2, int i3, Object obj) {
        char c3 = c2;
        if ((i3 & 2) != 0) {
            c3 = ' ';
        }
        return padEnd(str, i2, c3);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public static final CharSequence padStart(@NotNull CharSequence charSequence, int i2, char c2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Desired length " + i2 + " is less than zero.");
        } else if (i2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            ?? it = new IntRange(1, i2 - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c2);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    @NotNull
    public static String padStart(@NotNull String str, int i2, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i2, c2).toString();
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i2, char c2, int i3, Object obj) {
        char c3 = c2;
        if ((i3 & 2) != 0) {
            c3 = ' ';
        }
        return padStart(charSequence, i2, c3);
    }

    public static /* synthetic */ String padStart$default(String str, int i2, char c2, int i3, Object obj) {
        String padStart;
        char c3 = c2;
        if ((i3 & 2) != 0) {
            c3 = ' ';
        }
        padStart = padStart(str, i2, c3);
        return padStart;
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, final char[] cArr, int i2, final boolean z, int i3) {
        requireNonNegativeLimit(i3);
        return new DelimitedRangesSequence(charSequence, i2, i3, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            @Nullable
            public final Pair<Integer, Integer> invoke(@NotNull CharSequence $receiver, int i4) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int indexOfAny = StringsKt__StringsKt.indexOfAny($receiver, cArr, i4, z);
                return indexOfAny < 0 ? null : TuplesKt.to(Integer.valueOf(indexOfAny), 1);
            }
        });
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i2, final boolean z, int i3) {
        final List asList;
        requireNonNegativeLimit(i3);
        asList = ArraysKt___ArraysJvmKt.asList(strArr);
        return new DelimitedRangesSequence(charSequence, i2, i3, new Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            @Nullable
            public final Pair<Integer, Integer> invoke(@NotNull CharSequence $receiver, int i4) {
                Pair findAnyOf$StringsKt__StringsKt;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                findAnyOf$StringsKt__StringsKt = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, asList, i4, z, false);
                return findAnyOf$StringsKt__StringsKt != null ? TuplesKt.to(findAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(((String) findAnyOf$StringsKt__StringsKt.getSecond()).length())) : null;
            }
        });
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i2, z, i3);
    }

    public static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i2, z, i3);
    }

    public static final boolean regionMatchesImpl(@NotNull CharSequence charSequence, int i2, @NotNull CharSequence other, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!CharsKt__CharKt.equals(charSequence.charAt(i2 + i5), other.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final CharSequence removePrefix(@NotNull CharSequence charSequence, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return startsWith$default(charSequence, prefix, false, 2, (Object) null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String removePrefix(@NotNull String str, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        String str2 = str;
        if (startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            str2 = str.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).substring(startIndex)");
        }
        return str2;
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        } else if (i3 == i2) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i3 - i2));
            sb.append(charSequence, 0, i2);
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i3, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @InlineOnly
    private static final String removeRange(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return removeRange((CharSequence) str, i2, i3).toString();
    }

    @InlineOnly
    private static final String removeRange(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return removeRange((CharSequence) str, range).toString();
    }

    @NotNull
    public static final CharSequence removeSuffix(@NotNull CharSequence charSequence, @NotNull CharSequence suffix) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        endsWith$default = endsWith$default(charSequence, suffix, false, 2, (Object) null);
        return endsWith$default ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String removeSuffix(@NotNull String str, @NotNull CharSequence suffix) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        String str2 = str;
        endsWith$default = endsWith$default((CharSequence) str, suffix, false, 2, (Object) null);
        if (endsWith$default) {
            str2 = str.substring(0, str.length() - suffix.length());
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return str2;
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(charSequence, delimiter, delimiter);
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (charSequence.length() >= prefix.length() + suffix.length() && startsWith$default(charSequence, prefix, false, 2, (Object) null)) {
            endsWith$default = endsWith$default(charSequence, suffix, false, 2, (Object) null);
            if (endsWith$default) {
                return charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String str, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(str, delimiter, delimiter);
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        String str2 = str;
        if (str.length() >= prefix.length() + suffix.length()) {
            str2 = str;
            if (startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
                str2 = str;
                endsWith$default = endsWith$default((CharSequence) str, suffix, false, 2, (Object) null);
                if (endsWith$default) {
                    str2 = str.substring(prefix.length(), str.length() - suffix.length());
                    Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        return str2;
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    @InlineOnly
    private static final String replace(CharSequence charSequence, Regex regex, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    @NotNull
    public static final String replaceAfter(@NotNull String str, char c2, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        indexOf$default = indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, indexOf$default + 1, str.length(), (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String replaceAfter(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, indexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String str, char c2, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, lastIndexOf$default + 1, str.length(), (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, lastIndexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    @NotNull
    public static final String replaceBefore(@NotNull String str, char c2, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        indexOf$default = indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String replaceBefore(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String str, char c2, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c2, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    @InlineOnly
    private static final String replaceFirst(CharSequence charSequence, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "replaceFirstCharWithChar")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final String replaceFirstCharWithChar(String str, Function1<? super Character, Character> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        String str2 = str;
        if (str.length() > 0) {
            char charValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            str2 = charValue + substring;
        }
        return str2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "replaceFirstCharWithCharSequence")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final String replaceFirstCharWithCharSequence(String str, Function1<? super Character, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        String str2 = str;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            str2 = sb.toString();
        }
        return str2;
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence charSequence, int i2, int i3, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i3 >= i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i2);
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            sb.append(replacement);
            sb.append(charSequence, i3, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence charSequence, @NotNull IntRange range, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    @InlineOnly
    private static final String replaceRange(String str, int i2, int i3, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return replaceRange((CharSequence) str, i2, i3, replacement).toString();
    }

    @InlineOnly
    private static final String replaceRange(String str, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return replaceRange((CharSequence) str, range, replacement).toString();
    }

    public static final void requireNonNegativeLimit(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    @InlineOnly
    private static final List<String> split(CharSequence charSequence, Regex regex, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i2);
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z, int i2) {
        Iterable<IntRange> asIterable;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(delimiters[0]), z, i2);
        }
        asIterable = SequencesKt___SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i2, 2, (Object) null));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(asIterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IntRange intRange : asIterable) {
            arrayList.add(substring(charSequence, intRange));
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z, int i2) {
        Iterable<IntRange> asIterable;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return split$StringsKt__StringsKt(charSequence, str, z, i2);
            }
        }
        asIterable = SequencesKt___SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i2, 2, (Object) null));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(asIterable, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (IntRange intRange : asIterable) {
            arrayList.add(substring(charSequence, intRange));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z, int i2) {
        List<String> listOf;
        int length;
        int indexOf;
        int coerceAtMost;
        requireNonNegativeLimit(i2);
        int i3 = 0;
        int indexOf2 = indexOf(charSequence, str, 0, z);
        if (indexOf2 == -1 || i2 == 1) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(charSequence.toString());
            return listOf;
        }
        boolean z2 = i2 > 0;
        int i4 = 10;
        if (z2) {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(i2, 10);
            i4 = coerceAtMost;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i5 = indexOf2;
        do {
            arrayList.add(charSequence.subSequence(i3, i5).toString());
            length = str.length() + i5;
            if (z2 && arrayList.size() == i2 - 1) {
                break;
            }
            indexOf = indexOf(charSequence, str, length, z);
            i3 = length;
            i5 = indexOf;
        } while (indexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return split(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return split(charSequence, strArr, z, i2);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Sequence<String> splitToSequence(CharSequence charSequence, Regex regex, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull final CharSequence charSequence, @NotNull char[] delimiters, boolean z, int i2) {
        Sequence<String> map;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        map = SequencesKt___SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i2, 2, (Object) null), new Function1<IntRange, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt__StringsKt.substring(charSequence, it);
            }
        });
        return map;
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull final CharSequence charSequence, @NotNull String[] delimiters, boolean z, int i2) {
        Sequence<String> map;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        map = SequencesKt___SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i2, 2, (Object) null), new Function1<IntRange, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull IntRange it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt__StringsKt.substring(charSequence, it);
            }
        });
        return map;
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, Regex regex, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i2);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return splitToSequence(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return splitToSequence(charSequence, strArr, z, i2);
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        boolean z2 = false;
        if (charSequence.length() > 0) {
            z2 = false;
            if (CharsKt__CharKt.equals(charSequence.charAt(0), c2, z)) {
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z && (charSequence instanceof String) && (prefix instanceof String)) ? StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) prefix, i2, false, 4, null) : regionMatchesImpl(charSequence, i2, prefix, 0, prefix.length(), z);
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof String) && (prefix instanceof String)) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default((String) charSequence, (String) prefix, false, 2, null);
            return startsWith$default;
        }
        return regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, c2, z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, i2, z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, z);
    }

    @NotNull
    public static final CharSequence subSequence(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    private static final CharSequence subSequence(String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.subSequence(i2, i3);
    }

    @InlineOnly
    private static final String substring(CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    @NotNull
    public static final String substring(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    @NotNull
    public static final String substring(@NotNull String str, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substring$default(CharSequence charSequence, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = charSequence.length();
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i2, i3).toString();
    }

    @NotNull
    public static final String substringAfter(@NotNull String str, char c2, @NotNull String missingDelimiterValue) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        indexOf$default = indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = str.substring(indexOf$default + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String substringAfter(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = str.substring(indexOf$default + delimiter.length(), str.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c2, str2);
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    @NotNull
    public static String substringAfterLast(@NotNull String str, char c2, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = str.substring(lastIndexOf$default + 1, str.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String substringAfterLast(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = str.substring(lastIndexOf$default + delimiter.length(), str.length());
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c2, String str2, int i2, Object obj) {
        String substringAfterLast;
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        substringAfterLast = substringAfterLast(str, c2, str2);
        return substringAfterLast;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    @NotNull
    public static final String substringBefore(@NotNull String str, char c2, @NotNull String missingDelimiterValue) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        indexOf$default = indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = str.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String substringBefore(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            missingDelimiterValue = str.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c2, str2);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String str, char c2, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = str.substring(0, lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default != -1) {
            missingDelimiterValue = str.substring(0, lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c2, str2);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    @SinceKotlin(version = "1.5")
    public static final boolean toBooleanStrict(@NotNull String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            z = true;
        } else if (!Intrinsics.areEqual(str, "false")) {
            throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
        } else {
            z = false;
        }
        return z;
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.areEqual(str, "true") ? Boolean.TRUE : Intrinsics.areEqual(str, "false") ? Boolean.FALSE : null;
    }

    @NotNull
    public static CharSequence trim(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean isWhitespace = CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z ? i2 : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence, @NotNull char... chars) {
        boolean contains;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            contains = ArraysKt___ArraysKt.contains(chars, charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @InlineOnly
    private static final String trim(String str) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(str, "<this>");
        trim = trim((CharSequence) str);
        return trim.toString();
    }

    @NotNull
    public static final String trim(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(str.charAt(!z ? i2 : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i2++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    @NotNull
    public static final String trim(@NotNull String str, @NotNull char... chars) {
        boolean contains;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            contains = ArraysKt___ArraysKt.contains(chars, str.charAt(!z ? i2 : length));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i2++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence) {
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(length))) {
                    charSequence2 = charSequence.subSequence(0, length + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        charSequence2 = "";
        return charSequence2;
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i2 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i2 < 0) {
                return "";
            }
            length = i2;
        }
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence, @NotNull char... chars) {
        CharSequence charSequence2;
        boolean contains;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                contains = ArraysKt___ArraysKt.contains(chars, charSequence.charAt(length));
                if (!contains) {
                    charSequence2 = charSequence.subSequence(0, length + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        charSequence2 = "";
        return charSequence2;
    }

    @InlineOnly
    private static final String trimEnd(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return trimEnd((CharSequence) str).toString();
    }

    @NotNull
    public static final String trimEnd(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    @NotNull
    public static final String trimEnd(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequence;
        boolean contains;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                contains = ArraysKt___ArraysKt.contains(chars, str.charAt(length));
                if (!contains) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence) {
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequence2 = "";
                break;
            } else if (!CharsKt__CharJVMKt.isWhitespace(charSequence.charAt(i2))) {
                charSequence2 = charSequence.subSequence(i2, charSequence.length());
                break;
            } else {
                i2++;
            }
        }
        return charSequence2;
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                return charSequence.subSequence(i2, charSequence.length());
            }
        }
        return "";
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence, @NotNull char... chars) {
        CharSequence charSequence2;
        boolean contains;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequence2 = "";
                break;
            }
            contains = ArraysKt___ArraysKt.contains(chars, charSequence.charAt(i2));
            if (!contains) {
                charSequence2 = charSequence.subSequence(i2, charSequence.length());
                break;
            }
            i2++;
        }
        return charSequence2;
    }

    @InlineOnly
    private static final String trimStart(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return trimStart((CharSequence) str).toString();
    }

    @NotNull
    public static final String trimStart(@NotNull String str, @NotNull Function1<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequence = "";
                break;
            } else if (!predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
                charSequence = str.subSequence(i2, str.length());
                break;
            } else {
                i2++;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String trimStart(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequence;
        boolean contains;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequence = "";
                break;
            }
            contains = ArraysKt___ArraysKt.contains(chars, str.charAt(i2));
            if (!contains) {
                charSequence = str.subSequence(i2, str.length());
                break;
            }
            i2++;
        }
        return charSequence.toString();
    }
}
