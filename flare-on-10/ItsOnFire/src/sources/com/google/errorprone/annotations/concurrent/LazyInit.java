package com.google.errorprone.annotations.concurrent;

import com.google.errorprone.annotations.IncompatibleModifiers;
import com.google.errorprone.annotations.Modifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD})
@IncompatibleModifiers(modifier = {Modifier.FINAL})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: ItsOnFire.jar:com/google/errorprone/annotations/concurrent/LazyInit.class */
public @interface LazyInit {
}
