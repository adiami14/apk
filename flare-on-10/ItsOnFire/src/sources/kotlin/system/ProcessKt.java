package kotlin.system;

import androidx.appcompat.R;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
@Metadata(d1 = {"��\u000e\n��\n\u0002\u0010\u0001\n��\n\u0002\u0010\b\n��\u001a\u0011\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"exitProcess", "", NotificationCompat.CATEGORY_STATUS, "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmName(name = "ProcessKt")
/* loaded from: ItsOnFire.jar:kotlin/system/ProcessKt.class */
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i2) {
        System.exit(i2);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
