package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: ItsOnFire.jar:androidx/appcompat/app/AppCompatViewInflater.class */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final int[] sScreenReaderFocusable = {16844148};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final SimpleArrayMap<String, Constructor<? extends View>> sConstructorMap = new SimpleArrayMap<>();

    /* loaded from: ItsOnFire.jar:androidx/appcompat/app/AppCompatViewInflater$DeclaredOnClickListener.class */
    public static class DeclaredOnClickListener implements View.OnClickListener {
        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        public DeclaredOnClickListener(@NonNull View view, @NonNull String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        private void resolveMethod(@Nullable Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.mMethodName, View.class)) != null) {
                        this.mResolvedMethod = method;
                        this.mResolvedContext = context;
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.mHostView.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.mMethodName + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.mHostView.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.mResolvedMethod == null) {
                resolveMethod(this.mHostView.getContext());
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void backportAccessibilityAttributes(@NonNull Context context, @NonNull View view, @NonNull AttributeSet attributeSet) {
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && ViewCompat.hasOnClickListeners(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new DeclaredOnClickListener(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = sConstructorMap;
        Constructor<? extends View> constructor = simpleArrayMap.get(str);
        Constructor<? extends View> constructor2 = constructor;
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception e2) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor2 = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            simpleArrayMap.put(str, constructor2);
        }
        constructor2.setAccessible(true);
        return constructor2.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        String str2 = str;
        if (str.equals("view")) {
            str2 = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str2.indexOf(46)) {
                View createViewByPrefix = createViewByPrefix(context, str2, null);
                Object[] objArr2 = this.mConstructorArgs;
                objArr2[0] = null;
                objArr2[1] = null;
                return createViewByPrefix;
            }
            int i2 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i2 >= strArr.length) {
                    Object[] objArr3 = this.mConstructorArgs;
                    objArr3[0] = null;
                    objArr3[1] = null;
                    return null;
                }
                View createViewByPrefix2 = createViewByPrefix(context, str2, strArr[i2]);
                if (createViewByPrefix2 != null) {
                    Object[] objArr4 = this.mConstructorArgs;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    return createViewByPrefix2;
                }
                i2++;
            }
        } catch (Exception e2) {
            Object[] objArr5 = this.mConstructorArgs;
            objArr5[0] = null;
            objArr5[1] = null;
            return null;
        } catch (Throwable th) {
            Object[] objArr6 = this.mConstructorArgs;
            objArr6[0] = null;
            objArr6[1] = null;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (((androidx.appcompat.view.ContextThemeWrapper) r6).getThemeResId() != r11) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Context themifyContext(android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9) {
        /*
            r0 = r6
            r1 = r7
            int[] r2 = androidx.appcompat.R.styleable.View
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L1c
            r0 = r7
            int r1 = androidx.appcompat.R.styleable.View_android_theme
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            goto L1f
        L1c:
            r0 = 0
            r10 = r0
        L1f:
            r0 = r10
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L4f
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L4f
            r0 = r7
            int r1 = androidx.appcompat.R.styleable.View_theme
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L4f
            java.lang.String r0 = "AppCompatViewInflater"
            java.lang.String r1 = "app:theme is now deprecated. Please move to using android:theme instead."
            int r0 = android.util.Log.i(r0, r1)
            r0 = r10
            r11 = r0
        L4f:
            r0 = r7
            r0.recycle()
            r0 = r6
            r7 = r0
            r0 = r11
            if (r0 == 0) goto L7a
            r0 = r6
            boolean r0 = r0 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r0 == 0) goto L6f
            r0 = r6
            r7 = r0
            r0 = r6
            androidx.appcompat.view.ContextThemeWrapper r0 = (androidx.appcompat.view.ContextThemeWrapper) r0
            int r0 = r0.getThemeResId()
            r1 = r11
            if (r0 == r1) goto L7a
        L6f:
            androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
            r1 = r0
            r2 = r6
            r3 = r11
            r1.<init>(r2, r3)
            r7 = r0
        L7a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatViewInflater.themifyContext(android.content.Context, android.util.AttributeSet, boolean, boolean):android.content.Context");
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @NonNull
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @Nullable
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r12 != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(android.view.View r6, java.lang.String r7, @androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull android.util.AttributeSet r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatViewInflater.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }
}
