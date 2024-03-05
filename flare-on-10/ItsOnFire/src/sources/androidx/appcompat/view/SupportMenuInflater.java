package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/appcompat/view/SupportMenuInflater.class */
public class SupportMenuInflater extends MenuInflater {
    public static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    public static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    public static final String LOG_TAG = "SupportMenuInflater";
    public static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    public final Object[] mActionProviderConstructorArguments;
    public final Object[] mActionViewConstructorArguments;
    public Context mContext;
    private Object mRealOwner;

    /* loaded from: ItsOnFire.jar:androidx/appcompat/view/SupportMenuInflater$InflatedOnMenuItemClickListener.class */
    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, menuItem)).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/appcompat/view/SupportMenuInflater$MenuState.class */
    public class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        public ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private ColorStateList itemIconTintList = null;
        private PorterDuff.Mode itemIconTintMode = null;
        private int itemId;
        private String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private CharSequence itemTooltipText;
        private boolean itemVisible;
        private Menu menu;

        public MenuState(Menu menu) {
            this.menu = menu;
            resetGroup();
        }

        private char getShortcut(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T newInstance(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.mContext.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w(SupportMenuInflater.LOG_TAG, "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void setItem(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable >= 1).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            int i2 = this.itemShowAsAction;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.itemListenerMethodName != null) {
                if (SupportMenuInflater.this.mContext.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.itemActionViewClassName;
            if (str != null) {
                menuItem.setActionView((View) newInstance(str, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z = true;
            }
            int i3 = this.itemActionViewLayout;
            if (i3 > 0) {
                if (z) {
                    Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            ActionProvider actionProvider = this.itemActionProvider;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.itemContentDescription);
            MenuItemCompat.setTooltipText(menuItem, this.itemTooltipText);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.itemAlphabeticShortcut, this.itemAlphabeticModifiers);
            MenuItemCompat.setNumericShortcut(menuItem, this.itemNumericShortcut, this.itemNumericModifiers);
            PorterDuff.Mode mode = this.itemIconTintMode;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.itemIconTintList;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }

        public void addItem() {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
            this.groupId = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
            this.groupCategory = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
            this.groupOrder = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
            this.groupCheckable = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.groupVisible = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
            this.groupEnabled = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            throw new RuntimeException("d2j fail translate: java.lang.RuntimeException\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.mergeProviderType(TypeTransformer.java:613)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.mergeTypeToSubRef(TypeTransformer.java:457)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:560)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:392)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:369)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:45)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:165)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:449)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:41)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:132)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:582)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:441)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:457)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:126)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:275)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:107)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:290)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:33)\n");
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    private Object findRealOwner(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return findRealOwner(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
        r12 = null;
        r13 = false;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r10 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r10 == 2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
        if (r10 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        r0 = r6.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        if (r11 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r0.equals(r12) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
        r8 = null;
        r10 = false;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r0.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
        r0.resetGroup();
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
        if (r0.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
        if (r0.hasAddedItem() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
        r0 = r0.itemActionProvider;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fe, code lost:
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        if (r0.hasSubMenu() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
        r0.addSubMenuItem();
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
        r0.addItem();
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
        if (r0.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
        r14 = true;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
        if (r11 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0156, code lost:
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0164, code lost:
        r8 = r6.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0171, code lost:
        if (r8.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0174, code lost:
        r0.readGroup(r7);
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018e, code lost:
        if (r8.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0191, code lost:
        r0.readItem(r7);
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ab, code lost:
        if (r8.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ae, code lost:
        parseMenu(r6, r7, r0.addSubMenuItem());
        r14 = r13;
        r10 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c7, code lost:
        r10 = true;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
        r13 = r14;
        r11 = r10;
        r12 = r8;
        r10 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f1, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f2, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.view.Menu r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.SupportMenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    @Override // android.view.MenuInflater
    public void inflate(@LayoutRes int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser xmlResourceParser3 = null;
        try {
            try {
                try {
                    XmlResourceParser layout = this.mContext.getResources().getLayout(i2);
                    xmlResourceParser3 = layout;
                    xmlResourceParser = layout;
                    xmlResourceParser2 = layout;
                    parseMenu(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e2) {
                    XmlResourceParser xmlResourceParser4 = xmlResourceParser2;
                    XmlResourceParser xmlResourceParser5 = xmlResourceParser2;
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser3 != null) {
                xmlResourceParser3.close();
            }
            throw th;
        }
    }
}
