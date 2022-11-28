package com.oguz.bookstore.bookstore.serviceimpl;

import com.oguz.bookstore.bookstore.dto.BookDto;
import com.oguz.bookstore.bookstore.entitiy.Book;
import com.oguz.bookstore.bookstore.exception.UnexpectedInputException;
import com.oguz.bookstore.bookstore.mapper.BookMapper;
import com.oguz.bookstore.bookstore.repository.BookRepository;
import com.oguz.bookstore.bookstore.service.IBookService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements IBookService {

  private final BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> inquireAllBooks() {
    return this.bookRepository.findAll();
  }

  @Override
  public Book inquireBookById(Long bookId) {
    return this.bookRepository.findById(bookId).orElse(null);
  }

  @Override
  public Book inquireBookByName(String bookName) {
    return this.bookRepository.findByBookName(bookName);
  }

  @Override
  public Book updateBook(Book book) {
    return this.bookRepository.save(book);
  }

  @Override
  @Transactional
  public Book updateBookStockAmount(Long bookId, Long stockAmount) {
    this.validateStockAmount(stockAmount);
    Book book = this.inquireBookById(bookId);

    if (Objects.nonNull(book)) {
      book.setStockAmount(stockAmount);
      this.bookRepository.save(book);
    }

    return book;
  }

  @Override
  public void createBook(Book book) {
    this.bookRepository.save(book);
  }

  @Override
  public BookDto inquireBookDtoById(Long bookId) {
    Book book = this.inquireBookById(bookId);
    return BookMapper.INSTANCE.bookToBookDto(book);
  }

  @Override
  public List<BookDto> inquireAllBookDtos() {
    List<Book> bookList = this.inquireAllBooks();
    return BookMapper.INSTANCE.bookListToBookDtoList(bookList);
  }

  @Override
  public void deleteBookByBookId(Long bookId) {
    this.bookRepository.deleteById(bookId);
  }

  @Override
  public void deleteBook(Book book) {
    this.bookRepository.delete(book);
  }

  private void validateStockAmount(Long stockAmount) {
    if (Objects.isNull(stockAmount) || stockAmount <= 0) {
      throw new UnexpectedInputException();
    }
  }
}
