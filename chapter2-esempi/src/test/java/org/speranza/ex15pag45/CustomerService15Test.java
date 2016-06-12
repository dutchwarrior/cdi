package org.speranza.ex15pag45;

import java.util.Date;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerService15Test {
	private static Weld weld;
	private static WeldContainer container;

	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}

	@AfterClass
	public static void destroy() {
		container.shutdown();
	}
	
	 @Test
	  public void shouldSeeInterceptor() throws Exception {
	    CustomerService15 customerService = container.instance().select(CustomerService15.class).get();
	    customerService.createCustomer(new Customer15(1L, "federico", "salute", "ds", "sad", new Date() ));
	  }
}
