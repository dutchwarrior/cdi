package org.speranza.ex21pag53InterceptorPriority;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Interceptor
@Loggable21
@Priority(Interceptor.Priority.PLATFORM_BEFORE)
public class LoggingInterceptor21 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private Logger logger;

  // ======================================
  // =          Business methods          =
  // ======================================

  @AroundInvoke
  public Object logMethod(InvocationContext ic) throws Exception {
    logger.entering(ic.getTarget().toString(), ic.getMethod().getName());
    logger.severe(">>>" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
    try {
      return ic.proceed();
    } finally {
      logger.severe("<<<" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
      logger.exiting(ic.getTarget().toString(), ic.getMethod().getName());
    }
  }
}