package com.oguz.bookstore.bookstore.dto;

import com.google.common.base.Objects;
import com.oguz.bookstore.bookstore.entitiy.Address;
import com.oguz.bookstore.bookstore.entitiy.CustomerOrderItem;

import java.util.Date;
import java.util.List;

public class CustomerOrderDto {

  private long customerOrderId;
  private Address billingAddress;
  private Address deliveryAddress;
  private List<CustomerOrderItem> customerOrderItem;
  private String orderStatus;
  private Date createdDate;
  private String createdBy;

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

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerOrderDto that = (CustomerOrderDto) o;
    return customerOrderId == that.customerOrderId && Objects.equal(billingAddress, that.billingAddress) && Objects.equal(deliveryAddress, that.deliveryAddress) && Objects.equal(customerOrderItem, that.customerOrderItem) && Objects.equal(orderStatus, that.orderStatus) && Objects.equal(createdDate, that.createdDate) && Objects.equal(createdBy, that.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerOrderId, billingAddress, deliveryAddress, customerOrderItem, orderStatus, createdDate, createdBy);
  }
}
