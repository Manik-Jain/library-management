package com.preeti.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issue")
public class IssueBooks {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date issueDate;
	private Long bookId;
	private Long userId;
	private int issued;
	private Date returnDate;
	private Date actualReturnDate;
	
	public Date getActualReturnDate() {
		return actualReturnDate;
	}
	public void setActualReturnDate(Date actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getIssued() {
		return issued;
	}
	public void setIssued(int issued) {
		this.issued = issued;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
