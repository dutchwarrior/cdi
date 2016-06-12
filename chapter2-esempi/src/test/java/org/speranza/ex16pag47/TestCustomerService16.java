package org.speranza.ex16pag47;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCustomerService16 {
	  protected static Weld weld;
	  protected static WeldContainer container;

	  // ======================================
	  // =          Lifecycle Methods         =
	  // ======================================

	  @BeforeClass
	  public static void init() {
	    weld = new Weld();
	    container = weld.initialize();
	  }

	  @AfterClass
	  public static void close() {
	    weld.shutdown();
	  }

	  // ======================================
	  // =              Methods               =
	  // ======================================

	  @Test
	  public void shouldSeeInterceptor() throws Exception {
	    CustomerService16 customerService = container.instance().select(CustomerService16.class).get();
	    customerService.createCustomer(new Customer16());
	  }
}
