package com.mj.librarymanagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.librarymanagement.model.Book;
import com.mj.librarymanagement.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Book getBook(Long id) {
		return bookRepository.getOne(id);
	}
	
	public Book addBook(Book book) {
		book.setStatus("available");
		Book saved =  bookRepository.saveAndFlush(book);
		System.out.println(saved);
		return saved;
	}
	
	public Book update(Book book) {
		Book saved =  bookRepository.saveAndFlush(book);
		System.out.println(saved);
		return saved;
	}
	
	public void delete(Long id) {
		List<Long> ids = new ArrayList<>();
		ids.add(id);
		bookRepository.deleteAllByIdInBatch(ids);
	}
}
