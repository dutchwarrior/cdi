package org.speranza.ex18pag50;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCustomerService18 {

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
		CustomerService18 customerService = container.instance().select(CustomerService18.class).get();
		customerService.createCustomer(new Customer18());
	}
}
