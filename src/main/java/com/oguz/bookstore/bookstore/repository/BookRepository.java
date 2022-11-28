package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

  Book findByBookName(String name);
}
