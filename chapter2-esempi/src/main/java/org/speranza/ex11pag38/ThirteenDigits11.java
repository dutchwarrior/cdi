package org.speranza.ex11pag38;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Qualifier
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface ThirteenDigits11 {

}
