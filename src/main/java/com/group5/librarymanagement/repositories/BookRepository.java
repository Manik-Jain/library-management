package com.group5.librarymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group5.librarymanagement.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
