package org.speranza.ex09pag36;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.speranza.ex09pag36.Book09;
import org.speranza.ex09pag36.BookEvenService09;
import org.speranza.ex09pag36.BookOddService09;
import org.speranza.ex09pag36.LegacyBookService09;

public class TestCreateBookService {

	private static Weld weld;
	private static WeldContainer container;

	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}

	@AfterClass
	public static void close() {
		weld.shutdown();
	}
	
	@Test
	public void testLegacyService() {
		LegacyBookService09 legacyBookService = container.instance().select(LegacyBookService09.class).get();
		Book09 book = legacyBookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("8-"));
	}
	
	@Test
	public void testBookEventService() {
		BookEvenService09 bookEvenService = container.instance().select(BookEvenService09.class).get();
		Book09 book = bookEvenService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("132-84356-"));
	}
	
	@Test
	public void testBookOddService() {
		BookOddService09 bookOddService = container.instance().select(BookOddService09.class).get();
		Book09 book = bookOddService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("131-84356-"));
	}
}
