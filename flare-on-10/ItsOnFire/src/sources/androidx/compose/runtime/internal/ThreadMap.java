package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0016\n��\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n��\b��\u0018��2\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020��2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/runtime/internal/ThreadMap.class */
public final class ThreadMap {
    @NotNull
    private final long[] keys;
    private final int size;
    @NotNull
    private final Object[] values;

    public ThreadMap(int i2, @NotNull long[] keys, @NotNull Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.size = i2;
        this.keys = keys;
        this.values = values;
    }

    private final int find(long j2) {
        int i2 = this.size - 1;
        int i3 = -1;
        if (i2 != -1) {
            int i4 = 0;
            if (i2 != 0) {
                while (i4 <= i2) {
                    int i5 = (i4 + i2) >>> 1;
                    int i6 = ((this.keys[i5] - j2) > 0L ? 1 : ((this.keys[i5] - j2) == 0L ? 0 : -1));
                    if (i6 < 0) {
                        i4 = i5 + 1;
                    } else if (i6 <= 0) {
                        return i5;
                    } else {
                        i2 = i5 - 1;
                    }
                }
                return -(i4 + 1);
            }
            long j3 = this.keys[0];
            if (j3 == j2) {
                i3 = 0;
            } else {
                i3 = -1;
                if (j3 > j2) {
                    i3 = -2;
                }
            }
        }
        return i3;
    }

    @Nullable
    public final Object get(long j2) {
        int find = find(j2);
        return find >= 0 ? this.values[find] : null;
    }

    @NotNull
    public final ThreadMap newWith(long j2, @Nullable Object obj) {
        int i2;
        int i3 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= length) {
                break;
            }
            Object obj2 = objArr[i4];
            int i6 = i4 + 1;
            if (obj2 == null) {
                z = false;
            }
            i4 = i6;
            if (z) {
                i5++;
                i4 = i6;
            }
        }
        int i7 = i5 + 1;
        long[] jArr = new long[i7];
        Object[] objArr2 = new Object[i7];
        if (i7 > 1) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = i9;
                i2 = i10;
                if (i10 >= i7) {
                    break;
                }
                i2 = i10;
                if (i8 >= i3) {
                    break;
                }
                long j3 = this.keys[i8];
                Object obj3 = this.values[i8];
                if (j3 > j2) {
                    jArr[i10] = j2;
                    objArr2[i10] = obj;
                    i2 = i10 + 1;
                    break;
                }
                int i11 = i10;
                if (obj3 != null) {
                    jArr[i10] = j3;
                    objArr2[i10] = obj3;
                    i11 = i10 + 1;
                }
                i8++;
                i9 = i11;
            }
            int i12 = i8;
            if (i8 == i3) {
                int i13 = i7 - 1;
                jArr[i13] = j2;
                objArr2[i13] = obj;
            } else {
                while (i2 < i7) {
                    long j4 = this.keys[i12];
                    Object obj4 = this.values[i12];
                    int i14 = i2;
                    if (obj4 != null) {
                        jArr[i2] = j4;
                        objArr2[i2] = obj4;
                        i14 = i2 + 1;
                    }
                    i12++;
                    i2 = i14;
                }
            }
        } else {
            jArr[0] = j2;
            objArr2[0] = obj;
        }
        return new ThreadMap(i7, jArr, objArr2);
    }

    public final boolean trySet(long j2, @Nullable Object obj) {
        int find = find(j2);
        if (find < 0) {
            return false;
        }
        this.values[find] = obj;
        return true;
    }
}
