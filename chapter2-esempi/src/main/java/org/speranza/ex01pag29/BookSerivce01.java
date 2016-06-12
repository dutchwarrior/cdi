package org.speranza.ex01pag29;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Vetoed;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Vetoed
public class BookSerivce01 {

	@Inject
	private NumberGenerator01 numberGenerator01;
	
	@Inject
	private EntityManager entityManager;
	
	private Date instaciationDate;
	
	@PostConstruct
	private void initDate() {
		instaciationDate = new Date();
	}
	
	@Transactional
	public Book01 createBook(String title, Float price, String description) {
	    
		Book01 book = new Book01(title, price, description);
		book.setIsbn(numberGenerator01.generateNumber());
		book.setInstactationDate(instaciationDate);
		entityManager.persist(book);
	    return book;
	}
}
