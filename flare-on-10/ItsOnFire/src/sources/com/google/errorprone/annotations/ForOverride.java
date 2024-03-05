package com.google.errorprone.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@IncompatibleModifiers(modifier = {Modifier.PUBLIC, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: ItsOnFire.jar:com/google/errorprone/annotations/ForOverride.class */
public @interface ForOverride {
}