package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zznq.class */
final class zznq implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        Unsafe unsafe;
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (true) {
            unsafe = null;
            if (i2 >= length) {
                break;
            }
            Field field = declaredFields[i2];
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                unsafe = (Unsafe) Unsafe.class.cast(obj);
                break;
            }
            i2++;
        }
        return unsafe;
    }
}
