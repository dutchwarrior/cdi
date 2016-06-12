package org.speranza.ex03pag30;

public class BookService03 {

	private NumberGenerator03 numberGenerator;
	
	public BookService03(NumberGenerator03 numberGenerator03) {
		this.numberGenerator = numberGenerator03;
	}
	
	public Book03 createBook(String title, Float price, String description) {
		
		Book03 book = new Book03(title, price, description);
		book.setIsbn(this.numberGenerator.generateNumber());
		return book;
	}
	
}
