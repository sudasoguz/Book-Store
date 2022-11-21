package com.oguz.bookstore.bookstore.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address extends BaseEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "address_id")
  private long addressId;

  @Column(name = "country")
  private String counrty;

  @Column(name = "city")
  private String city;

  @Column(name = "address_line1")
  private String addressLine1;

  @Column(name = "address_line2")
  private String addressLine2;

  @Column(name = "address_line3")
  private String addressLine3;

  @Column(name = "address_line4")
  private String addressLine4;

  @Column(name = "address_line5")
  private String addressLine5;

  @Column(name = "delivery_instructions")
  private String deliveryInstructions;

  @Column(name = "flat_number")
  private String flatNumber;

  @Column(name = "entrance")
  private String entrance;

  @Column(name = "zip_code")
  private String zipCode;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  @JsonIgnore
  private Customer customer;

  public Address() {
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }

  public String getCounrty() {
    return counrty;
  }

  public void setCounrty(String counrty) {
    this.counrty = counrty;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }

  public String getAddressLine5() {
    return addressLine5;
  }

  public void setAddressLine5(String addressLine5) {
    this.addressLine5 = addressLine5;
  }

  public String getDeliveryInstructions() {
    return deliveryInstructions;
  }

  public void setDeliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
  }

  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }

  public String getEntrance() {
    return entrance;
  }

  public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return addressId == address.addressId && Objects.equal(counrty, address.counrty) && Objects.equal(city, address.city) && Objects.equal(addressLine1, address.addressLine1) && Objects.equal(addressLine2, address.addressLine2) && Objects.equal(addressLine3, address.addressLine3) && Objects.equal(addressLine4, address.addressLine4) && Objects.equal(addressLine5, address.addressLine5) && Objects.equal(deliveryInstructions, address.deliveryInstructions) && Objects.equal(flatNumber, address.flatNumber) && Objects.equal(entrance, address.entrance) && Objects.equal(zipCode, address.zipCode) && Objects.equal(customer, address.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(addressId, counrty, city, addressLine1, addressLine2, addressLine3, addressLine4, addressLine5, deliveryInstructions, flatNumber, entrance, zipCode, customer);
  }
}
