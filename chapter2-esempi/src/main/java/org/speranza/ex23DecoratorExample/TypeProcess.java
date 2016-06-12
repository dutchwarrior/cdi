package org.speranza.ex23DecoratorExample;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Qualifier
@Retention(RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.TYPE})
public @interface TypeProcess {

}
