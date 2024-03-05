package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/graphics/TypefaceCompatApi26Impl.class */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    private static final String ABORT_CREATION_METHOD = "abortCreation";
    private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final String TAG = "TypefaceCompatApi26Impl";
    public final Method mAbortCreation;
    public final Method mAddFontFromAssetManager;
    public final Method mAddFontFromBuffer;
    public final Method mCreateFromFamiliesWithDefault;
    public final Class<?> mFontFamily;
    public final Constructor<?> mFontFamilyCtor;
    public final Method mFreeze;

    public TypefaceCompatApi26Impl() {
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls;
        try {
            cls = obtainFontFamily();
            constructor = obtainFontFamilyCtor(cls);
            method = obtainAddFontFromAssetManagerMethod(cls);
            method4 = obtainAddFontFromBufferMethod(cls);
            method3 = obtainFreezeMethod(cls);
            method2 = obtainAbortCreationMethod(cls);
            method5 = obtainCreateFromFamiliesWithDefaultMethod(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(TAG, "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            cls = null;
        }
        this.mFontFamily = cls;
        this.mFontFamilyCtor = constructor;
        this.mAddFontFromAssetManager = method;
        this.mAddFontFromBuffer = method4;
        this.mFreeze = method3;
        this.mAbortCreation = method2;
        this.mCreateFromFamiliesWithDefault = method5;
    }

    private void abortCreation(Object obj) {
        try {
            this.mAbortCreation.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
        }
    }

    private boolean addFontFromAssetManager(Context context, Object obj, String str, int i2, int i3, int i4, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.mAddFontFromAssetManager.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    private boolean addFontFromBuffer(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.mAddFontFromBuffer.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    private boolean freeze(Object obj) {
        try {
            return ((Boolean) this.mFreeze.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if (this.mAddFontFromAssetManager == null) {
            Log.w(TAG, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.mAddFontFromAssetManager != null;
    }

    @Nullable
    private Object newFamily() {
        try {
            return this.mFontFamilyCtor.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    @Nullable
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.mFontFamily, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        FontResourcesParserCompat.FontFileResourceEntry[] entries;
        if (isFontFamilyPrivateAPIAvailable()) {
            Object newFamily = newFamily();
            if (newFamily == null) {
                return null;
            }
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                if (!addFontFromAssetManager(context, newFamily, fontFileResourceEntry.getFileName(), fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.getVariationSettings()))) {
                    abortCreation(newFamily);
                    return null;
                }
            }
            if (freeze(newFamily)) {
                return createFromFamiliesWithDefault(newFamily);
            }
            return null;
        }
        return super.createFromFontFamilyFilesResourceEntry(context, fontFamilyFilesResourceEntry, resources, i2);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Typeface createFromFamiliesWithDefault;
        if (fontInfoArr.length < 1) {
            return null;
        }
        if (!isFontFamilyPrivateAPIAvailable()) {
            FontsContractCompat.FontInfo findBestInfo = findBestInfo(fontInfoArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(findBestInfo.getUri(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(findBestInfo.getWeight()).setItalic(findBestInfo.isItalic()).build();
                    openFileDescriptor.close();
                    return build;
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                } else {
                    return null;
                }
            } catch (IOException e2) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> readFontInfoIntoByteBuffer = TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
        Object newFamily = newFamily();
        if (newFamily == null) {
            return null;
        }
        int length = fontInfoArr.length;
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            FontsContractCompat.FontInfo fontInfo = fontInfoArr[i3];
            ByteBuffer byteBuffer = readFontInfoIntoByteBuffer.get(fontInfo.getUri());
            if (byteBuffer != null) {
                if (!addFontFromBuffer(newFamily, byteBuffer, fontInfo.getTtcIndex(), fontInfo.getWeight(), fontInfo.isItalic() ? 1 : 0)) {
                    abortCreation(newFamily);
                    return null;
                }
                z = true;
            }
            i3++;
            z = z;
        }
        if (!z) {
            abortCreation(newFamily);
            return null;
        } else if (freeze(newFamily) && (createFromFamiliesWithDefault = createFromFamiliesWithDefault(newFamily)) != null) {
            return Typeface.create(createFromFamiliesWithDefault, i2);
        } else {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3) {
        if (isFontFamilyPrivateAPIAvailable()) {
            Object newFamily = newFamily();
            if (newFamily == null) {
                return null;
            }
            if (!addFontFromAssetManager(context, newFamily, str, 0, -1, -1, null)) {
                abortCreation(newFamily);
                return null;
            } else if (freeze(newFamily)) {
                return createFromFamiliesWithDefault(newFamily);
            } else {
                return null;
            }
        }
        return super.createFromResourcesFontFile(context, resources, i2, str, i3);
    }

    public Method obtainAbortCreationMethod(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(ABORT_CREATION_METHOD, new Class[0]);
    }

    public Method obtainAddFontFromAssetManagerMethod(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(ADD_FONT_FROM_ASSET_MANAGER_METHOD, AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method obtainAddFontFromBufferMethod(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(ADD_FONT_FROM_BUFFER_METHOD, ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> obtainFontFamily() throws ClassNotFoundException {
        return Class.forName(FONT_FAMILY_CLASS);
    }

    public Constructor<?> obtainFontFamilyCtor(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    public Method obtainFreezeMethod(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(FREEZE_METHOD, new Class[0]);
    }
}
