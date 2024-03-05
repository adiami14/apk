package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:androidx/appcompat/view/menu/BaseMenuWrapper.class */
public abstract class BaseMenuWrapper {
    public final Context mContext;
    private SimpleArrayMap<SupportMenuItem, MenuItem> mMenuItems;
    private SimpleArrayMap<SupportSubMenu, SubMenu> mSubMenus;

    public BaseMenuWrapper(Context context) {
        this.mContext = context;
    }

    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        MenuItemWrapperICS menuItemWrapperICS = menuItem;
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (this.mMenuItems == null) {
                this.mMenuItems = new SimpleArrayMap<>();
            }
            MenuItem menuItem2 = this.mMenuItems.get(menuItem);
            menuItemWrapperICS = menuItem2;
            if (menuItem2 == null) {
                menuItemWrapperICS = new MenuItemWrapperICS(this.mContext, supportMenuItem);
                this.mMenuItems.put(supportMenuItem, menuItemWrapperICS);
            }
        }
        return menuItemWrapperICS;
    }

    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
            if (this.mSubMenus == null) {
                this.mSubMenus = new SimpleArrayMap<>();
            }
            SubMenu subMenu2 = this.mSubMenus.get(supportSubMenu);
            SubMenuWrapperICS subMenuWrapperICS = subMenu2;
            if (subMenu2 == null) {
                subMenuWrapperICS = new SubMenuWrapperICS(this.mContext, supportSubMenu);
                this.mSubMenus.put(supportSubMenu, subMenuWrapperICS);
            }
            return subMenuWrapperICS;
        }
        return subMenu;
    }

    public final void internalClear() {
        SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.mMenuItems;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<SupportSubMenu, SubMenu> simpleArrayMap2 = this.mSubMenus;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    public final void internalRemoveGroup(int i2) {
        if (this.mMenuItems == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.mMenuItems.size()) {
                return;
            }
            int i5 = i4;
            if (this.mMenuItems.keyAt(i4).getGroupId() == i2) {
                this.mMenuItems.removeAt(i4);
                i5 = i4 - 1;
            }
            i3 = i5 + 1;
        }
    }

    public final void internalRemoveItem(int i2) {
        if (this.mMenuItems == null) {
            return;
        }
        for (int i3 = 0; i3 < this.mMenuItems.size(); i3++) {
            if (this.mMenuItems.keyAt(i3).getItemId() == i2) {
                this.mMenuItems.removeAt(i3);
                return;
            }
        }
    }
}
