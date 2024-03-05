package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/internal/ViewUtils.class */
public class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z2, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        String str4 = attributeValue;
        if (attributeValue != null) {
            str4 = attributeValue;
            if (attributeValue.startsWith("@string/")) {
                str4 = attributeValue;
                if (z) {
                    String substring = attributeValue.substring(8);
                    String packageName = context.getPackageName();
                    TypedValue typedValue = new TypedValue();
                    try {
                        Resources resources = context.getResources();
                        resources.getValue(packageName + ":string/" + substring, typedValue, true);
                    } catch (Resources.NotFoundException e2) {
                        Log.w(str3, "Could not find resource for " + str2 + ": " + attributeValue);
                    }
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null) {
                        str4 = charSequence.toString();
                    } else {
                        String obj = typedValue.toString();
                        Log.w(str3, "Resource " + str2 + " was not a string: " + obj);
                        str4 = attributeValue;
                    }
                }
            }
        }
        if (z2 && str4 == null) {
            Log.w(str3, "Required XML attribute \"" + str2 + "\" missing");
        }
        return str4;
    }
}
