package org.speranza.ex03pag30;

public class Book03 {

	private String title;
	private Float price;
	private String description;
	private String isbn;

	public Book03() {
	}

	public Book03(String title, Float price, String description) {
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Book02");
		sb.append(", title='").append(title).append('\'');
		sb.append(", price=").append(price);
		sb.append(", description='").append(description).append('\'');
		sb.append(", isbn='").append(isbn).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
