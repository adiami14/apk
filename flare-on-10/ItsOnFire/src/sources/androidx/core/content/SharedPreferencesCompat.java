package androidx.core.content;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
@Deprecated
/* loaded from: ItsOnFire.jar:androidx/core/content/SharedPreferencesCompat.class */
public final class SharedPreferencesCompat {

    @Deprecated
    /* loaded from: ItsOnFire.jar:androidx/core/content/SharedPreferencesCompat$EditorCompat.class */
    public static final class EditorCompat {
        private static EditorCompat sInstance;
        private final Helper mHelper = new Helper();

        /* loaded from: ItsOnFire.jar:androidx/core/content/SharedPreferencesCompat$EditorCompat$Helper.class */
        public static class Helper {
            public void apply(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError e2) {
                    editor.commit();
                }
            }
        }

        private EditorCompat() {
        }

        @Deprecated
        public static EditorCompat getInstance() {
            if (sInstance == null) {
                sInstance = new EditorCompat();
            }
            return sInstance;
        }

        @Deprecated
        public void apply(@NonNull SharedPreferences.Editor editor) {
            this.mHelper.apply(editor);
        }
    }

    private SharedPreferencesCompat() {
    }
}
