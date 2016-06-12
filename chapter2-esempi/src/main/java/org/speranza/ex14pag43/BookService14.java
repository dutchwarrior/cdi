package org.speranza.ex14pag43;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookService14 {

	@Inject
	@ThirteenDigits14
	private String title;
	
	private String description = "io sono leggenda";
	
	@Inject
	@ThirteenDigits14
	private Float price;
	private Book14 book;

	@Inject
	@ThirteenDigits14
	private NumberGenerator14 numberGenerator;

	public String createBook() {
		book = new Book14(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
	    return "datiLibro.xhtml";
	}
	
	public Book14 getBook() {
		return book;
	}
}
