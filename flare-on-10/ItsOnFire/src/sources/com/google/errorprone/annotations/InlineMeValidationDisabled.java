package com.google.errorprone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
/* loaded from: ItsOnFire.jar:com/google/errorprone/annotations/InlineMeValidationDisabled.class */
public @interface InlineMeValidationDisabled {
    String value();
}
