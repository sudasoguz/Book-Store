package com.oguz.bookstore.bookstore.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "customer_order_item")
public class CustomerOrderItem extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_order_item_id")
  private long customerOrderItemId;

  @OneToOne
  @JoinColumn(name = "book_id")
  private Book book;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "total_price")
  private double totalPrice;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_order_id")
  @JsonIgnore
  private CustomerOrder customerOrder;

  public CustomerOrderItem() {
  }

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

  public CustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(CustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerOrderItem that = (CustomerOrderItem) o;
    return customerOrderItemId == that.customerOrderItemId && quantity == that.quantity && Double.compare(that.totalPrice, totalPrice) == 0 && Objects.equal(book, that.book) && Objects.equal(customerOrder, that.customerOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerOrderItemId, book, quantity, totalPrice, customerOrder);
  }
}
