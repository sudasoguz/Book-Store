package com.oguz.bookstore.bookstore.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

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

    if (addressId != address.addressId) return false;
    if (!Objects.equals(counrty, address.counrty)) return false;
    if (!Objects.equals(city, address.city)) return false;
    if (!Objects.equals(addressLine1, address.addressLine1)) return false;
    if (!Objects.equals(addressLine2, address.addressLine2)) return false;
    if (!Objects.equals(addressLine3, address.addressLine3)) return false;
    if (!Objects.equals(addressLine4, address.addressLine4)) return false;
    if (!Objects.equals(addressLine5, address.addressLine5)) return false;
    if (!Objects.equals(deliveryInstructions, address.deliveryInstructions))
      return false;
    if (!Objects.equals(flatNumber, address.flatNumber)) return false;
    if (!Objects.equals(entrance, address.entrance)) return false;
    return Objects.equals(zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    int result = (int) (addressId ^ (addressId >>> 32));
    result = 31 * result + (counrty != null ? counrty.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
    result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
    result = 31 * result + (addressLine3 != null ? addressLine3.hashCode() : 0);
    result = 31 * result + (addressLine4 != null ? addressLine4.hashCode() : 0);
    result = 31 * result + (addressLine5 != null ? addressLine5.hashCode() : 0);
    result = 31 * result + (deliveryInstructions != null ? deliveryInstructions.hashCode() : 0);
    result = 31 * result + (flatNumber != null ? flatNumber.hashCode() : 0);
    result = 31 * result + (entrance != null ? entrance.hashCode() : 0);
    result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
    return result;
  }
}
