package com.google.android.datatransport.runtime.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/Subcomponent.class */
public @interface Subcomponent {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/Subcomponent$Builder.class */
    public @interface Builder {
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: ItsOnFire.jar:com/google/android/datatransport/runtime/dagger/Subcomponent$Factory.class */
    public @interface Factory {
    }

    Class<?>[] modules() default {};
}