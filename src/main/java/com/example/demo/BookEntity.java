package com.example.demo;

public class BookEntity {
	
	private long id;
	private String nameOfBook;
	private String nameOfAuthor;
	public BookEntity(long id, String nameOfBook, String nameOfAuthor) {
		super();
		this.id = id;
		this.nameOfBook = nameOfBook;
		this.nameOfAuthor = nameOfAuthor;
	}
	public long getId() {
		return id;
	}
	public String getNameOfBook() {
		return nameOfBook;
	}
	public String getNameOfAuthor() {
		return nameOfAuthor;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}
	
	

}
