package org.speranza.ex24pag55Event;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class BookService24 {

	@Inject
	@Add
	private Event<Book24> listBookAdd;
	
	@Inject
	@Remove
	private Event<Book24> listbookRemove;

	@Inject
	private INumberGenerator numberGenerator;
	
	@Inject
	private InventoryService24 inventoryService24;

	public Book24 creteBook(Float price, String description, String title) {

		Book24 book = new Book24(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		listBookAdd.fire(book);
		return book;
	}
	
	public void removeBook(Book24 book) {
		listbookRemove.fire(book);
	}
	
}
