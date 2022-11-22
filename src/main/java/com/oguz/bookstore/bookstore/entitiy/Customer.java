package com.oguz.bookstore.bookstore.entitiy;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_id")
  private long customerId;

  @Column(name = "customer_name")
  private String customerName;

  @Column(name = "customer_surname")
  private String customerSurname;

  @Column(name = "email")
  private String email;

  @Column(name = "phone_country_code")
  private String phoneCountryCode;

  @Column(name = "phone_number")
  private String phoneNumber;

  @OneToMany(mappedBy = "customer", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  private List<Address> addressList;

  public Customer() {
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Customer customer = (Customer) o;
    return customerId == customer.customerId && Objects.equal(customerName, customer.customerName) && Objects.equal(customerSurname, customer.customerSurname) && Objects.equal(email, customer.email) && Objects.equal(phoneCountryCode, customer.phoneCountryCode) && Objects.equal(phoneNumber, customer.phoneNumber) && Objects.equal(addressList, customer.addressList);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(customerId, customerName, customerSurname, email, phoneCountryCode, phoneNumber, addressList);
  }
}
