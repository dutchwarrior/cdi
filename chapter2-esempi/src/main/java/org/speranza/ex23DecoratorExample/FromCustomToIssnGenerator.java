package org.speranza.ex23DecoratorExample;

import java.util.logging.Logger;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class FromCustomToIssnGenerator implements NumberGenerator {

	@Inject
	@Delegate
	@TypeProcess
	private NumberGenerator numberGenerator;

	@Inject
	private Logger logger;

	@Override
	public String generateNumber() {
		logger.severe("classe FromCustomToIssnGenerator");
		return "pippo"+numberGenerator.generateNumber();
	}

}
