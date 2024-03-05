package androidx.core.location;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: ItsOnFire.jar:androidx/core/location/LocationRequestCompat.class */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    public final long mDurationMillis;
    public final long mIntervalMillis;
    public final long mMaxUpdateDelayMillis;
    public final int mMaxUpdates;
    public final float mMinUpdateDistanceMeters;
    public final long mMinUpdateIntervalMillis;
    public final int mQuality;

    @RequiresApi(19)
    /* loaded from: ItsOnFire.jar:androidx/core/location/LocationRequestCompat$Api19Impl.class */
    public static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sCreateFromDeprecatedProviderMethod == null) {
                    Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    sCreateFromDeprecatedProviderMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = sCreateFromDeprecatedProviderMethod.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (sSetQualityMethod == null) {
                    Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", Integer.TYPE);
                    sSetQualityMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sSetQualityMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (sSetFastestIntervalMethod == null) {
                    Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    sSetFastestIntervalMethod = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                sSetFastestIntervalMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (sSetNumUpdatesMethod == null) {
                        Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        sSetNumUpdatesMethod = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    sSetNumUpdatesMethod.invoke(invoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (sSetExpireInMethod == null) {
                        Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", Long.TYPE);
                        sSetExpireInMethod = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    sSetExpireInMethod.invoke(invoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                return null;
            }
        }
    }

    @RequiresApi(31)
    /* loaded from: ItsOnFire.jar:androidx/core/location/LocationRequestCompat$Api31Impl.class */
    public static class Api31Impl {
        private Api31Impl() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.location.LocationRequest$Builder] */
        @DoNotInline
        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new Object(locationRequestCompat.getIntervalMillis()) { // from class: android.location.LocationRequest.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ LocationRequest build();

                @NonNull
                public native /* synthetic */ Builder setDurationMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdateDelayMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdates(int i2);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateDistanceMeters(float f2);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateIntervalMillis(long j2);

                @NonNull
                public native /* synthetic */ Builder setQuality(int i2);
            }.setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/location/LocationRequestCompat$Builder.class */
    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j2) {
            setIntervalMillis(j2);
            this.mQuality = 102;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        public Builder(@androidx.annotation.NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }

        @androidx.annotation.NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j2 = this.mIntervalMillis;
            return new LocationRequestCompat(j2, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j2), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @androidx.annotation.NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j2) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j2, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j2) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j2, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j2) {
            this.mMaxUpdateDelayMillis = j2;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j2, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, to = 2147483647L) int i2) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i2, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, to = 3.4028234663852886E38d) float f2) {
            this.mMinUpdateDistanceMeters = f2;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f2, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j2) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j2, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @androidx.annotation.NonNull
        public Builder setQuality(int i2) {
            Preconditions.checkArgument(i2 == 104 || i2 == 102 || i2 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i2));
            this.mQuality = i2;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/core/location/LocationRequestCompat$Quality.class */
    public @interface Quality {
    }

    public LocationRequestCompat(long j2, int i2, long j3, int i3, long j4, float f2, long j5) {
        this.mIntervalMillis = j2;
        this.mQuality = i2;
        this.mMinUpdateIntervalMillis = j4;
        this.mDurationMillis = j3;
        this.mMaxUpdates = i3;
        this.mMinUpdateDistanceMeters = f2;
        this.mMaxUpdateDelayMillis = j5;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationRequestCompat) {
            LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
            if (this.mQuality != locationRequestCompat.mQuality || this.mIntervalMillis != locationRequestCompat.mIntervalMillis || this.mMinUpdateIntervalMillis != locationRequestCompat.mMinUpdateIntervalMillis || this.mDurationMillis != locationRequestCompat.mDurationMillis || this.mMaxUpdates != locationRequestCompat.mMaxUpdates || Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) != 0 || this.mMaxUpdateDelayMillis != locationRequestCompat.mMaxUpdateDelayMillis) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1, to = 2147483647L)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j2 = this.mMinUpdateIntervalMillis;
        long j3 = j2;
        if (j2 == -1) {
            j3 = this.mIntervalMillis;
        }
        return j3;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        int i2 = this.mQuality;
        long j2 = this.mIntervalMillis;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.mMinUpdateIntervalMillis;
        return (((i2 * 31) + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    @androidx.annotation.NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    @Nullable
    @RequiresApi(19)
    @SuppressLint({"NewApi"})
    public LocationRequest toLocationRequest(@androidx.annotation.NonNull String str) {
        return Build.VERSION.SDK_INT >= 31 ? toLocationRequest() : (LocationRequest) Api19Impl.toLocationRequest(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationRequestCompat.toString():java.lang.String");
    }
}
