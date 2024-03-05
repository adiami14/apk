package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AppCompatReceiveContentHelper.class */
final class AppCompatReceiveContentHelper {
    private static final String LOG_TAG = "ReceiveContent";

    @RequiresApi(24)
    /* loaded from: ItsOnFire.jar:androidx/appcompat/widget/AppCompatReceiveContentHelper$OnDropApi24Impl.class */
    public static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        @DoNotInline
        public static boolean onDropForTextView(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @DoNotInline
        public static boolean onDropForView(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    private AppCompatReceiveContentHelper() {
    }

    public static boolean maybeHandleDragEventViaPerformReceiveContent(@NonNull View view, @NonNull DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 31 || dragEvent.getLocalState() != null || ViewCompat.getOnReceiveContentMimeTypes(view) == null) {
            return false;
        }
        Activity tryGetActivity = tryGetActivity(view);
        if (tryGetActivity == null) {
            Log.i(LOG_TAG, "Can't handle drop: no activity: view=" + view);
            return false;
        } else if (dragEvent.getAction() == 1) {
            return !(view instanceof TextView);
        } else {
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? OnDropApi24Impl.onDropForTextView(dragEvent, (TextView) view, tryGetActivity) : OnDropApi24Impl.onDropForView(dragEvent, view, tryGetActivity);
            }
            return false;
        }
    }

    public static boolean maybeHandleMenuActionViaPerformReceiveContent(@NonNull TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes(textView) == null) {
            return false;
        }
        if (i2 == 16908322 || i2 == 16908337) {
            ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                return true;
            }
            ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(primaryClip, 1).setFlags(i2 == 16908322 ? 0 : 1).build());
            return true;
        }
        return false;
    }

    @Nullable
    public static Activity tryGetActivity(@NonNull View view) {
        Context context = view.getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            if (context2 instanceof Activity) {
                return (Activity) context2;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }
}