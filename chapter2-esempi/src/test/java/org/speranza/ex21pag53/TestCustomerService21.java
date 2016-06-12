package org.speranza.ex21pag53;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex21pag53InterceptorPriority.Customer21;
import org.speranza.ex21pag53InterceptorPriority.CustomerService21;

public class TestCustomerService21 {

	private static WeldContainer container;
	private static Weld weld;

	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}

	@AfterClass
	public static void close() {
		container.close();
	}

	// ======================================

	@Test
	public void shouldSeeInterceptor() throws Exception {
		CustomerService21 customerService = container.instance().select(CustomerService21.class).get();
		customerService.saveCustomer(new Customer21());
	}
}
