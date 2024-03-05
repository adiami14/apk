package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;
@ExtraProperty
/* loaded from: ItsOnFire.jar:com/google/firebase/encoders/proto/Protobuf.class */
public @interface Protobuf {

    /* loaded from: ItsOnFire.jar:com/google/firebase/encoders/proto/Protobuf$IntEncoding.class */
    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
