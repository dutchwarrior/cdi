package org.speranza.ex11pag38;

import java.util.logging.Logger;

import javax.inject.Inject;

public class BookService11 {

	@Inject
	@ThirteenDigits11
	private NumberGenerator11 numberGenerator;

	@Inject
	private Logger log;

	public Book11 createBook(String title, Float price, String description) {
		log.warning("Debug message without injection");
		Book11 book = new Book11(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
}
