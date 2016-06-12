package org.speranza.ex10pag37;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBookService10 {

	private static WeldContainer weldContainer;
	private static Weld weld;
	
	@BeforeClass
	public static void init() {
		weld = new Weld();
		weldContainer = weld.initialize();
	}
	
	@AfterClass
	public static void after() {
		weldContainer.close();
	}
	
	@Test
	public void testCreateBook() {
		BookService10 bookService10 = weldContainer.instance().select(BookService10.class).get();
		Book10 book = bookService10.createBook("title", 10f, "description");
		Assert.assertTrue(book.getIsbn().contains("mock generator"));
	}
}
