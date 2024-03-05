package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
/* loaded from: ItsOnFire.jar:androidx/core/util/ObjectsCompat.class */
public class ObjectsCompat {

    @RequiresApi(19)
    /* loaded from: ItsOnFire.jar:androidx/core/util/ObjectsCompat$Api19Impl.class */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static boolean equals(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @DoNotInline
        public static int hash(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return Api19Impl.equals(obj, obj2);
    }

    public static int hash(@Nullable Object... objArr) {
        return Api19Impl.hash(objArr);
    }

    public static int hashCode(@Nullable Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t2) {
        t2.getClass();
        return t2;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t2, @NonNull String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }

    @Nullable
    public static String toString(@Nullable Object obj, @Nullable String str) {
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }
}
