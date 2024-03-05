package com.google.android.gms.dynamite;

import android.os.Process;
/* loaded from: ItsOnFire.jar:com/google/android/gms/dynamite/zza.class */
final class zza extends Thread {
    public zza(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException e2) {
                    return;
                }
            }
        }
    }
}
