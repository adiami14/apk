package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentListener;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: ItsOnFire.jar:androidx/core/widget/TextViewOnReceiveContentListener.class */
public final class TextViewOnReceiveContentListener implements OnReceiveContentListener {
    private static final String LOG_TAG = "ReceiveContent";

    @RequiresApi(16)
    /* loaded from: ItsOnFire.jar:androidx/core/widget/TextViewOnReceiveContentListener$Api16Impl.class */
    public static final class Api16Impl {
        private Api16Impl() {
        }

        public static CharSequence coerce(@NonNull Context context, @NonNull ClipData.Item item, int i2) {
            if ((i2 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                String str = coerceToText;
                if (coerceToText instanceof Spanned) {
                    str = coerceToText.toString();
                }
                return str;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/core/widget/TextViewOnReceiveContentListener$ApiImpl.class */
    public static final class ApiImpl {
        private ApiImpl() {
        }

        public static CharSequence coerce(@NonNull Context context, @NonNull ClipData.Item item, int i2) {
            CharSequence coerceToText = item.coerceToText(context);
            String str = coerceToText;
            if ((i2 & 1) != 0) {
                str = coerceToText;
                if (coerceToText instanceof Spanned) {
                    str = coerceToText.toString();
                }
            }
            return str;
        }
    }

    private static CharSequence coerceToText(@NonNull Context context, @NonNull ClipData.Item item, int i2) {
        return Api16Impl.coerce(context, item, i2);
    }

    private static void replaceSelection(@NonNull Editable editable, @NonNull CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.OnReceiveContentListener
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable(LOG_TAG, 3)) {
            Log.d(LOG_TAG, "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.getSource() == 2) {
            return contentInfoCompat;
        }
        ClipData clip = contentInfoCompat.getClip();
        int flags = contentInfoCompat.getFlags();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        int i2 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (i2 >= clip.getItemCount()) {
                return null;
            }
            CharSequence coerceToText = coerceToText(context, clip.getItemAt(i2), flags);
            boolean z3 = z2;
            if (coerceToText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToText);
                    z3 = z2;
                } else {
                    replaceSelection(editable, coerceToText);
                    z3 = true;
                }
            }
            i2++;
            z = z3;
        }
    }
}
