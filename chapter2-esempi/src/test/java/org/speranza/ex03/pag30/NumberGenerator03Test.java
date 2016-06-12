package org.speranza.ex03.pag30;

import org.junit.Assert;
import org.junit.Test;
import org.speranza.ex03pag30.Book03;
import org.speranza.ex03pag30.BookService03;
import org.speranza.ex03pag30.IsbnGenerator03;
import org.speranza.ex03pag30.IssnGenerator03;


public class NumberGenerator03Test {

	
	@Test
	public void shouldCheckNumberIsThirteenDigits() {
		BookService03 bookService = new BookService03(new IsbnGenerator03());
		Book03 book = bookService.createBook("H2G2", 12.60f, "Io sono leggenda");
		Assert.assertTrue(book.getIsbn().startsWith("13"));
		
		bookService = new BookService03(new IssnGenerator03());
		book = bookService.createBook("H2G2", 12.60f, "Io sono leggenda");
		Assert.assertFalse(book.getIsbn().startsWith("13"));
	}
}
