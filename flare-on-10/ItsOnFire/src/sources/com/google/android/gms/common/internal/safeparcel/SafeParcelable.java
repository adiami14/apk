package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable.class */
public interface SafeParcelable extends Parcelable {
    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Class.class */
    public @interface Class {
        @NonNull
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor.class */
    public @interface Constructor {
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Field.class */
    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Indicator.class */
    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Param.class */
    public @interface Param {
        int id();
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$RemovedParam.class */
    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved.class */
    public @interface Reserved {
        @NonNull
        int[] value();
    }

    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelable$VersionField.class */
    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
