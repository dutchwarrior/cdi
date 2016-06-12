package org.speranza.ex08pag36;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
		LegacyBookService08 legacyBookService08 = container.instance().select(LegacyBookService08.class).get();
		Book08 book = legacyBookService08.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("8-"));
	}
	
	@Test
	public void testBookEventService() {
		BookEvenService08 bookEvenService08 = container.instance().select(BookEvenService08.class).get();
		Book08 book = bookEvenService08.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("132-84356-"));
	}
	
	@Test
	public void testBookOddService() {
		BookOddService08 bookOddService08 = container.instance().select(BookOddService08.class).get();
		Book08 book = bookOddService08.createBook("H2G2", 12.5f, "Geeky scifi Book");
		Assert.assertTrue(book.getIsbn().startsWith("131-84356-"));
	}
}
