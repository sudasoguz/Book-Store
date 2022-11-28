package com.oguz.bookstore.bookstore.service;

import com.oguz.bookstore.bookstore.dto.AddressDto;
import com.oguz.bookstore.bookstore.entitiy.Address;

import java.util.List;

public interface IAddressService {

  Address inquireAddressByAdressId(Long addressId);

  List<Address> inquireAllAddresses();

  List<Address> inquireAddressListByCustomerId(Long customerId);

  AddressDto inquireAddressDtoByAddressId(Long addressId);

  List<AddressDto> inquireAddressDtosByCustomerId(Long customerId);

  Address updateAddress(Address address);

  void createAddress(Address address);

  void deleteAddress(Address address);

  void deleteAddressByAddressId(Long addressId);
}
