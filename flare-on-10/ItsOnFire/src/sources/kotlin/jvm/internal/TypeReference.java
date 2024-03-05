package kotlin.jvm.internal;

import androidx.appcompat.R;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@SinceKotlin(version = "1.4")
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010��\n\u0002\b\u0004\b\u0007\u0018�� )2\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\bH\u0002J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\f\u0010\"\u001a\u00020\u001e*\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8��X\u0081\u0004¢\u0006\u000e\n��\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018��X\u0081\u0004¢\u0006\u000e\n��\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "flags", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getFlags$kotlin_stdlib$annotations", "()V", "getFlags$kotlin_stdlib", "()I", "()Z", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "convertPrimitiveToWrapper", "equals", "other", "", "hashCode", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/jvm/internal/TypeReference.class */
public final class TypeReference implements KType {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    @NotNull
    private final List<KTypeProjection> arguments;
    @NotNull
    private final KClassifier classifier;
    private final int flags;
    @Nullable
    private final KType platformTypeUpperBound;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n��R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n��¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/TypeReference$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/TypeReference$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            iArr[KVariance.IN.ordinal()] = 2;
            iArr[KVariance.OUT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, @Nullable KType kType, int i2) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = kType;
        this.flags = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean z) {
        this(classifier, arguments, null, z ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String asString(kotlin.reflect.KTypeProjection r4) {
        /*
            r3 = this;
            r0 = r4
            kotlin.reflect.KVariance r0 = r0.getVariance()
            if (r0 != 0) goto La
            java.lang.String r0 = "*"
            return r0
        La:
            r0 = r4
            kotlin.reflect.KType r0 = r0.getType()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof kotlin.jvm.internal.TypeReference
            if (r0 == 0) goto L1e
            r0 = r5
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            r5 = r0
            goto L20
        L1e:
            r0 = 0
            r5 = r0
        L20:
            r0 = r5
            if (r0 == 0) goto L30
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.asString(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L38
        L30:
            r0 = r4
            kotlin.reflect.KType r0 = r0.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = r0
        L38:
            r0 = r4
            kotlin.reflect.KVariance r0 = r0.getVariance()
            r4 = r0
            int[] r0 = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L8d
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L71
            r0 = r7
            r1 = 3
            if (r0 != r1) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            java.lang.String r0 = "out "
            r4 = r0
            goto L7c
        L69:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            java.lang.String r0 = "in "
            r4 = r0
        L7c:
            r0 = r6
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            r4 = r0
        L8d:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.TypeReference.asString(kotlin.reflect.KTypeProjection):java.lang.String");
    }

    private final String asString(boolean z) {
        String name;
        String joinToString$default;
        String str;
        KClassifier classifier = getClassifier();
        Class<?> cls = null;
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        if (kClass != null) {
            cls = JvmClassMappingKt.getJavaClass(kClass);
        }
        if (cls == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            name = getArrayClassName(cls);
        } else if (z && cls.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.getJavaObjectType((KClass) classifier2).getName();
        } else {
            name = cls.getName();
        }
        if (getArguments().isEmpty()) {
            str = "";
        } else {
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new Function1<KTypeProjection, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull KTypeProjection it) {
                    String asString;
                    Intrinsics.checkNotNullParameter(it, "it");
                    asString = TypeReference.this.asString(it);
                    return asString;
                }
            }, 24, null);
            str = joinToString$default;
        }
        String str2 = name + str + (isMarkedNullable() ? "?" : "");
        KType kType = this.platformTypeUpperBound;
        String str3 = str2;
        if (kType instanceof TypeReference) {
            String asString = ((TypeReference) kType).asString(true);
            if (Intrinsics.areEqual(asString, str2)) {
                str3 = str2;
            } else {
                if (Intrinsics.areEqual(asString, str2 + '?')) {
                    str3 = str2 + '!';
                } else {
                    str3 = '(' + str2 + ".." + asString + ')';
                }
            }
        }
        return str3;
    }

    private final String getArrayClassName(Class<?> cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public KClassifier getClassifier() {
        return this.classifier;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    @Nullable
    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.valueOf(this.flags).hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        boolean z = true;
        if ((this.flags & 1) == 0) {
            z = false;
        }
        return z;
    }

    @NotNull
    public String toString() {
        return asString(false) + Reflection.REFLECTION_NOT_AVAILABLE;
    }
}
