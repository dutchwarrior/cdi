package org.speranza.ex02pag30;

public class BookService02 {

	private NumberGenerator02 numberGenerator;
	
	public BookService02() {
		this.numberGenerator = new IsbnGenerator02();
	}
	
	public Book02 createBook(String title, Float price, String description) {
		
		Book02 book = new Book02(title, price, description);
		book.setIsbn(this.numberGenerator.generateNumber());
		return book;
	}
	
}
