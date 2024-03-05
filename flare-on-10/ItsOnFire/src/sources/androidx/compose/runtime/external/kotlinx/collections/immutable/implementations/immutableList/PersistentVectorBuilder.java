package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��~\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0011\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n��\n\u0002\u0010*\n��\n\u0002\u0010+\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0018\b��\u0018��*\u0004\b��\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028��H\u0016¢\u0006\u0002\u0010\u001fJ\u001d\u0010\u001c\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028��H\u0016¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028��0%H\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028��0%H\u0016J\u001d\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00028��0\u0005H\u0016J=\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010+\u001a\u00020\u000b2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-H\u0002¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00028��2\u0006\u0010!\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\u000bH��¢\u0006\u0002\b2JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u000206H\u0002¢\u0006\u0002\u00107J[\u00103\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028��0%2\u0006\u0010!\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010<J/\u0010=\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028��H\u0002¢\u0006\u0002\u0010>J\u001d\u0010?\u001a\u00020\u001d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010@J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00028��0BH\u0096\u0002J\u001e\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070D2\u0006\u0010!\u001a\u00020\u000bH\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00028��0FH\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00028��0F2\u0006\u0010!\u001a\u00020\u000bH\u0016J'\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010HJ-\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010J\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010KJ\u0015\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010\u0012J\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010NJ5\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010PJ?\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u000206H\u0002¢\u0006\u0002\u0010TJ/\u0010U\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010VJM\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0014\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070-H\u0002¢\u0006\u0002\u0010YJE\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0007H\u0002¢\u0006\u0002\u0010[J?\u0010\\\u001a\u00020 2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010_J?\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010aJu\u0010b\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u001d0d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u0002062\u0014\u0010h\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070i2\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070iH\u0002¢\u0006\u0002\u0010jJ\u001c\u0010k\u001a\u00020\u001d2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u001d0dH\u0002JA\u0010k\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u001d0d2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010g\u001a\u000206H\u0002¢\u0006\u0002\u0010lJ\u0016\u0010k\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028��0%H\u0016J,\u0010m\u001a\u00020\u000b2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u001d0d2\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010g\u001a\u000206H\u0002J\u001a\u0010o\u001a\u00020\u001d2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028��\u0012\u0004\u0012\u00020\u001d0dJ\u0015\u0010p\u001a\u00028��2\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0002\u00100J=\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010S\u001a\u000206H\u0002¢\u0006\u0002\u0010TJ9\u0010r\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010sJ/\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010KJ\b\u0010R\u001a\u00020\u000bH\u0002J\u001e\u0010u\u001a\u00028��2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00028��H\u0096\u0002¢\u0006\u0002\u0010vJE\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010x\u001a\u00028��2\u0006\u0010y\u001a\u000206H\u0002¢\u0006\u0002\u00107JU\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010{\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0002\u0010|Jl\u0010}\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028��0%2\u0006\u0010!\u001a\u00020\u000b2\u000e\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u007f\u001a\u00020\u000b2\u0016\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001a\u00020\u000b2\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002¢\u0006\u0003\u0010\u0080\u0001J\b\u0010n\u001a\u00020\u000bH\u0002J\u0010\u0010n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n��R4\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b@RX\u0096\u000e¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0015R0\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028��0\u0005X\u0082\u000e¢\u0006\u0002\n��R\u001a\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "", "", "vectorTail", "rootShift", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "root", "getRoot$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getRootShift$runtime_release", "()I", "setRootShift$runtime_release", "(I)V", "size", "getSize", "tail", "getTail$runtime_release", "add", "", "element", "(Ljava/lang/Object;)Z", "", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)V", "addAll", "elements", "", "bufferFor", "(I)[Ljava/lang/Object;", "build", "copyToBuffer", "buffer", "bufferIndex", "sourceIterator", "", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "getModCount", "getModCount$runtime_release", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rightShift", "buffers", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "isMutable", "([Ljava/lang/Object;)Z", "iterator", "", "leafBufferIterator", "", "listIterator", "", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "makeMutableShiftingRight", "distance", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBuffer", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "pullLastBuffer", "rootSize", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pushBuffers", "buffersIterator", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "recyclableRemoveAll", "predicate", "Lkotlin/Function1;", "bufferSize", "toBufferSize", "bufferRef", "recyclableBuffers", "", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "removeAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "removeAllFromTail", "tailSize", "removeAllWithPredicate", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "retainFirst", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setInRoot", "e", "oldElementCarry", "shiftLeafBuffers", "startLeafIndex", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "splitToBuffers", "startBuffer", "startBufferSize", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder.class */
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    @NotNull
    private MutabilityOwnership ownership;
    @Nullable
    private Object[] root;
    private int rootShift;
    private int size;
    @NotNull
    private Object[] tail;
    @NotNull
    private PersistentList<? extends E> vector;
    @Nullable
    private Object[] vectorRoot;
    @NotNull
    private Object[] vectorTail;

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> vector, @Nullable Object[] objArr, @NotNull Object[] vectorTail, int i2) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(vectorTail, "vectorTail");
        this.vector = vector;
        this.vectorRoot = objArr;
        this.vectorTail = vectorTail;
        this.rootShift = i2;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i2) {
        if (rootSize() <= i2) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i2, i3)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i2, Iterator<? extends Object> it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i5 = i2 >> 5;
        Object[] shiftLeafBuffers = shiftLeafBuffers(i5, i3, objArr, i4, objArr2);
        int rootSize = i4 - (((rootSize() >> 5) - 1) - i5);
        if (rootSize < i4) {
            objArr2 = objArr[rootSize];
            Intrinsics.checkNotNull(objArr2);
        }
        splitToBuffers(collection, i2, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        Object[] copyInto;
        int indexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            objectRef.setValue(objArr[31]);
            copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            copyInto[indexSegment] = obj;
            return copyInto;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i4 = i2 - 5;
        Object obj3 = makeMutable[indexSegment];
        if (obj3 != null) {
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i4, i3, obj, objectRef);
            for (int i5 = indexSegment + 1; i5 < 32 && (obj2 = makeMutable[i5]) != null; i5++) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                makeMutable[i5] = insertIntoRoot((Object[]) obj2, i4, 0, objectRef.getValue(), objectRef);
            }
            return makeMutable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final void insertIntoTail(Object[] objArr, int i2, E e2) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            ArraysKt___ArraysJvmKt.copyInto(this.tail, makeMutable, i2 + 1, i2, tailSize);
            makeMutable[i2] = e2;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, makeMutable, i2 + 1, i2, 31);
        makeMutable[i2] = e2;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i2) {
        if (this.root != null) {
            int rootSize = rootSize() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i2, rootSize);
            int i3 = this.rootShift;
            if (i3 == 0) {
                Object[] objArr = this.root;
                Intrinsics.checkNotNull(objArr);
                return new SingleElementListIterator(objArr, i2);
            }
            int i4 = i3 / 5;
            Object[] objArr2 = this.root;
            Intrinsics.checkNotNull(objArr2);
            return new TrieIterator(objArr2, i2, rootSize, i4);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] makeMutable(Object[] objArr) {
        int coerceAtMost;
        Object[] copyInto$default;
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(objArr.length, 32);
        copyInto$default = ArraysKt___ArraysJvmKt.copyInto$default(objArr, mutableBuffer, 0, 0, coerceAtMost, 6, (Object) null);
        return copyInto$default;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i2) {
        Object[] copyInto;
        Object[] copyInto2;
        if (isMutable(objArr)) {
            copyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2, 0, 32 - i2);
            return copyInto2;
        }
        copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, mutableBuffer(), i2, 0, 32 - i2);
        return copyInto;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i2, int i3) {
        Object[] copyInto;
        if (i3 >= 0) {
            if (i3 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i2, i3);
            Object obj = objArr[indexSegment];
            if (obj != null) {
                Object nullifyAfter = nullifyAfter((Object[]) obj, i2, i3 - 5);
                Object[] objArr2 = objArr;
                if (indexSegment < 31) {
                    int i4 = indexSegment + 1;
                    objArr2 = objArr;
                    if (objArr[i4] != null) {
                        if (isMutable(objArr)) {
                            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i4, 32);
                        }
                        copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, mutableBuffer(), 0, 0, i4);
                        objArr2 = copyInto;
                    }
                }
                Object[] objArr3 = objArr2;
                if (nullifyAfter != objArr2[indexSegment]) {
                    objArr3 = makeMutable(objArr2);
                    objArr3[indexSegment] = nullifyAfter;
                }
                return objArr3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i3 - 1, i2);
        if (i2 == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            pullLastBuffer = pullLastBuffer((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            this.root = null;
            Object[] objArr2 = objArr;
            if (objArr == null) {
                objArr2 = new Object[0];
            }
            this.tail = objArr2;
            this.size = i2;
            this.rootShift = i3;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i3, i2, objectRef);
        Intrinsics.checkNotNull(pullLastBuffer);
        Object value = objectRef.getValue();
        if (value == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.tail = (Object[]) value;
        this.size = i2;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            i3 -= 5;
        } else {
            this.root = pullLastBuffer;
        }
        this.rootShift = i3;
    }

    private final Object[] pushBuffers(Object[] objArr, int i2, int i3, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i3 >= 0) {
                if (i3 == 0) {
                    return it.next();
                }
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i2, i3);
                int i4 = i3 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i2, i4, it);
                int i5 = indexSegment;
                while (true) {
                    i5++;
                    if (i5 >= 32 || !it.hasNext()) {
                        break;
                    }
                    makeMutable[i5] = pushBuffers((Object[]) makeMutable[i5], 0, i4, it);
                }
                return makeMutable;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i2, Object[][] objArr2) {
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i3 = this.rootShift;
        Object[] pushBuffers = (i2 >> 5) < (1 << i3) ? pushBuffers(objArr, i2, i3, it) : makeMutable(objArr);
        while (it.hasNext()) {
            this.rootShift += 5;
            pushBuffers = mutableBufferWith(pushBuffers);
            int i4 = this.rootShift;
            pushBuffers(pushBuffers, 1 << i4, i4, it);
        }
        return pushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i2 = this.rootShift;
        if ((size >> 5) > (1 << i2)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
        } else {
            if (objArr == null) {
                this.root = objArr2;
            } else {
                this.root = pushTail(objArr, objArr2, i2);
            }
            this.tail = objArr3;
        }
        this.size = size() + 1;
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i2) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i2);
        Object[] makeMutable = makeMutable(objArr);
        if (i2 == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i2 - 5);
        }
        return makeMutable;
    }

    private final int recyclableRemoveAll(Function1<? super E, Boolean> function1, Object[] objArr, int i2, int i3, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        if (value != null) {
            Object[] objArr2 = (Object[]) value;
            Object[] objArr3 = objArr2;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= i2) {
                    break;
                }
                int i6 = i5 + 1;
                Object obj = objArr[i5];
                if (function1.invoke(obj).booleanValue()) {
                    i4 = i6;
                } else {
                    int i7 = i3;
                    objArr3 = objArr3;
                    if (i3 == 32) {
                        i7 = 0;
                        objArr3 = list.isEmpty() ^ true ? list.remove(list.size() - 1) : mutableBuffer();
                    }
                    objArr3[i7] = obj;
                    i3 = i7 + 1;
                    i4 = i6;
                }
            }
            objectRef.setValue(objArr3);
            if (objArr2 != objectRef.getValue()) {
                list2.add(objArr2);
            }
            return i3;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final int removeAll(Function1<? super E, Boolean> function1, Object[] objArr, int i2, ObjectRef objectRef) {
        boolean z;
        Object[] objArr2;
        int i3;
        int i4;
        int i5 = 0;
        Object obj = objArr;
        int i6 = i2;
        boolean z2 = false;
        while (i5 < i2) {
            Object obj2 = objArr[i5];
            if (function1.invoke(obj2).booleanValue()) {
                z = z2;
                objArr2 = obj;
                i3 = i6;
                if (z2) {
                    i5++;
                    z2 = z;
                    obj = objArr2;
                    i6 = i3;
                } else {
                    obj = makeMutable(objArr);
                    z2 = true;
                    i4 = i5;
                    i3 = i4;
                    objArr2 = obj;
                    z = z2;
                    i5++;
                    z2 = z;
                    obj = objArr2;
                    i6 = i3;
                }
            } else {
                z = z2;
                objArr2 = obj;
                i3 = i6;
                if (z2) {
                    obj[i6] = obj2;
                    i4 = i6 + 1;
                    i3 = i4;
                    objArr2 = obj;
                    z = z2;
                    i5++;
                    z2 = z;
                    obj = objArr2;
                    i6 = i3;
                } else {
                    i5++;
                    z2 = z;
                    obj = objArr2;
                    i6 = i3;
                }
            }
        }
        objectRef.setValue(obj);
        return i6;
    }

    private final boolean removeAll(Function1<? super E, Boolean> function1) {
        int i2;
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        boolean z = false;
        if (this.root == null) {
            if (removeAllFromTail(function1, tailSize, objectRef) != tailSize) {
                z = true;
            }
            return z;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i3 = 32;
        while (true) {
            i2 = i3;
            if (i2 != 32 || !leafBufferIterator.hasNext()) {
                break;
            }
            i3 = removeAll(function1, leafBufferIterator.next(), 32, objectRef);
        }
        if (i2 == 32) {
            CommonFunctionsKt.m2010assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(function1, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            boolean z2 = false;
            if (removeAllFromTail != tailSize) {
                z2 = true;
            }
            return z2;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = i2;
        while (leafBufferIterator.hasNext()) {
            i4 = recyclableRemoveAll(function1, leafBufferIterator.next(), 32, i4, objectRef, arrayList2, arrayList);
        }
        int recyclableRemoveAll = recyclableRemoveAll(function1, this.tail, tailSize, i4, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        if (value != null) {
            Object[] objArr = (Object[]) value;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, recyclableRemoveAll, 32);
            if (arrayList.isEmpty()) {
                pushBuffers = this.root;
                Intrinsics.checkNotNull(pushBuffers);
            } else {
                pushBuffers = pushBuffers(this.root, previousIndex, this.rootShift, arrayList.iterator());
            }
            int size = previousIndex + (arrayList.size() << 5);
            this.root = retainFirst(pushBuffers, size);
            this.tail = objArr;
            this.size = size + recyclableRemoveAll;
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> function1, int i2, ObjectRef objectRef) {
        int removeAll = removeAll(function1, this.tail, i2, objectRef);
        if (removeAll == i2) {
            CommonFunctionsKt.m2010assert(objectRef.getValue() == this.tail);
            return i2;
        }
        Object value = objectRef.getValue();
        if (value != null) {
            Object[] objArr = (Object[]) value;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, removeAll, i2);
            this.tail = objArr;
            this.size = size() - (i2 - removeAll);
            return removeAll;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] copyInto;
        int indexSegment = UtilsKt.indexSegment(i3, i2);
        int i4 = 31;
        if (i2 == 0) {
            Object obj = objArr[indexSegment];
            copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            copyInto[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return copyInto;
        }
        if (objArr[31] == null) {
            i4 = UtilsKt.indexSegment(rootSize() - 1, i2);
        }
        Object[] makeMutable = makeMutable(objArr);
        int i5 = i2 - 5;
        int i6 = indexSegment + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = makeMutable[i4];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                makeMutable[i4] = removeFromRootAt((Object[]) obj2, i5, 0, objectRef);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        if (obj3 != null) {
            makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i5, i3, objectRef);
            return makeMutable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object removeFromTailAt(Object[] objArr, int i2, int i3, int i4) {
        Object[] copyInto;
        Object obj;
        int size = size() - i2;
        CommonFunctionsKt.m2010assert(i4 < size);
        if (size == 1) {
            Object obj2 = this.tail[0];
            pullLastBufferFromRoot(objArr, i2, i3);
            obj = obj2;
        } else {
            Object[] objArr2 = this.tail;
            Object obj3 = objArr2[i4];
            copyInto = ArraysKt___ArraysJvmKt.copyInto(objArr2, makeMutable(objArr2), i4, i4 + 1, size);
            copyInto[size - 1] = null;
            this.root = objArr;
            this.tail = copyInto;
            this.size = (i2 + size) - 1;
            this.rootShift = i3;
            obj = obj3;
        }
        return obj;
    }

    private final Object[] retainFirst(Object[] objArr, int i2) {
        if (!((i2 & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i3 = i2 - 1;
        while (true) {
            int i4 = this.rootShift;
            if ((i3 >> i4) != 0) {
                return nullifyAfter(objArr, i3, i4);
            }
            this.rootShift = i4 - 5;
            Object[] objArr2 = objArr[0];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i2, int i3, E e2, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i3, i2);
        Object[] makeMutable = makeMutable(objArr);
        if (i2 == 0) {
            if (makeMutable != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e2;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        if (obj != null) {
            makeMutable[indexSegment] = setInRoot((Object[]) obj, i2 - 5, i3, e2, objectRef);
            return makeMutable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] shiftLeafBuffers(int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
            while (leafBufferIterator.previousIndex() != i2) {
                Object[] previous = leafBufferIterator.previous();
                ArraysKt___ArraysJvmKt.copyInto(previous, objArr2, 0, 32 - i3, 32);
                objArr2 = makeMutableShiftingRight(previous, i3);
                i4--;
                objArr[i4] = objArr2;
            }
            return leafBufferIterator.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] mutableBuffer;
        if (!(i4 >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] makeMutable = makeMutable(objArr);
        objArr2[0] = makeMutable;
        int i5 = i2 & 31;
        int size = ((i2 + collection.size()) - 1) & 31;
        int i6 = (i3 - i5) + size;
        if (i6 < 32) {
            ArraysKt___ArraysJvmKt.copyInto(makeMutable, objArr3, size + 1, i5, i3);
        } else {
            if (i4 == 1) {
                mutableBuffer = makeMutable;
            } else {
                mutableBuffer = mutableBuffer();
                i4--;
                objArr2[i4] = mutableBuffer;
            }
            int i7 = i3 - ((i6 - 32) + 1);
            ArraysKt___ArraysJvmKt.copyInto(makeMutable, objArr3, 0, i7, i3);
            ArraysKt___ArraysJvmKt.copyInto(makeMutable, mutableBuffer, size + 1, i5, i7);
            objArr3 = mutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(makeMutable, i5, it);
        for (int i8 = 1; i8 < i4; i8++) {
            objArr2[i8] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final int tailSize(int i2) {
        return i2 <= 32 ? i2 : i2 - UtilsKt.rootSize(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            add(e2);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i2 >= rootSize) {
            insertIntoTail(this.root, i2 - rootSize, e2);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i2, e2, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize >= 32) {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e2));
            return true;
        }
        Object[] makeMutable = makeMutable(this.tail);
        makeMutable[tailSize] = e2;
        this.tail = makeMutable;
        this.size = size() + 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, @NotNull Collection<? extends E> elements) {
        Object[] copyInto;
        Object[] objArr;
        Object[] copyInto2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        if (i2 == size()) {
            return addAll(elements);
        }
        boolean z = false;
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = (((size() - i3) + elements.size()) - 1) / 32;
        if (size == 0) {
            if (i2 >= rootSize()) {
                z = true;
            }
            CommonFunctionsKt.m2010assert(z);
            int i4 = i2 & 31;
            int size2 = elements.size();
            Object[] objArr2 = this.tail;
            copyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr2, makeMutable(objArr2), (((i2 + size2) - 1) & 31) + 1, i4, tailSize());
            copyToBuffer(copyInto2, i4, elements.iterator());
            this.tail = copyInto2;
        } else {
            ?? r0 = new Object[size];
            int tailSize = tailSize();
            int tailSize2 = tailSize(size() + elements.size());
            if (i2 >= rootSize()) {
                objArr = mutableBuffer();
                splitToBuffers(elements, i2, this.tail, tailSize, r0, size, objArr);
            } else if (tailSize2 > tailSize) {
                int i5 = tailSize2 - tailSize;
                objArr = makeMutableShiftingRight(this.tail, i5);
                insertIntoRoot(elements, i2, i5, r0, size, objArr);
            } else {
                int i6 = tailSize - tailSize2;
                copyInto = ArraysKt___ArraysJvmKt.copyInto(this.tail, mutableBuffer(), 0, i6, tailSize);
                objArr = copyInto;
                int i7 = 32 - i6;
                Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i7);
                int i8 = size - 1;
                r0[i8] = makeMutableShiftingRight;
                insertIntoRoot(elements, i2, i7, r0, i8, makeMutableShiftingRight);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i3, r0);
            this.tail = objArr;
        }
        this.size = size() + elements.size();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object[], java.lang.Object[][]] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = elements.iterator();
        if (32 - tailSize >= elements.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
        } else {
            int size = ((elements.size() + tailSize) - 1) / 32;
            ?? r0 = new Object[size];
            r0[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i2 = 1; i2 < size; i2++) {
                r0[i2] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), r0);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
        }
        this.size = size() + elements.size();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        PersistentList persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = (PersistentList<? extends E>) this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                Intrinsics.checkNotNull(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        return (E) bufferFor(i2)[i2 & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @NotNull
    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime_release(i2, size());
        return new PersistentVectorMutableIterator(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull final Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAllWithPredicate(new Function1<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(E e2) {
                return Boolean.valueOf(elements.contains(e2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((PersistentVectorBuilder$removeAll$1<E>) obj);
            }
        });
    }

    public final boolean removeAllWithPredicate(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean removeAll = removeAll(predicate);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i2 >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i2 - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i2, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime_release(i2, size());
        if (rootSize() > i2) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            Intrinsics.checkNotNull(objArr);
            this.root = setInRoot(objArr, this.rootShift, i2, e2, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] makeMutable = makeMutable(this.tail);
        if (makeMutable != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i3 = i2 & 31;
        E e3 = (E) makeMutable[i3];
        makeMutable[i3] = e2;
        this.tail = makeMutable;
        return e3;
    }

    public final void setRootShift$runtime_release(int i2) {
        this.rootShift = i2;
    }
}
