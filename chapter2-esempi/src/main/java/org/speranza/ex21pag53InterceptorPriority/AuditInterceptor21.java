package org.speranza.ex21pag53InterceptorPriority;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Interceptor
@Auditable21
@Priority(Interceptor.Priority.LIBRARY_BEFORE + 10)
public class AuditInterceptor21 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private Logger logger;

  // ======================================
  // =          Business methods          =
  // ======================================

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
}