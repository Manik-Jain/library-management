package com.mj.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mj.librarymanagement.model.Book;
import com.mj.librarymanagement.input.RawBook;
import com.mj.librarymanagement.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@PostMapping("/book")
	public Book addBook(@RequestBody RawBook input) {
		Book book = new Book();
		book.setName(input.getName());
		book.setDescription(input.getDescription());
		book.setPublication(input.getPublication());
		book.setAuthor(input.getAuthor());
		
		System.out.println(book);
		return bookService.addBook(book);
	}
	
	@PutMapping("/book")
	public Book update(@RequestBody RawBook input) {
		Book book = bookService.getBook(input.getId());
		book.setName(input.getName());
		book.setDescription(input.getDescription());
		book.setPublication(input.getPublication());
		book.setAuthor(input.getAuthor());
		
		System.out.println(book);
		return bookService.update(book);
	}
	
	@DeleteMapping("/book/{id}")
	public List<Book> delete(@PathVariable Long id) {
		bookService.delete(id);
		return bookService.getAllBooks();
	}

}
