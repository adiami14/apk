package kotlin.io;

import androidx.appcompat.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��<\n��\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010��\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/io/FilesKt")
/* loaded from: ItsOnFire.jar:kotlin/io/FilesKt__UtilsKt.class */
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean copyRecursively(@org.jetbrains.annotations.NotNull java.io.File r10, @org.jetbrains.annotations.NotNull java.io.File r11, boolean r12, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__UtilsKt.copyRecursively(java.io.File, java.io.File, boolean, kotlin.jvm.functions.Function2):boolean");
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            function2 = new Function2() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final Void invoke(@NotNull File file3, @NotNull IOException exception) {
                    Intrinsics.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return copyRecursively(file, file2, z, function2);
    }

    @NotNull
    public static final File copyTo(@NotNull File file, @NotNull File target, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (!z) {
                    throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
                }
                if (!target.delete()) {
                    throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (!file.isDirectory()) {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                    ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i2);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } else if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return target;
        }
        throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 8192;
        }
        return copyTo(file, file2, z, i2);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File createTempDir(@NotNull String prefix, @Nullable String str, @Nullable File file) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            Intrinsics.checkNotNullExpressionValue(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "tmp";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File createTempFile(@NotNull String prefix, @Nullable String str, @Nullable File file) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "tmp";
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Iterator<File> it = FilesKt__FileTreeWalkKt.walkBottomUp(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    return z2;
                }
                File next = it.next();
                if ((next.delete() || !next.exists()) && z2) {
                    break;
                }
                z = false;
            }
        }
    }

    public static final boolean endsWith(@NotNull File file, @NotNull File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(other);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        return size < 0 ? false : components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(@NotNull File file, @NotNull String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return endsWith(file, new File(other));
    }

    @NotNull
    public static final String getExtension(@NotNull File file) {
        String substringAfterLast;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(name, '.', "");
        return substringAfterLast;
    }

    @NotNull
    public static final String getInvariantSeparatorsPath(@NotNull File file) {
        String path;
        String replace$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (File.separatorChar != '/') {
            String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "path");
            replace$default = StringsKt__StringsJVMKt.replace$default(path2, File.separatorChar, '/', false, 4, (Object) null);
            path = replace$default;
        } else {
            path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "path");
        }
        return path;
    }

    @NotNull
    public static final String getNameWithoutExtension(@NotNull File file) {
        String substringBeforeLast$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
        return substringBeforeLast$default;
    }

    @NotNull
    public static final File normalize(@NotNull File file) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        File root = components.getRoot();
        List<File> normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null);
        return resolve(root, joinToString$default);
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        Object last;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (Intrinsics.areEqual(name, "..") && !arrayList.isEmpty()) {
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
                    if (!Intrinsics.areEqual(((File) last).getName(), "..")) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    @NotNull
    public static final File relativeTo(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(toRelativeString(file, base));
    }

    @Nullable
    public static final File relativeToOrNull(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : null;
    }

    @NotNull
    public static final File relativeToOrSelf(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            file = new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return file;
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull File relative) {
        File file2;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt__FilePathComponentsKt.isRooted(relative)) {
            return relative;
        }
        String file3 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file3, "this.toString()");
        if (!(file3.length() == 0)) {
            endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) file3, File.separatorChar, false, 2, (Object) null);
            if (!endsWith$default) {
                file2 = new File(file3 + File.separatorChar + relative);
                return file2;
            }
        }
        file2 = new File(file3 + relative);
        return file2;
    }

    @NotNull
    public static final File resolve(@NotNull File file, @NotNull String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    @NotNull
    public static final File resolveSibling(@NotNull File file, @NotNull String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolveSibling(file, new File(relative));
    }

    public static final boolean startsWith(@NotNull File file, @NotNull File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(other);
        boolean z = false;
        if (Intrinsics.areEqual(components.getRoot(), components2.getRoot())) {
            if (components.getSize() >= components2.getSize()) {
                z = components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
            }
            return z;
        }
        return false;
    }

    public static final boolean startsWith(@NotNull File file, @NotNull String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return startsWith(file, new File(other));
    }

    @NotNull
    public static final String toRelativeString(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        List drop;
        FilePathComponents normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file));
        FilePathComponents normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file2));
        if (Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getRoot(), normalize$FilesKt__UtilsKt2.getRoot())) {
            int size = normalize$FilesKt__UtilsKt2.getSize();
            int size2 = normalize$FilesKt__UtilsKt.getSize();
            int i2 = 0;
            int min = Math.min(size2, size);
            while (i2 < min && Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getSegments().get(i2), normalize$FilesKt__UtilsKt2.getSegments().get(i2))) {
                i2++;
            }
            StringBuilder sb = new StringBuilder();
            int i3 = size - 1;
            if (i2 <= i3) {
                while (!Intrinsics.areEqual(normalize$FilesKt__UtilsKt2.getSegments().get(i3).getName(), "..")) {
                    sb.append("..");
                    if (i3 != i2) {
                        sb.append(File.separatorChar);
                    }
                    if (i3 != i2) {
                        i3--;
                    }
                }
                return null;
            }
            if (i2 < size2) {
                if (i2 < size) {
                    sb.append(File.separatorChar);
                }
                drop = CollectionsKt___CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i2);
                String separator = File.separator;
                Intrinsics.checkNotNullExpressionValue(separator, "separator");
                CollectionsKt___CollectionsKt.joinTo$default(drop, sb, separator, null, null, 0, null, null, R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            }
            return sb.toString();
        }
        return null;
    }
}
