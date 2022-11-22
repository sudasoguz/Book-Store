package com.oguz.bookstore.bookstore.dto;

import com.google.common.base.Objects;
import com.oguz.bookstore.bookstore.entitiy.Address;

import java.util.Date;
import java.util.List;

public class CustomerDto {

  private long customerId;
  private String customerName;
  private String customerSurname;
  private String email;
  private String phoneCountryCode;
  private String phoneNumber;
  private List<Address> addressList;
  private Date createdDate;
  private String createdBy;

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerSurname() {
    return customerSurname;
  }

  public void setCustomerSurname(String customerSurname) {
    this.customerSurname = customerSurname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneCountryCode() {
    return phoneCountryCode;
  }

  public void setPhoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
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
    CustomerDto that = (CustomerDto) o;
    return customerId == that.customerId && Objects.equal(customerName, that.customerName) && Objects.equal(customerSurname, that.customerSurname) && Objects.equal(email, that.email) && Objects.equal(phoneCountryCode, that.phoneCountryCode) && Objects.equal(phoneNumber, that.phoneNumber) && Objects.equal(addressList, that.addressList) && Objects.equal(createdDate, that.createdDate) && Objects.equal(createdBy, that.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerId, customerName, customerSurname, email, phoneCountryCode, phoneNumber, addressList, createdDate, createdBy);
  }
}
