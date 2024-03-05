package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/android/gms/internal/measurement/zzjk.class */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmi {
    public int zzb = 0;

    public static void zzbw(Iterable iterable, List list) {
        byte[] bArr = zzlj.zzd;
        iterable.getClass();
        if (iterable instanceof zzlq) {
            List zzh = ((zzlq) iterable).zzh();
            zzlq zzlqVar = (zzlq) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = zzlqVar.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = zzlqVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        zzlqVar.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof zzka) {
                    zzlqVar.zzi((zzka) obj);
                } else {
                    zzlqVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzmp) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    public int zzbu(zzmt zzmtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzka zzbv() {
        try {
            int zzbz = zzbz();
            zzka zzkaVar = zzka.zzb;
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return new zzjx(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final byte[] zzbx() {
        try {
            int zzbz = zzbz();
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
