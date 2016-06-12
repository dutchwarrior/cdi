package org.speranza.ex08pag36;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Qualifier
@Retention(RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface NumberOfDigits08 {

	Digits value();
	boolean odd();
}
