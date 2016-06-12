package org.speranza.ex23DecoratorExample;

import javax.inject.Inject;

public class TestDecorator {

	@Inject
	@TypeProcess
	private NumberGenerator number;

	
	public NumberGenerator getNumber() {
		return number;
	}





}
