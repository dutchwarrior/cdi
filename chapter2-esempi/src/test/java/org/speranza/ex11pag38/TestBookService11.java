package org.speranza.ex11pag38;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBookService11 {

	private static Weld weld;
	private static WeldContainer weldContainer;
	
	@BeforeClass
	public static void init() {
		weld = new Weld();
		weldContainer = weld.initialize();
	}
	
	@AfterClass
	public static void destroy() {
		weldContainer.close();
	}
	
	@Test
	public void testCreateBook() {
		BookService11 bookService = weldContainer.instance().select(BookService11.class).get();
        Book11 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
        System.out.println("########### " + book.getIsbn());
        Assert.assertTrue(book.getIsbn().startsWith("13"));
	}
}
