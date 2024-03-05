package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
@RequiresApi(19)
/* loaded from: ItsOnFire.jar:androidx/documentfile/provider/DocumentsContractApi19.class */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    private DocumentsContractApi19() {
    }

    public static boolean canRead(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri));
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(rawType) || (queryForInt & 8) == 0) {
            return (TextUtils.isEmpty(rawType) || (queryForInt & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    public static boolean exists(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor query = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                cursor2 = query;
                cursor = query;
                if (query.getCount() > 0) {
                    z = true;
                }
                closeQuietly(query);
                return z;
            } catch (Exception e2) {
                Cursor cursor3 = cursor;
                StringBuilder sb = new StringBuilder();
                Cursor cursor4 = cursor;
                sb.append("Failed query: ");
                Cursor cursor5 = cursor;
                sb.append(e2);
                cursor2 = cursor;
                Log.w("DocumentFile", sb.toString());
                closeQuietly(cursor);
                return false;
            }
        } catch (Throwable th) {
            closeQuietly(cursor2);
            throw th;
        }
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        String str = rawType;
        if ("vnd.android.document/directory".equals(rawType)) {
            str = null;
        }
        return str;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static boolean isVirtual(Context context, Uri uri) {
        boolean z = false;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ((getFlags(context, uri) & 512) != 0) {
                z = true;
            }
            return z;
        }
        return false;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    private static int queryForInt(Context context, Uri uri, String str, int i2) {
        return (int) queryForLong(context, uri, str, i2);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor query = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!query.moveToFirst() || query.isNull(0)) {
                    closeQuietly(query);
                    return j2;
                }
                cursor2 = query;
                cursor = query;
                long j3 = query.getLong(0);
                closeQuietly(query);
                return j3;
            } catch (Exception e2) {
                Cursor cursor3 = cursor;
                StringBuilder sb = new StringBuilder();
                Cursor cursor4 = cursor;
                sb.append("Failed query: ");
                Cursor cursor5 = cursor;
                sb.append(e2);
                Cursor cursor6 = cursor;
                Log.w("DocumentFile", sb.toString());
                closeQuietly(cursor);
                return j2;
            }
        } catch (Throwable th) {
            closeQuietly(cursor2);
            throw th;
        }
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor query = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!query.moveToFirst() || query.isNull(0)) {
                    closeQuietly(query);
                    return str2;
                }
                cursor2 = query;
                cursor = query;
                String string = query.getString(0);
                closeQuietly(query);
                return string;
            } catch (Exception e2) {
                Cursor cursor3 = cursor;
                StringBuilder sb = new StringBuilder();
                Cursor cursor4 = cursor;
                sb.append("Failed query: ");
                Cursor cursor5 = cursor;
                sb.append(e2);
                Cursor cursor6 = cursor;
                Log.w("DocumentFile", sb.toString());
                closeQuietly(cursor);
                return str2;
            }
        } catch (Throwable th) {
            closeQuietly(cursor2);
            throw th;
        }
    }
}
