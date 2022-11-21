package com.oguz.bookstore.bookstore.entitiy;

import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book extends BaseEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  private long bookId;

  @Column(name = "isbn")
  private String isbn;

  @Column(name = "book_name")
  private String bookName;

  @Column(name = "author_name")
  private String authorName;

  @Column(name = "page")
  private int page;

  @Column(name = "price")
  private double price;

  @Column(name = "stock_amount")
  private long stockAmount;

  public Book() {
  }

  public Book(long bookId, String isbn, String bookName, String authorName, int page, double price, long stockAmount) {
    this.bookId = bookId;
    this.isbn = isbn;
    this.bookName = bookName;
    this.authorName = authorName;
    this.page = page;
    this.price = price;
    this.stockAmount = stockAmount;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public long getStockAmount() {
    return stockAmount;
  }

  public void setStockAmount(long stockAmount) {
    this.stockAmount = stockAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return bookId == book.bookId && page == book.page && Double.compare(book.price, price) == 0 && stockAmount == book.stockAmount && Objects.equal(isbn, book.isbn) && Objects.equal(bookName, book.bookName) && Objects.equal(authorName, book.authorName);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(bookId, isbn, bookName, authorName, page, price, stockAmount);
  }

  @Override
  public String toString() {
    return "Book{" +
        "bookId=" + bookId +
        ", isbn='" + isbn + '\'' +
        ", bookName='" + bookName + '\'' +
        ", authorName='" + authorName + '\'' +
        ", page=" + page +
        ", price=" + price +
        ", stockAmount=" + stockAmount +
        '}';
  }
}
