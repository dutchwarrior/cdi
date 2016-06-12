package org.speranza.ex24pag55Event;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Qualifier
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})
public @interface Add {

}
