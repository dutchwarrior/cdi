package org.speranza.ex04.pag30;

import static org.junit.Assert.assertTrue;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex04pag30.Book04;
import org.speranza.ex04pag30.BookService04;

public class NumberGeneratorex04pag30 {

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
		BookService04 bookService = container.instance().select(BookService04.class).get();
		Book04 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		assertTrue(book.getIsbn().startsWith("13"));
	}
}
