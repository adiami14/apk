package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal.class */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private SimpleArrayMap<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$AsldcInflateDelegate.class */
    public static class AsldcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$AvdcInflateDelegate.class */
    public static class AvdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$ColorFilterLruCache.class */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i2) {
            super(i2);
        }

        private static int generateCacheKey(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter get(int i2, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i2, mode)));
        }

        public PorterDuffColorFilter put(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i2, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$DrawableDelegate.class */
    public static class DrawableDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$InflateDelegate.class */
    public interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$ResourceManagerHooks.class */
    public interface ResourceManagerHooks {
        @Nullable
        Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DrawableRes int i2);

        @Nullable
        ColorStateList getTintListForDrawableRes(@NonNull Context context, @DrawableRes int i2);

        @Nullable
        PorterDuff.Mode getTintModeForDrawableRes(int i2);

        boolean tintDrawable(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable);

        boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable);
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/ResourceManagerInternal$VdcInflateDelegate.class */
    public static class VdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void addDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new SimpleArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private boolean addDrawableToCache(@NonNull Context context, long j2, @NonNull Drawable drawable) {
        boolean z;
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray2 = longSparseArray;
                if (longSparseArray == null) {
                    longSparseArray2 = new LongSparseArray<>();
                    this.mDrawableCaches.put(context, longSparseArray2);
                }
                longSparseArray2.put(j2, new WeakReference<>(constantState));
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void addTintListToCache(@NonNull Context context, @DrawableRes int i2, @NonNull ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.mTintLists.get(context);
        SparseArrayCompat<ColorStateList> sparseArrayCompat2 = sparseArrayCompat;
        if (sparseArrayCompat == null) {
            sparseArrayCompat2 = new SparseArrayCompat<>();
            this.mTintLists.put(context, sparseArrayCompat2);
        }
        sparseArrayCompat2.append(i2, colorStateList);
    }

    private void checkVectorDrawableSetup(@NonNull Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(@NonNull Context context, @DrawableRes int i2) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i2, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable createDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i2);
        if (createDrawableFor != null) {
            createDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, createDrawableFor);
        }
        return createDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            try {
                if (INSTANCE == null) {
                    ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                    INSTANCE = resourceManagerInternal2;
                    installDefaultInflateDelegates(resourceManagerInternal2);
                }
                resourceManagerInternal = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return resourceManagerInternal;
    }

    private Drawable getCachedDrawable(@NonNull Context context, long j2) {
        synchronized (this) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j2);
            if (weakReference != null) {
                Drawable.ConstantState constantState = weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                longSparseArray.remove(j2);
            }
            return null;
        }
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            try {
                ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
                PorterDuffColorFilter porterDuffColorFilter2 = colorFilterLruCache.get(i2, mode);
                porterDuffColorFilter = porterDuffColorFilter2;
                if (porterDuffColorFilter2 == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                    colorFilterLruCache.put(i2, mode, porterDuffColorFilter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(@NonNull Context context, @DrawableRes int i2) {
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.mTintLists;
        ColorStateList colorStateList = null;
        if (weakHashMap != null) {
            SparseArrayCompat<ColorStateList> sparseArrayCompat = weakHashMap.get(context);
            colorStateList = null;
            if (sparseArrayCompat != null) {
                colorStateList = sparseArrayCompat.get(i2);
            }
        }
        return colorStateList;
    }

    private static void installDefaultInflateDelegates(@NonNull ResourceManagerInternal resourceManagerInternal) {
    }

    private static boolean isVectorDrawable(@NonNull Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(@NonNull Context context, @DrawableRes int i2) {
        int next;
        SimpleArrayMap<String, InflateDelegate> simpleArrayMap = this.mDelegates;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.mKnownDrawableIdTags;
        if (sparseArrayCompat != null) {
            String str = sparseArrayCompat.get(i2);
            if (SKIP_DRAWABLE_TAG.equals(str)) {
                return null;
            }
            if (str != null && this.mDelegates.get(str) == null) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new SparseArrayCompat<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        Drawable drawable = cachedDrawable;
        if (charSequence != null) {
            drawable = cachedDrawable;
            if (charSequence.toString().endsWith(".xml")) {
                drawable = cachedDrawable;
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.append(i2, name);
                    InflateDelegate inflateDelegate = this.mDelegates.get(name);
                    Drawable drawable2 = cachedDrawable;
                    if (inflateDelegate != null) {
                        drawable2 = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                    }
                    drawable = drawable2;
                    if (drawable2 != null) {
                        drawable2.setChangingConfigurations(typedValue.changingConfigurations);
                        Drawable drawable3 = drawable2;
                        addDrawableToCache(context, createCacheKey, drawable2);
                        drawable = drawable2;
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Exception while inflating drawable", e2);
                }
            }
        }
        if (drawable == null) {
            this.mKnownDrawableIdTags.append(i2, SKIP_DRAWABLE_TAG);
        }
        return drawable;
    }

    private Drawable tintDrawable(@NonNull Context context, @DrawableRes int i2, boolean z, @NonNull Drawable drawable) {
        Drawable drawable2;
        ColorStateList tintList = getTintList(context, i2);
        if (tintList != null) {
            Drawable drawable3 = drawable;
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable3 = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable3);
            DrawableCompat.setTintList(wrap, tintList);
            PorterDuff.Mode tintMode = getTintMode(i2);
            drawable2 = wrap;
            if (tintMode != null) {
                DrawableCompat.setTintMode(wrap, tintMode);
                drawable2 = wrap;
            }
        } else {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            if (resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i2, drawable)) {
                drawable2 = drawable;
                if (!tintDrawableUsingColorFilter(context, i2, drawable)) {
                    drawable2 = drawable;
                    if (z) {
                        drawable2 = null;
                    }
                }
            } else {
                drawable2 = drawable;
            }
        }
        return drawable2;
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable) {
            Log.d(TAG, "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = tintInfo.mHasTintList;
        if (z || tintInfo.mHasTintMode) {
            drawable.setColorFilter(createTintFilter(z ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2) {
        Drawable drawable;
        synchronized (this) {
            drawable = getDrawable(context, i2, false);
        }
        return drawable;
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2, boolean z) {
        Drawable drawable;
        synchronized (this) {
            checkVectorDrawableSetup(context);
            Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i2);
            Drawable drawable2 = loadDrawableFromDelegates;
            if (loadDrawableFromDelegates == null) {
                drawable2 = createDrawableIfNeeded(context, i2);
            }
            Drawable drawable3 = drawable2;
            if (drawable2 == null) {
                drawable3 = ContextCompat.getDrawable(context, i2);
            }
            drawable = drawable3;
            if (drawable3 != null) {
                drawable = tintDrawable(context, i2, z, drawable3);
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
        }
        return drawable;
    }

    public ColorStateList getTintList(@NonNull Context context, @DrawableRes int i2) {
        ColorStateList colorStateList;
        synchronized (this) {
            ColorStateList tintListFromCache = getTintListFromCache(context, i2);
            colorStateList = tintListFromCache;
            if (tintListFromCache == null) {
                ResourceManagerHooks resourceManagerHooks = this.mHooks;
                ColorStateList tintListForDrawableRes = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i2);
                colorStateList = tintListForDrawableRes;
                if (tintListForDrawableRes != null) {
                    addTintListToCache(context, i2, tintListForDrawableRes);
                    colorStateList = tintListForDrawableRes;
                }
            }
        }
        return colorStateList;
    }

    public PorterDuff.Mode getTintMode(int i2) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks == null ? null : resourceManagerHooks.getTintModeForDrawableRes(i2);
    }

    public void onConfigurationChanged(@NonNull Context context) {
        synchronized (this) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    public Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i2) {
        synchronized (this) {
            Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i2);
            Drawable drawable = loadDrawableFromDelegates;
            if (loadDrawableFromDelegates == null) {
                drawable = vectorEnabledTintResources.getDrawableCanonical(i2);
            }
            if (drawable != null) {
                return tintDrawable(context, i2, false, drawable);
            }
            return null;
        }
    }

    public void setHooks(ResourceManagerHooks resourceManagerHooks) {
        synchronized (this) {
            this.mHooks = resourceManagerHooks;
        }
    }

    public boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i2, drawable);
    }
}
