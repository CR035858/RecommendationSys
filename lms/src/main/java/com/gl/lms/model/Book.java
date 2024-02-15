package com.gl.lms.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="bookName")
	String bookName;

	
	public Book() {
		super();
	}


	public Book(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + "]";
	}


	
	
	
}
