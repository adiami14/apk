package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;
/* loaded from: ItsOnFire.jar:com/google/firebase/heartbeatinfo/HeartBeatInfo.class */
public interface HeartBeatInfo {

    /* loaded from: ItsOnFire.jar:com/google/firebase/heartbeatinfo/HeartBeatInfo$HeartBeat.class */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i2) {
            this.code = i2;
        }

        public int getCode() {
            return this.code;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);
}
