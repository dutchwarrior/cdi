package org.speranza.ex24pag55Event;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;	

public class TestBookService24 {

	private static Weld weld;
	private static WeldContainer container;
	
	
	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}
	
	@AfterClass
	public static void delete() {
		container.close();
	}
	
	@Test
	public void shouldSeeInterceptor() throws Exception {
		BookService24 bookService24 = container.instance().select(BookService24.class).get();
		bookService24.creteBook(10f, "descrizione", "titolo");
	}
}
