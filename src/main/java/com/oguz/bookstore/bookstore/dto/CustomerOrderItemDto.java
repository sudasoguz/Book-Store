package com.oguz.bookstore.bookstore.dto;

import com.google.common.base.Objects;
import com.oguz.bookstore.bookstore.entitiy.Book;

import java.util.Date;

public class CustomerOrderItemDto {

  private long customerOrderItemId;
  private Book book;
  private int quantity;
  private double totalPrice;
  private Date createdDate;

  public long getCustomerOrderItemId() {
    return customerOrderItemId;
  }

  public void setCustomerOrderItemId(long customerOrderItemId) {
    this.customerOrderItemId = customerOrderItemId;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
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
    CustomerOrderItemDto that = (CustomerOrderItemDto) o;
    return customerOrderItemId == that.customerOrderItemId && quantity == that.quantity && Double.compare(that.totalPrice, totalPrice) == 0 && Objects.equal(book, that.book) && Objects.equal(createdDate, that.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerOrderItemId, book, quantity, totalPrice, createdDate);
  }
}
