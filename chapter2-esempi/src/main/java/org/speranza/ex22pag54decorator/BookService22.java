package org.speranza.ex22pag54decorator;

import javax.inject.Inject;

public class BookService22 {

	@Inject
	private Numbergenerator22 numbergenerator;
	
	public Book22 createBook(String title, Float price, String description) {
		Book22 book = new Book22(title, price, description);
		book.setIsbn(numbergenerator.generateNumber());
		
		return book;
	}
}
