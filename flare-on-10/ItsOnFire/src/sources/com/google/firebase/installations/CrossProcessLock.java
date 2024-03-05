package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
/* loaded from: ItsOnFire.jar:com/google/firebase/installations/CrossProcessLock.class */
class CrossProcessLock {
    private static final String TAG = "CrossProcessLock";
    private final FileChannel channel;
    private final FileLock lock;

    private CrossProcessLock(FileChannel fileChannel, FileLock fileLock) {
        this.channel = fileChannel;
        this.lock = fileLock;
    }

    public static CrossProcessLock acquire(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new CrossProcessLock(fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException e4) {
            e = e4;
            Log.e(TAG, "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException e5) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                    return null;
                } catch (IOException e6) {
                    return null;
                }
            }
            return null;
        }
    }

    public void releaseAndClose() {
        try {
            this.lock.release();
            this.channel.close();
        } catch (IOException e2) {
            Log.e(TAG, "encountered error while releasing, ignoring", e2);
        }
    }
}
