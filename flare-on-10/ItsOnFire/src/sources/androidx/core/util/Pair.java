package androidx.core.util;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:androidx/core/util/Pair.class */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f2, S s2) {
        this.first = f2;
        this.second = s2;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a2, B b2) {
        return new Pair<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            boolean z = false;
            if (ObjectsCompat.equals(pair.first, this.first)) {
                z = false;
                if (ObjectsCompat.equals(pair.second, this.second)) {
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    public int hashCode() {
        F f2 = this.first;
        int i2 = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.second;
        if (s2 != null) {
            i2 = s2.hashCode();
        }
        return hashCode ^ i2;
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
