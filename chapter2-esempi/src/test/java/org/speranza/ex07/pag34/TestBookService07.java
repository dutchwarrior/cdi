package org.speranza.ex07.pag34;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex07pag34.Book07;
import org.speranza.ex07pag34.BookService07;
import org.speranza.ex07pag34.LegacyBookService07;

public class TestBookService07 {

	private static Weld weld;
	private static WeldContainer container;

	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}

	@AfterClass
	public static void destroy() {
		container.close();
	}

	@Test
	public void testCreateBook() {
		BookService07 bookService = container.instance().select(BookService07.class).get();
		Book07 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("13"));
	}
	
	@Test
	public void testCreateLegacyBook() {
		LegacyBookService07 legacyBookService = container.instance().select(LegacyBookService07.class).get();
		Book07 book = legacyBookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("8"));
	}
}
