package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;
@WorkerThread
/* loaded from: ItsOnFire.jar:com/google/android/gms/common/api/internal/zacs.class */
public interface zacs {
    void zae(ConnectionResult connectionResult);

    void zaf(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);
}
