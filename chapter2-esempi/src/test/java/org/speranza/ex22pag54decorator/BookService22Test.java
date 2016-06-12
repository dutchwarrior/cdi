package org.speranza.ex22pag54decorator;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookService22Test {
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
		BookService22 customerService = container.instance().select(BookService22.class).get();
		Book22 book = customerService.createBook("10", 60f, "leggenda");
		Assert.assertTrue(book.getIsbn().startsWith("13-"));
	}
}
