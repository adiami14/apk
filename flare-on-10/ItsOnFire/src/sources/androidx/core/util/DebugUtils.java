package androidx.core.util;

import androidx.annotation.RestrictTo;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/util/DebugUtils.class */
public class DebugUtils {
    private DebugUtils() {
    }

    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            String str = simpleName;
            if (simpleName.length() <= 0) {
                String name = obj.getClass().getName();
                int lastIndexOf = name.lastIndexOf(46);
                str = name;
                if (lastIndexOf > 0) {
                    str = name.substring(lastIndexOf + 1);
                }
            }
            sb.append(str);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}
