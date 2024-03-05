package com.google.android.datatransport.runtime.retries;

import java.lang.Throwable;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/retries/Function.class */
public interface Function<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
