package org.speranza.ex06.pag32;

import static org.junit.Assert.assertTrue;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex06pag32.Book06;
import org.speranza.ex06pag32.BookService06;

public class NumberGeneratorex06pag32 {

	// ======================================
	// = Attributes =
	// ======================================

	protected static Weld weld;
	protected static WeldContainer container;

	// ======================================
	// = Lifecycle Methods =
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
	// = Methods =
	// ======================================

	@Test
	public void shouldCheckNumberIsThirteenDigits() {
		BookService06 bookService = container.instance().select(BookService06.class).get();
		Book06 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		assertTrue(book.getIsbn().startsWith("13"));
	}
}
