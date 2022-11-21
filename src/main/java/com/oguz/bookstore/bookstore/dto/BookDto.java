package com.oguz.bookstore.bookstore.dto;

import com.google.common.base.Objects;

import java.util.Date;

public class BookDto {

  private long bookId;
  private String isbn;
  private String bookName;
  private String authorName;
  private int page;
  private double price;
  private long stockAmount;

  private Date createdDate;

  public BookDto() {
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

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BookDto bookDto = (BookDto) o;
    return bookId == bookDto.bookId && page == bookDto.page && Double.compare(bookDto.price, price) == 0 && stockAmount == bookDto.stockAmount && Objects.equal(isbn, bookDto.isbn) && Objects.equal(bookName, bookDto.bookName) && Objects.equal(authorName, bookDto.authorName) && Objects.equal(createdDate, bookDto.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(bookId, isbn, bookName, authorName, page, price, stockAmount, createdDate);
  }
}
