package com.microservice.book.bookservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	private int bookId;

	@Column(name = "bookName")
	private String BookName;

	@Column(name = "studentId")
	private int studentId;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}
