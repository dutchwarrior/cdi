package org.speranza.ex08pag36;

import javax.inject.Inject;

public class LegacyBookService08 {

	@Inject
	@NumberOfDigits08(odd = false, value = Digits.EIGHT)
	private NumberGenerator08 numberGenerator;

	public Book08 createBook(String title, Float price, String description) {
		Book08 book = new Book08(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}

}
