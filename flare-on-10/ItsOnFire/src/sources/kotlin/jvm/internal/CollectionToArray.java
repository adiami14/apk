package kotlin.jvm.internal;

import androidx.appcompat.R;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��2\n��\n\u0002\u0010\u0011\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0082\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010��\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n��¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmName(name = "CollectionToArray")
/* loaded from: ItsOnFire.jar:kotlin/jvm/internal/CollectionToArray.class */
public final class CollectionToArray {
    @NotNull
    private static final Object[] EMPTY = new Object[0];
    private static final int MAX_SIZE = 2147483645;

    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull Collection<?> collection) {
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 < objArr.length) {
                        objArr2 = objArr;
                        if (!it.hasNext()) {
                            objArr = Arrays.copyOf(objArr, i3);
                            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(result, size)");
                            break;
                        }
                        i2 = i3;
                        objArr = objArr2;
                    } else if (!it.hasNext()) {
                        break;
                    } else {
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        int i5 = i4;
                        if (i4 <= i3) {
                            if (i3 >= MAX_SIZE) {
                                throw new OutOfMemoryError();
                            }
                            i5 = MAX_SIZE;
                        }
                        objArr2 = Arrays.copyOf(objArr, i5);
                        Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(result, newSize)");
                        i2 = i3;
                        objArr = objArr2;
                    }
                }
                return objArr;
            }
        }
        objArr = EMPTY;
        return objArr;
    }

    @JvmName(name = "toArray")
    @NotNull
    public static final Object[] toArray(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            objArr3 = objArr;
            if (objArr.length > 0) {
                objArr[0] = null;
                objArr3 = objArr;
            }
        } else {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    objArr3 = objArr2;
                    int i3 = i2 + 1;
                    objArr3[i2] = it.next();
                    if (i3 < objArr3.length) {
                        objArr4 = objArr3;
                        if (it.hasNext()) {
                            i2 = i3;
                            objArr2 = objArr4;
                        } else if (objArr3 == objArr) {
                            objArr[i3] = null;
                            objArr3 = objArr;
                        } else {
                            objArr3 = Arrays.copyOf(objArr3, i3);
                            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(result, size)");
                        }
                    } else if (!it.hasNext()) {
                        break;
                    } else {
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        int i5 = i4;
                        if (i4 <= i3) {
                            if (i3 >= MAX_SIZE) {
                                throw new OutOfMemoryError();
                            }
                            i5 = MAX_SIZE;
                        }
                        objArr4 = Arrays.copyOf(objArr3, i5);
                        Intrinsics.checkNotNullExpressionValue(objArr4, "copyOf(result, newSize)");
                        i2 = i3;
                        objArr2 = objArr4;
                    }
                }
            } else {
                objArr3 = objArr;
                if (objArr.length > 0) {
                    objArr[0] = null;
                    objArr3 = objArr;
                }
            }
        }
        return objArr3;
    }

    private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> function0, Function1<? super Integer, Object[]> function1, Function2<? super Object[], ? super Integer, Object[]> function2) {
        Object[] objArr;
        Object[] invoke;
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object obj = (Object[]) function1.invoke(Integer.valueOf(size));
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    obj[i2] = it.next();
                    if (i3 < obj.length) {
                        objArr = obj;
                        if (!it.hasNext()) {
                            invoke = function2.invoke(obj, Integer.valueOf(i3));
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return obj;
                    } else {
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        int i5 = i4;
                        if (i4 <= i3) {
                            if (i3 >= MAX_SIZE) {
                                throw new OutOfMemoryError();
                            }
                            i5 = MAX_SIZE;
                        }
                        objArr = Arrays.copyOf(obj, i5);
                        Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(result, newSize)");
                    }
                    i2 = i3;
                    obj = objArr;
                }
            }
        }
        invoke = function0.invoke();
        return invoke;
    }
}
