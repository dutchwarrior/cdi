package org.speranza.ex16pag47;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundConstruct
	private void init(InvocationContext invocationContext)  {
		logger.fine("Entering constructor");
		logger.severe("Entering constructor");
		try {
			invocationContext.proceed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			logger.severe("end constructor");
			logger.fine("end constuctor");
		}
	}

	@AroundInvoke
	private Object logMethod(InvocationContext invocationContext) throws Exception {
		logger.entering(">>>"+invocationContext.getTarget().toString(), invocationContext.getMethod().getName());
		logger.severe(invocationContext.getTarget().toString()+ " " + invocationContext.getMethod().getName());
		try {
			return invocationContext.proceed();
		} finally {
			logger.entering("<<<"+ invocationContext.getTarget().toString(), invocationContext.getMethod().getName());
			logger.severe(invocationContext.getTarget().toString()+ " " + invocationContext.getMethod().getName());
			
		}
	}
}
