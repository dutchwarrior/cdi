package org.speranza.ex19pag51;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class I1 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private Logger logger;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @AroundInvoke
  public Object logMethod(InvocationContext ic) throws Exception {
    logger.entering(ic.getTarget().toString(), ic.getMethod().getName());
    logger.severe("I1>>>" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
    try {
      return ic.proceed();
    } finally {
      logger.severe("I1<<<" + ic.getTarget().toString() + " - " + ic.getMethod().getName());
      logger.exiting(ic.getTarget().toString(), ic.getMethod().getName());
    }
  }
}
