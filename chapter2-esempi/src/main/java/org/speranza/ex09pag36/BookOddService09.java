package org.speranza.ex09pag36;

import javax.inject.Inject;

public class BookOddService09 {
	
	@Inject
	@ThirteenDigits09
	@Odd
	private NumberGenerator generator;

	public Book09 createBook(String title, Float price, String description) {
		Book09 book = new Book09(title, price, description);
		book.setIsbn(generator.generateNumber());
		return book;
	}
}
