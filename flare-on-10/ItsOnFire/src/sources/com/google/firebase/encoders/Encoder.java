package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
/* loaded from: ItsOnFire.jar:com/google/firebase/encoders/Encoder.class */
interface Encoder<TValue, TContext> {
    void encode(@NonNull TValue tvalue, @NonNull TContext tcontext) throws IOException;
}
