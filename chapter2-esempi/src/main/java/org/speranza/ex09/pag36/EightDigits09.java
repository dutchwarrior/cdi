package org.speranza.ex09.pag36;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Qualifier
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface EightDigits09 {

}
