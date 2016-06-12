package org.speranza.ex02.pag30;

import org.junit.Assert;
import org.junit.Test;
import org.speranza.ex02pag30.Book02;
import org.speranza.ex02pag30.BookService02;


public class NumberGenerator02Test {

	
	@Test
	public void shouldCheckNumberIsThirteenDigits() {
		BookService02 bookService02 = new BookService02();
		Book02 book = bookService02.createBook("H2G2", 12.60f, "Io sono leggenda");
		
		Assert.assertTrue(book.getIsbn().startsWith("13"));
	}
}
