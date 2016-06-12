package org.speranza.ex18pag50;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ProfileInterceptor18 {

	@Inject
	private Logger logger;

	@PostConstruct
	public void logMethod(InvocationContext ic) {
		logger.fine(ic.getTarget().toString());
		logger.severe(">>>");
		try {
			ic.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			logger.severe("<<<" + ic.getTarget().toString());
			logger.fine(ic.getTarget().toString());
		}
	}

	@AroundInvoke
	public Object profile(InvocationContext ic) throws Exception {
		long initTime = System.currentTimeMillis();
		try {
			return ic.proceed();
		} finally {
			long diffTime = System.currentTimeMillis() - initTime;
			logger.severe("###" + ic.getMethod() + " took " + diffTime + " millis");
			logger.fine(ic.getMethod() + " took " + diffTime + " millis");
		}
	}
	

	@AroundConstruct
	private void init(InvocationContext invocationContext)  {
		logger.fine("Entering constructor");
		logger.severe("Entering constructor");
		try {
			invocationContext.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			logger.severe("end constructor");
			logger.fine("end constuctor");
		}
	}

	
}
