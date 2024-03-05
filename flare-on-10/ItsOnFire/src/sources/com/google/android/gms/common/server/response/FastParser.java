package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
@ShowFirstParty
@KeepForSdk
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/server/response/FastParser.class */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai<Integer> zag = new zaa();
    private static final zai<Long> zah = new zab();
    private static final zai<Float> zai = new zac();
    private static final zai<Double> zaj = new zad();
    private static final zai<Boolean> zak = new zae();
    private static final zai<String> zal = new zaf();
    private static final zai<BigInteger> zam = new zag();
    private static final zai<BigDecimal> zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack<Integer> zat = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: ItsOnFire.jar:com/google/android/gms/common/server/response/FastParser$ParseException.class */
    public static class ParseException extends Exception {
        public ParseException(@NonNull String str) {
            super(str);
        }

        public ParseException(@NonNull String str, @NonNull Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@NonNull Throwable th) {
            super(th);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            for (int i2 = 0; i2 < read; i2++) {
                char c2 = cArr[i2];
                if (Character.isISOControl(c2)) {
                    if (cArr2 == null) {
                        break loop0;
                    }
                    for (int i3 = 0; i3 <= 0; i3++) {
                        if (cArr2[i3] != c2) {
                        }
                    }
                    break loop0;
                }
                if (c2 == '\"') {
                    if (!z2) {
                        sb.append(cArr, 0, i2);
                        bufferedReader.reset();
                        bufferedReader.skip(i2 + 1);
                        String sb2 = sb.toString();
                        String str = sb2;
                        if (z) {
                            str = JsonUtils.unescapeString(sb2);
                        }
                        return str;
                    }
                } else if (c2 == '\\') {
                    z2 = !z2;
                    z = true;
                }
                z2 = false;
            }
            sb.append(cArr, 0, read);
            bufferedReader.mark(cArr.length);
        }
        throw new ParseException("Unexpected control character while reading string");
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                    return (char) 0;
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i2;
        int i3;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c2 = cArr[0];
            int i4 = c2 == '-' ? Integer.MIN_VALUE : -2147483647;
            int i5 = c2 == '-' ? 1 : 0;
            if (i5 < zam2) {
                i3 = i5 + 1;
                int digit = Character.digit(cArr[i5], 10);
                if (digit < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                i2 = -digit;
            } else {
                i2 = 0;
                i3 = i5;
            }
            while (i3 < zam2) {
                int digit2 = Character.digit(cArr[i3], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if (i2 < -214748364) {
                    throw new ParseException("Number too large");
                }
                int i6 = i2 * 10;
                if (i6 < i4 + digit2) {
                    throw new ParseException("Number too large");
                }
                i2 = i6 - digit2;
                i3++;
            }
            if (i5 == 0) {
                i2 = -i2;
            } else if (i3 <= 1) {
                throw new ParseException("No digits to parse");
            }
            return i2;
        }
        throw new ParseException("No number to parse");
    }

    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2;
        boolean z;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (zai2 != '\"') {
                    cArr[0] = zai2;
                    int i3 = 1;
                    while (true) {
                        i2 = i3;
                        if (i3 >= 1024) {
                            break;
                        }
                        i2 = i3;
                        if (bufferedReader.read(cArr, i3, 1) == -1) {
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i3] == ']') {
                            break;
                        }
                        i3++;
                    }
                    bufferedReader.reset();
                    bufferedReader.skip(i3 - 1);
                    cArr[i3] = (char) 0;
                    return i3;
                }
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    boolean z3 = z2;
                    i2 = i4;
                    if (i4 >= 1024) {
                        break;
                    }
                    i2 = i4;
                    if (bufferedReader.read(cArr, i4, 1) == -1) {
                        break;
                    }
                    char c3 = cArr[i4];
                    if (Character.isISOControl(c3)) {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                    if (c3 == '\"') {
                        if (!z3) {
                            bufferedReader.reset();
                            bufferedReader.skip(i4 + 1);
                            return i4;
                        }
                    } else if (c3 == '\\') {
                        z = !z3;
                        i4++;
                        z2 = z;
                    }
                    z = false;
                    i4++;
                    z2 = z;
                }
                if (i2 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j2;
        int i2;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            int i3 = 0;
            char c2 = cArr[0];
            long j3 = c2 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
            if (c2 == '-') {
                i3 = 1;
            }
            if (i3 < zam2) {
                i2 = i3 + 1;
                int digit = Character.digit(cArr[i3], 10);
                if (digit < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                j2 = -digit;
            } else {
                j2 = 0;
                i2 = i3;
            }
            while (i2 < zam2) {
                int digit2 = Character.digit(cArr[i2], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if (j2 < -922337203685477580L) {
                    throw new ParseException("Number too large");
                }
                long j4 = j2 * 10;
                long j5 = digit2;
                if (j4 < j3 + j5) {
                    throw new ParseException("Number too large");
                }
                j2 = j4 - j5;
                i2++;
            }
            if (i3 == 0) {
                j2 = -j2;
            } else if (i2 <= 1) {
                throw new ParseException("No digits to parse");
            }
            return j2;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    @Nullable
    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb, cArr2);
    }

    @Nullable
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        } else if (zai2 == '}') {
            zaw(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zai2);
            throw new ParseException(sb.toString());
        }
    }

    @Nullable
    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i2 = 1;
        if (zai2 != '\"') {
            if (zai2 == ',') {
                throw new ParseException("Missing value");
            }
            if (zai2 == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) != ']') {
                    bufferedReader.reset();
                    boolean z = false;
                    boolean z2 = false;
                    while (i2 > 0) {
                        char zai3 = zai(bufferedReader);
                        if (zai3 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(zai3)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        boolean z3 = z;
                        char c2 = zai3;
                        if (zai3 == '\"') {
                            z3 = z;
                            if (!z2) {
                                z3 = !z;
                            }
                            c2 = '\"';
                        }
                        int i3 = i2;
                        char c3 = c2;
                        if (c2 == '[') {
                            i3 = i2;
                            if (!z3) {
                                i3 = i2 + 1;
                            }
                            c3 = '[';
                        }
                        i2 = i3;
                        if (c3 == ']') {
                            i2 = i3;
                            if (!z3) {
                                i2 = i3 - 1;
                            }
                        }
                        if (c3 == '\\' && z3) {
                            z2 = !z2;
                            z = z3;
                        } else {
                            z2 = false;
                            z = z3;
                        }
                    }
                }
                zaw(5);
            } else if (zai2 != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char zai4 = zai(bufferedReader);
                if (zai4 == '}') {
                    zaw(1);
                } else if (zai4 != '\"') {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(zai4);
                    throw new ParseException(sb.toString());
                } else {
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    do {
                    } while (zar(bufferedReader) != null);
                    zaw(1);
                }
            }
        } else if (bufferedReader.read(this.zao) == -1) {
            throw new ParseException("Unexpected EOF while parsing string");
        } else {
            char c4 = this.zao[0];
            boolean z4 = false;
            while (true) {
                char c5 = c4;
                boolean z5 = z4;
                if (c4 == '\"') {
                    if (!z4) {
                        break;
                    }
                    c5 = '\"';
                    z5 = true;
                }
                z4 = c5 == '\\' ? !z5 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                char c6 = this.zao[0];
                if (Character.isISOControl(c6)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                c4 = c6;
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        } else if (zai5 == '}') {
            zaw(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(zai5);
            throw new ParseException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    @Nullable
    private final <O> ArrayList<O> zau(BufferedReader bufferedReader, zai<O> zaiVar) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        } else if (zai2 != '[') {
            throw new ParseException("Expected start of array");
        } else {
            this.zat.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zai3 = zai(bufferedReader);
                if (zai3 == 0) {
                    throw new ParseException("Unexpected EOF");
                }
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    bufferedReader.reset();
                    arrayList.add(zaiVar.zaa(this, bufferedReader));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private final <T extends FastJsonResponse> ArrayList<T> zav(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        } else if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        } else if (zai2 != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zai2);
            throw new ParseException(sb.toString());
        } else {
            Stack<Integer> stack = this.zat;
            while (true) {
                stack.push(1);
                try {
                    FastJsonResponse zad2 = field.zad();
                    if (!zaz(bufferedReader, zad2)) {
                        return arrayList;
                    }
                    arrayList.add(zad2);
                    char zai3 = zai(bufferedReader);
                    if (zai3 != ',') {
                        if (zai3 == ']') {
                            zaw(5);
                            return arrayList;
                        }
                        StringBuilder sb2 = new StringBuilder(19);
                        sb2.append("Unexpected token: ");
                        sb2.append(zai3);
                        throw new ParseException(sb2.toString());
                    } else if (zai(bufferedReader) != '{') {
                        throw new ParseException("Expected start of next object in array");
                    } else {
                        stack = this.zat;
                    }
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                } catch (InstantiationException e3) {
                    throw new ParseException("Error instantiating inner object", e3);
                }
            }
        }
    }

    private final void zaw(int i2) throws ParseException {
        if (this.zat.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i2);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int intValue = this.zat.pop().intValue();
        if (intValue == i2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i2);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new ParseException(sb2.toString());
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int length = cArr.length;
            if (i3 >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i3);
            if (read == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i4 = 0; i4 < read; i4++) {
                if (cArr[i4 + i3] != this.zap[i4]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i2 = i3 + read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        } else if (zai2 == 'f') {
            zax(bufferedReader, z ? zae : zad);
            return false;
        } else if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        } else if (zai2 == 't') {
            zax(bufferedReader, z ? zac : zab);
            return true;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zai2);
            throw new ParseException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01de, code lost:
        zaw(1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r9, com.google.android.gms.common.server.response.FastJsonResponse r10) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t2) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new ParseException("No data to parse");
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t2.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t2.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else if (zai2 != '{') {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zai2);
                    throw new ParseException(sb.toString());
                } else {
                    this.zat.push(1);
                    zaz(bufferedReader, t2);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
                throw th;
            }
        } catch (IOException e4) {
            throw new ParseException(e4);
        }
    }
}
