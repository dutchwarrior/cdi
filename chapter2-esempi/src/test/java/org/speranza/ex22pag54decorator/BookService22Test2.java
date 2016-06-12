package org.speranza.ex22pag54decorator;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex23DecoratorExample.TestDecorator;

public class BookService22Test2 {
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
		TestDecorator customerService = container.instance().select(TestDecorator.class).get();
		String generateNumber = customerService.getNumber().generateNumber();
		Assert.assertTrue(generateNumber.startsWith("pippo"));
	}
}
