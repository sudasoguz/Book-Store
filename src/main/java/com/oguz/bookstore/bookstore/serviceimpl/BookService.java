package com.oguz.bookstore.bookstore.serviceimpl;

import com.oguz.bookstore.bookstore.entitiy.Book;
import com.oguz.bookstore.bookstore.service.IBookService;

import java.util.List;

public class BookService implements IBookService {


  @Override
  public List<Book> inquireAllBooks() {
    return null;
  }

  @Override
  public Book inquireBookById(Long bookId) {
    return null;
  }

  @Override
  public Book inquireBookByName(String bookName) {
    return null;
  }

  @Override
  public Book updateBook(Book book) {
    return null;
  }

  @Override
  public Book updateBookStockAmount(Long bookId, Long stockAmount) {
    return null;
  }

  @Override
  public void createBook(Book book) {

  }
}
