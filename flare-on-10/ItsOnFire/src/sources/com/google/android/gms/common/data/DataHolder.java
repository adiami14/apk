package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/data/DataHolder.class */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    @SafeParcelable.VersionField(id = 1000)
    public final int zaa;
    public Bundle zab;
    public int[] zac;
    public int zad;
    public boolean zae;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;
    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/data/DataHolder$Builder.class */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList<HashMap<String, Object>> zab = new ArrayList<>();
        private final HashMap<Object, Integer> zac = new HashMap<>();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i2) {
            return new DataHolder(this, i2);
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i2, @NonNull Bundle bundle) {
            return new DataHolder(this, i2, bundle);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap<String, Object> hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i3, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i2;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i3;
        this.zaj = bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataHolder(@androidx.annotation.NonNull android.database.Cursor r7, int r8, @androidx.annotation.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i2, @Nullable Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i2, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i2, @Nullable Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i2;
        this.zaj = bundle;
        zad();
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, null);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i2) {
        return new DataHolder(zaf, i2, (Bundle) null);
    }

    private final void zae(String str, int i2) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else {
            if (i2 < 0 || i2 >= this.zad) {
                throw new CursorIndexOutOfBoundsException(i2, this.zad);
            }
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i2) {
        boolean z;
        long j2;
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i3 = 0;
        boolean z2 = false;
        while (i3 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i3);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    CursorWindow cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow2);
                    cursorWindow = cursorWindow2;
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i3);
                int i4 = 0;
                boolean z3 = true;
                while (true) {
                    if (i4 < builder.zaa.length) {
                        if (!z3) {
                            break;
                        }
                        String str = builder.zaa[i4];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z3 = cursorWindow.putNull(i3, i4);
                        } else if (obj instanceof String) {
                            z3 = cursorWindow.putString((String) obj, i3, i4);
                        } else {
                            if (obj instanceof Long) {
                                j2 = ((Long) obj).longValue();
                            } else if (obj instanceof Integer) {
                                z3 = cursorWindow.putLong(((Integer) obj).intValue(), i3, i4);
                            } else if (obj instanceof Boolean) {
                                j2 = true != ((Boolean) obj).booleanValue() ? 0L : 1L;
                            } else if (obj instanceof byte[]) {
                                z3 = cursorWindow.putBlob((byte[]) obj, i3, i4);
                            } else if (obj instanceof Double) {
                                z3 = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i4);
                            } else if (!(obj instanceof Float)) {
                                String obj2 = obj.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(obj2);
                                throw new IllegalArgumentException(sb2.toString());
                            } else {
                                z3 = cursorWindow.putDouble(((Float) obj).floatValue(), i3, i4);
                            }
                            z3 = cursorWindow.putLong(j2, i3, i4);
                        }
                        i4++;
                    } else if (z3) {
                        z = false;
                    }
                }
                if (z2) {
                    throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                StringBuilder sb3 = new StringBuilder(74);
                sb3.append("Couldn't populate window data for row ");
                sb3.append(i3);
                sb3.append(" - allocating new window.");
                Log.d("DataHolder", sb3.toString());
                cursorWindow.freeLastRow();
                cursorWindow = new CursorWindow(false);
                cursorWindow.setStartPosition(i3);
                cursorWindow.setNumColumns(builder.zaa.length);
                arrayList2.add(cursorWindow);
                i3--;
                z = true;
                z2 = z;
                i3++;
            } catch (RuntimeException e2) {
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList2.get(i5)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return Long.valueOf(this.zah[i3].getLong(i2, this.zab.getInt(str))).longValue() == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getBlob(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getInt(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getLong(i2, this.zab.getInt(str));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getString(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i2) {
        int length;
        int i3;
        int i4 = 0;
        Preconditions.checkState(i2 >= 0 && i2 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            i3 = i4;
            if (i4 >= length) {
                break;
            } else if (i2 < iArr[i4]) {
                i3 = i4 - 1;
                break;
            } else {
                i4++;
            }
        }
        int i5 = i3;
        if (i3 == length) {
            i5 = i3 - 1;
        }
        return i5;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].isNull(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i2, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getDouble(i2, this.zab.getInt(str));
    }

    public final float zab(@NonNull String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getFloat(i2, this.zab.getInt(str));
    }

    public final void zac(@NonNull String str, int i2, int i3, @NonNull CharArrayBuffer charArrayBuffer) {
        zae(str, i2);
        this.zah[i3].copyStringToBuffer(i2, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i3 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i3], i3);
            i3++;
        }
        this.zac = new int[this.zah.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i2 >= cursorWindowArr.length) {
                this.zad = i4;
                return;
            }
            this.zac[i2] = i4;
            i4 += this.zah[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
            i2++;
        }
    }
}
