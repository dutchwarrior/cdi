package org.speranza.ex24pag55Event;

import java.util.Date;

public class Book24 {

	private String title;
	private Float price;
	private String isbn;
	private String description;
	private Date instactationDate;
	

	public Book24() {
	}

	public Book24(String title, Float price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInstactationDate() {
		return instactationDate;
	}

	public void setInstactationDate(Date instactationDate) {
		this.instactationDate = instactationDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Book01");
		sb.append(", title='").append(title).append('\'');
		sb.append(", price=").append(price);
		sb.append(", description='").append(description).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public void setInstanciationDate(Date instaciationDate) {
		// TODO Auto-generated method stub
		
	}
}
