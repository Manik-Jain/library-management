package com.mj.librarymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mj.librarymanagement.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
