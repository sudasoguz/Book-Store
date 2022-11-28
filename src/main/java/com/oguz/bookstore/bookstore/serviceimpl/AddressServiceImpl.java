package com.oguz.bookstore.bookstore.serviceimpl;

import com.oguz.bookstore.bookstore.dto.AddressDto;
import com.oguz.bookstore.bookstore.entitiy.Address;
import com.oguz.bookstore.bookstore.mapper.AddressMapper;
import com.oguz.bookstore.bookstore.repository.AddressRepository;
import com.oguz.bookstore.bookstore.service.IAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

  private final AddressRepository addressRepository;

  public AddressServiceImpl(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }

  @Override
  public Address inquireAddressByAdressId(Long addressId) {
    return this.addressRepository.findByAddressId(addressId);
  }

  @Override
  public List<Address> inquireAllAddresses() {
    return this.addressRepository.findAll();
  }

  @Override
  public List<Address> inquireAddressListByCustomerId(Long customerId) {
    return this.addressRepository.findByCustomer_CustomerId(customerId);
  }

  @Override
  public AddressDto inquireAddressDtoByAddressId(Long addressId) {
    Address address = this.inquireAddressByAdressId(addressId);
    return AddressMapper.INSTANCE.addressToAddressDto(address);
  }

  @Override
  public List<AddressDto> inquireAddressDtosByCustomerId(Long customerId) {
    List<Address> addresses = this.inquireAddressListByCustomerId(customerId);
    return AddressMapper.INSTANCE.addressListToAddressDtoList(addresses);
  }

  @Override
  public Address updateAddress(Address address) {
    return this.addressRepository.save(address);
  }

  @Override
  public void createAddress(Address address) {
    this.addressRepository.save(address);
  }

  @Override
  public void deleteAddress(Address address) {
    this.addressRepository.delete(address);
  }

  @Override
  public void deleteAddressByAddressId(Long addressId) {
    this.addressRepository.deleteById(addressId);
  }
}
