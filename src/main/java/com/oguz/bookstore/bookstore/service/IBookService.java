package com.oguz.bookstore.bookstore.service;

import com.oguz.bookstore.bookstore.entitiy.Book;

import java.util.List;

public interface IBookService {

  List<Book> inquireAllBooks();

  Book inquireBookById(Long bookId);

  Book inquireBookByName(String bookName);

  Book updateBook(Book book);

  Book updateBookStockAmount(Long bookId, Long stockAmount);

  void createBook(Book book);

}
