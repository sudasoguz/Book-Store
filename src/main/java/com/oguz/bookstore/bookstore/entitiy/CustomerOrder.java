package com.oguz.bookstore.bookstore.entitiy;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_order")
public class CustomerOrder extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_order_id")
  private long customerOrderId;

  @OneToOne
  @JoinColumn(name = "billing_address_id")
  private Address billingAddress;

  @OneToOne
  @JoinColumn(name = "delivery_address_id")
  private Address deliveryAddress;

  @OneToMany(mappedBy = "customerOrder", cascade = CascadeType.ALL)
  private List<CustomerOrderItem> customerOrderItem;

  @Column(name = "order_status")
  private String orderStatus;

  public CustomerOrder() {
  }

  public long getCustomerOrderId() {
    return customerOrderId;
  }

  public void setCustomerOrderId(long customerOrderId) {
    this.customerOrderId = customerOrderId;
  }

  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public List<CustomerOrderItem> getCustomerOrderItem() {
    return customerOrderItem;
  }

  public void setCustomerOrderItem(List<CustomerOrderItem> customerOrderItem) {
    this.customerOrderItem = customerOrderItem;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerOrder that = (CustomerOrder) o;
    return customerOrderId == that.customerOrderId && Objects.equal(billingAddress, that.billingAddress) && Objects.equal(deliveryAddress, that.deliveryAddress) && Objects.equal(customerOrderItem, that.customerOrderItem) && Objects.equal(orderStatus, that.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerOrderId, billingAddress, deliveryAddress, customerOrderItem, orderStatus);
  }
}
