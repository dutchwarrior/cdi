package org.speranza.ex22pag54decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class FromEightToThirteenDigits implements Numbergenerator22{

	@Inject
	@Delegate
	private Numbergenerator22 numbergenerator;
	
	@Override
	public String generateNumber() {
		return "13-"+ numbergenerator.generateNumber();
	}

}
