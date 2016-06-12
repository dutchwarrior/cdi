package org.speranza.ex07pag34;

import javax.inject.Inject;

public class LegacyBookService07 {

	@Inject
	@EightDigits07
	private NumberGenerator07 numberGenerator;

	public Book07 createBook(String title, Float price, String description) {
		Book07 book = new Book07(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
}
