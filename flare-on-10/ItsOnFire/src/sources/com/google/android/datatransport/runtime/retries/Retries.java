package com.google.android.datatransport.runtime.retries;
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/retries/Retries.class */
public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult retry(int i2, TInput tinput, Function<TInput, TResult, TException> function, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        TResult apply;
        int i3;
        int i4 = i2;
        TInput tinput2 = tinput;
        if (i2 < 1) {
            return function.apply(tinput);
        }
        do {
            apply = function.apply(tinput2);
            tinput2 = retryStrategy.shouldRetry(tinput2, apply);
            if (tinput2 == null) {
                break;
            }
            i3 = i4 - 1;
            i4 = i3;
        } while (i3 >= 1);
        return apply;
    }
}
