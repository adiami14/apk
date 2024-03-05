package kotlin.io;

import androidx.appcompat.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��$\n��\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH��\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H��\"\u0015\u0010��\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b��\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/io/FilesKt")
/* loaded from: ItsOnFire.jar:kotlin/io/FilesKt__FilePathComponentsKt.class */
public class FilesKt__FilePathComponentsKt {
    @NotNull
    public static final File getRoot(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r7, r0, 2, false, 4, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String r7) {
        /*
            r0 = r7
            char r1 = java.io.File.separatorChar
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L52
            r0 = r7
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L50
            r0 = r7
            r1 = 1
            char r0 = r0.charAt(r1)
            r8 = r0
            char r0 = java.io.File.separatorChar
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L50
            r0 = r7
            r1 = r9
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r8
            if (r0 < 0) goto L50
            r0 = r7
            char r1 = java.io.File.separatorChar
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            r3 = 0
            r4 = 4
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r8
            if (r0 < 0) goto L4b
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            return r0
        L4b:
            r0 = r7
            int r0 = r0.length()
            return r0
        L50:
            r0 = 1
            return r0
        L52:
            r0 = r8
            if (r0 <= 0) goto L66
            r0 = r7
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            char r0 = r0.charAt(r1)
            r1 = 58
            if (r0 != r1) goto L66
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            return r0
        L66:
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L7c
            r0 = r7
            r1 = 58
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L7c
            r0 = r7
            int r0 = r0.length()
            return r0
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(java.lang.String):int");
    }

    @NotNull
    public static final String getRootName(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean isRooted(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    @NotNull
    public static final File subPath(@NotNull File file, int i2, int i3) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    @NotNull
    public static final FilePathComponents toComponents(@NotNull File file) {
        List<String> split$default;
        int collectionSizeOrDefault;
        ArrayList arrayList;
        ?? emptyList;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            arrayList = emptyList;
        } else {
            split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str : split$default) {
                arrayList.add(new File(str));
            }
        }
        return new FilePathComponents(new File(substring), arrayList);
    }
}
