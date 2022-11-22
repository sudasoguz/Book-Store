package com.oguz.bookstore.bookstore.dto;

import com.google.common.base.Objects;

import java.util.Date;

public class AddressDto {

  private long addressId;
  private String counrty;
  private String city;
  private String addressLine1;
  private String addressLine2;
  private String addressLine3;
  private String addressLine4;
  private String addressLine5;
  private String addressDescription;
  private String deliveryInstructions;
  private String flatNumber;
  private String entrance;
  private String zipCode;
  private Date createdDate;
  private String createdBy;

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

  public String getAddressDescription() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder
        .append(addressLine1).append(" ")
        .append(addressLine2).append(" ")
        .append(addressLine3).append(" ")
        .append(addressLine4).append(" ")
        .append(addressLine5);
    return stringBuilder.toString();
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
    AddressDto that = (AddressDto) o;
    return addressId == that.addressId && Objects.equal(counrty, that.counrty) && Objects.equal(city, that.city) && Objects.equal(addressLine1, that.addressLine1) && Objects.equal(addressLine2, that.addressLine2) && Objects.equal(addressLine3, that.addressLine3) && Objects.equal(addressLine4, that.addressLine4) && Objects.equal(addressLine5, that.addressLine5) && Objects.equal(addressDescription, that.addressDescription) && Objects.equal(deliveryInstructions, that.deliveryInstructions) && Objects.equal(flatNumber, that.flatNumber) && Objects.equal(entrance, that.entrance) && Objects.equal(zipCode, that.zipCode) && Objects.equal(createdDate, that.createdDate) && Objects.equal(createdBy, that.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(addressId, counrty, city, addressLine1, addressLine2, addressLine3, addressLine4, addressLine5, addressDescription, deliveryInstructions, flatNumber, entrance, zipCode, createdDate, createdBy);
  }
}
