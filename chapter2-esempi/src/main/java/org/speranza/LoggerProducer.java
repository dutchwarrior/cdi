package org.speranza;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

	
	@Produces
	public Logger gerLogger(InjectionPoint injectionPoint) {
		return Logger.getLogger(injectionPoint.getMember().getName());
	}
}
