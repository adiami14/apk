package q;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H��¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\u00072\u0006\u0010\n\u001a\u00020\tH��¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0082\bJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028��0\u0002\"\u0004\b��\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J3\u0010\u0013\u001a\u00028��\"\u0004\b��\u0010\u00062\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028��0\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J.\u0010\u001c\u001a\u00028��\"\u0004\b��\u0010\u0018*\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028��0\u001aH\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006%"}, d2 = {"Lq/o;", "", "", "Lq/d0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Ljava/util/List;", "S", "Ljava/lang/Class;", NotificationCompat.CATEGORY_SERVICE, "Ljava/lang/ClassLoader;", "loader", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "baseClass", "", "serviceClass", "a", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", ImagesContract.URL, "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:q/o.class */
public final class o {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final o f2082a = new o();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f2083b = "META-INF/services/";

    public final d0 a(Class<d0> cls, String str) {
        d0 d0Var;
        try {
            d0Var = cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException e2) {
            d0Var = null;
        }
        return d0Var;
    }

    public final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        List<S> list;
        List<S> list2;
        try {
            list2 = e(cls, classLoader);
        } catch (Throwable th) {
            list = CollectionsKt___CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
            list2 = list;
        }
        return list2;
    }

    @NotNull
    public final List<d0> d() {
        ArrayList c2;
        d0 d0Var;
        if (p.a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                d0 d0Var2 = null;
                try {
                    d0Var = (d0) d0.class.cast(Class.forName("k.a", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException e2) {
                    d0Var = null;
                }
                if (d0Var != null) {
                    arrayList.add(d0Var);
                }
                try {
                    d0Var2 = (d0) d0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException e3) {
                }
                c2 = arrayList;
                if (d0Var2 != null) {
                    arrayList.add(d0Var2);
                    c2 = arrayList;
                }
            } catch (Throwable th) {
                c2 = c(d0.class, d0.class.getClassLoader());
            }
            return c2;
        }
        return c(d0.class, d0.class.getClassLoader());
    }

    @NotNull
    public final <S> List<S> e(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        Set<String> set;
        int collectionSizeOrDefault;
        ArrayList<URL> list = Collections.list(classLoader.getResources(f2083b + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, f2082a.f(url));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (!set.isEmpty()) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (String str : set) {
                arrayList2.add(f2082a.b(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List<String> f(URL url) {
        boolean startsWith$default;
        String substringAfter$default;
        String substringBefore$default;
        String substringAfter$default2;
        String url2 = url.toString();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(url2, "jar", false, 2, null);
        if (startsWith$default) {
            substringAfter$default = StringsKt__StringsKt.substringAfter$default(url2, "jar:file:", (String) null, 2, (Object) null);
            substringBefore$default = StringsKt__StringsKt.substringBefore$default(substringAfter$default, '!', (String) null, 2, (Object) null);
            substringAfter$default2 = StringsKt__StringsKt.substringAfter$default(url2, "!/", (String) null, 2, (Object) null);
            JarFile jarFile = new JarFile(substringBefore$default, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(substringAfter$default2)), "UTF-8"));
                List<String> g2 = f2082a.g(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                jarFile.close();
                return g2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> g3 = f2082a.g(bufferedReader2);
            CloseableKt.closeFinally(bufferedReader2, null);
            return g3;
        } finally {
        }
    }

    public final List<String> g(BufferedReader bufferedReader) {
        List<String> list;
        String substringBefore$default;
        CharSequence trim;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                list = CollectionsKt___CollectionsKt.toList(linkedHashSet);
                return list;
            }
            substringBefore$default = StringsKt__StringsKt.substringBefore$default(readLine, "#", (String) null, 2, (Object) null);
            trim = StringsKt__StringsKt.trim((CharSequence) substringBefore$default);
            String obj = trim.toString();
            int i2 = 0;
            while (true) {
                if (i2 >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i2);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (!z) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            boolean z2 = false;
            if (obj.length() > 0) {
                z2 = true;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final <R> R h(JarFile jarFile, Function1<? super JarFile, ? extends R> function1) {
        try {
            R invoke = function1.invoke(jarFile);
            InlineMarker.finallyStart(1);
            jarFile.close();
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                try {
                    jarFile.close();
                    InlineMarker.finallyEnd(1);
                    throw th2;
                } catch (Throwable th3) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }
}
