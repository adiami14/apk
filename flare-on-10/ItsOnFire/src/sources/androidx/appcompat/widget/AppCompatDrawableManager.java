package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AppCompatDrawableManager.class */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (INSTANCE == null) {
                    preload();
                }
                appCompatDrawableManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appCompatDrawableManager;
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            try {
                porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i2, mode);
            } catch (Throwable th) {
                throw th;
            }
        }
        return porterDuffColorFilter;
    }

    public static void preload() {
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (INSTANCE == null) {
                    AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                    INSTANCE = appCompatDrawableManager;
                    appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                    INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                        private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                        private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                        private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                        private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                        private final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                        private final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                        private boolean arrayContains(int[] iArr, int i2) {
                            for (int i3 : iArr) {
                                if (i3 == i2) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
                            return createButtonColorStateList(context, 0);
                        }

                        /* JADX WARN: Type inference failed for: r2v1, types: [int[], int[][]] */
                        private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i2) {
                            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
                            int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
                            int[] iArr = ThemeUtils.DISABLED_STATE_SET;
                            int[] iArr2 = ThemeUtils.PRESSED_STATE_SET;
                            int compositeColors = ColorUtils.compositeColors(themeAttrColor, i2);
                            return new ColorStateList(new int[]{iArr, iArr2, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{disabledThemeAttrColor, compositeColors, ColorUtils.compositeColors(themeAttrColor, i2), i2});
                        }

                        private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
                            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                        }

                        private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
                            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [int[], int[][]] */
                        private ColorStateList createSwitchThumbColorStateList(Context context) {
                            ?? r0 = new int[3];
                            int[] iArr = new int[3];
                            int i2 = R.attr.colorSwitchThumbNormal;
                            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i2);
                            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                                r0[0] = ThemeUtils.DISABLED_STATE_SET;
                                iArr[0] = ThemeUtils.getDisabledThemeAttrColor(context, i2);
                                r0[1] = ThemeUtils.CHECKED_STATE_SET;
                                iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                                r0[2] = ThemeUtils.EMPTY_STATE_SET;
                                iArr[2] = ThemeUtils.getThemeAttrColor(context, i2);
                            } else {
                                int[] iArr2 = ThemeUtils.DISABLED_STATE_SET;
                                r0[0] = iArr2;
                                iArr[0] = themeAttrColorStateList.getColorForState(iArr2, 0);
                                r0[1] = ThemeUtils.CHECKED_STATE_SET;
                                iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                                r0[2] = ThemeUtils.EMPTY_STATE_SET;
                                iArr[2] = themeAttrColorStateList.getDefaultColor();
                            }
                            return new ColorStateList(r0, iArr);
                        }

                        private LayerDrawable getRatingBarLayerDrawable(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DimenRes int i2) {
                            BitmapDrawable bitmapDrawable;
                            BitmapDrawable bitmapDrawable2;
                            BitmapDrawable bitmapDrawable3;
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                            Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
                            Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                                bitmapDrawable = (BitmapDrawable) drawable;
                                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                drawable.draw(canvas);
                                bitmapDrawable = new BitmapDrawable(createBitmap);
                                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                            }
                            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                                bitmapDrawable3 = (BitmapDrawable) drawable2;
                            } else {
                                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                drawable2.draw(canvas2);
                                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                            }
                            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                            layerDrawable.setId(0, 16908288);
                            layerDrawable.setId(1, 16908303);
                            layerDrawable.setId(2, 16908301);
                            return layerDrawable;
                        }

                        private void setPorterDuffColorFilter(Drawable drawable, int i2, PorterDuff.Mode mode) {
                            Drawable drawable2 = drawable;
                            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                                drawable2 = drawable.mutate();
                            }
                            PorterDuff.Mode mode2 = mode;
                            if (mode == null) {
                                mode2 = AppCompatDrawableManager.DEFAULT_MODE;
                            }
                            drawable2.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i2, mode2));
                        }

                        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                        public Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, int i2) {
                            if (i2 == R.drawable.abc_cab_background_top_material) {
                                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                            }
                            if (i2 == R.drawable.abc_ratingbar_material) {
                                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_big);
                            }
                            if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_medium);
                            }
                            if (i2 == R.drawable.abc_ratingbar_small_material) {
                                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_small);
                            }
                            return null;
                        }

                        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                        public ColorStateList getTintListForDrawableRes(@NonNull Context context, int i2) {
                            if (i2 == R.drawable.abc_edit_text_material) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
                            }
                            if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
                            }
                            if (i2 == R.drawable.abc_switch_thumb_material) {
                                return createSwitchThumbColorStateList(context);
                            }
                            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                                return createDefaultButtonColorStateList(context);
                            }
                            if (i2 == R.drawable.abc_btn_borderless_material) {
                                return createBorderlessButtonColorStateList(context);
                            }
                            if (i2 == R.drawable.abc_btn_colored_material) {
                                return createColoredButtonColorStateList(context);
                            }
                            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                            }
                            if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i2)) {
                                return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                            }
                            if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i2)) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                            }
                            if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i2)) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                            }
                            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                            }
                            return null;
                        }

                        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                        public PorterDuff.Mode getTintModeForDrawableRes(int i2) {
                            return i2 == R.drawable.abc_switch_thumb_material ? PorterDuff.Mode.MULTIPLY : null;
                        }

                        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                        public boolean tintDrawable(@NonNull Context context, int i2, @NonNull Drawable drawable) {
                            int themeAttrColor;
                            Drawable drawable2;
                            if (i2 == R.drawable.abc_seekbar_track_material) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                                int i3 = R.attr.colorControlNormal;
                                setPorterDuffColorFilter(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.DEFAULT_MODE);
                                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.DEFAULT_MODE);
                                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908301);
                                themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                                drawable2 = findDrawableByLayerId2;
                            } else if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
                                return false;
                            } else {
                                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                                int i4 = R.attr.colorControlActivated;
                                setPorterDuffColorFilter(findDrawableByLayerId3, ThemeUtils.getThemeAttrColor(context, i4), AppCompatDrawableManager.DEFAULT_MODE);
                                Drawable findDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(16908301);
                                themeAttrColor = ThemeUtils.getThemeAttrColor(context, i4);
                                drawable2 = findDrawableByLayerId4;
                            }
                            setPorterDuffColorFilter(drawable2, themeAttrColor, AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[RETURN] */
                        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r5, int r6, @androidx.annotation.NonNull android.graphics.drawable.Drawable r7) {
                            /*
                                r4 = this;
                                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                                r8 = r0
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                                r2 = r6
                                boolean r0 = r0.arrayContains(r1, r2)
                                r9 = r0
                                r0 = 16842801(0x1010031, float:2.3693695E-38)
                                r10 = r0
                                r0 = r9
                                if (r0 == 0) goto L2f
                                int r0 = androidx.appcompat.R.attr.colorControlNormal
                                r6 = r0
                            L1e:
                                r0 = -1
                                r10 = r0
                            L21:
                                r0 = 1
                                r11 = r0
                                r0 = r10
                                r12 = r0
                                r0 = r11
                                r10 = r0
                                goto L85
                            L2f:
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.COLORFILTER_COLOR_CONTROL_ACTIVATED
                                r2 = r6
                                boolean r0 = r0.arrayContains(r1, r2)
                                if (r0 == 0) goto L42
                                int r0 = androidx.appcompat.R.attr.colorControlActivated
                                r6 = r0
                                goto L1e
                            L42:
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                                r2 = r6
                                boolean r0 = r0.arrayContains(r1, r2)
                                if (r0 == 0) goto L59
                                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                                r8 = r0
                                r0 = r10
                                r6 = r0
                                goto L1e
                            L59:
                                r0 = r6
                                int r1 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
                                if (r0 != r1) goto L6f
                                r0 = 16842800(0x1010030, float:2.3693693E-38)
                                r6 = r0
                                r0 = 1109603123(0x42233333, float:40.8)
                                int r0 = java.lang.Math.round(r0)
                                r10 = r0
                                goto L21
                            L6f:
                                r0 = r6
                                int r1 = androidx.appcompat.R.drawable.abc_dialog_material_background
                                if (r0 != r1) goto L7c
                                r0 = r10
                                r6 = r0
                                goto L1e
                            L7c:
                                r0 = -1
                                r12 = r0
                                r0 = 0
                                r10 = r0
                                r0 = r10
                                r6 = r0
                            L85:
                                r0 = r10
                                if (r0 == 0) goto Lb8
                                r0 = r7
                                r13 = r0
                                r0 = r7
                                boolean r0 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r0)
                                if (r0 == 0) goto L9a
                                r0 = r7
                                android.graphics.drawable.Drawable r0 = r0.mutate()
                                r13 = r0
                            L9a:
                                r0 = r13
                                r1 = r5
                                r2 = r6
                                int r1 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r1, r2)
                                r2 = r8
                                android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
                                r0.setColorFilter(r1)
                                r0 = r12
                                r1 = -1
                                if (r0 == r1) goto Lb6
                                r0 = r13
                                r1 = r12
                                r0.setAlpha(r1)
                            Lb6:
                                r0 = 1
                                return r0
                            Lb8:
                                r0 = 0
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2) {
        Drawable drawable;
        synchronized (this) {
            drawable = this.mResourceManager.getDrawable(context, i2);
        }
        return drawable;
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2, boolean z) {
        Drawable drawable;
        synchronized (this) {
            drawable = this.mResourceManager.getDrawable(context, i2, z);
        }
        return drawable;
    }

    public ColorStateList getTintList(@NonNull Context context, @DrawableRes int i2) {
        ColorStateList tintList;
        synchronized (this) {
            tintList = this.mResourceManager.getTintList(context, i2);
        }
        return tintList;
    }

    public void onConfigurationChanged(@NonNull Context context) {
        synchronized (this) {
            this.mResourceManager.onConfigurationChanged(context);
        }
    }

    public Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i2) {
        Drawable onDrawableLoadedFromResources;
        synchronized (this) {
            onDrawableLoadedFromResources = this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i2);
        }
        return onDrawableLoadedFromResources;
    }

    public boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i2, @NonNull Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i2, drawable);
    }
}
