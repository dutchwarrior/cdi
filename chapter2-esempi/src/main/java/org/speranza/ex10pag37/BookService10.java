package org.speranza.ex10pag37;

import javax.inject.Inject;

public class BookService10 {

	@Inject
	private NumberGenerator10 numberGenerator;

	public Book10 createBook(String title, Float price, String description) {
		Book10 book = new Book10(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
}
