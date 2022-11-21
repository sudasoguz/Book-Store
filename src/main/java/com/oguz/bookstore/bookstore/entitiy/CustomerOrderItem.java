package com.oguz.bookstore.bookstore.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

  @ManyToOne
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
}
