package org.speranza.ex09.pag36;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Odd {

}
