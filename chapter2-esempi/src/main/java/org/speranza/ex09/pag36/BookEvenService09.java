package org.speranza.ex09.pag36;

import javax.inject.Inject;

public class BookEvenService09 {
	
	@Inject 
	@ThirteenDigits09
	@Even09
	private NumberGenerator generator;

	public Book09 createBook(String title, Float price, String description) {
		Book09 book = new Book09(title, price, description);
		book.setIsbn(generator.generateNumber());
		return book;
	}
}
