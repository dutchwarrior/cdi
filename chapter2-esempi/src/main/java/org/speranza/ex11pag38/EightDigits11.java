package org.speranza.ex11pag38;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(RUNTIME)
@Qualifier
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface EightDigits11 {

}
