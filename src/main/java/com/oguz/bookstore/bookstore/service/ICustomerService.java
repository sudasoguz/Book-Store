package com.oguz.bookstore.bookstore.service;

import com.oguz.bookstore.bookstore.dto.CustomerDto;
import com.oguz.bookstore.bookstore.entitiy.Customer;

import java.util.List;

public interface ICustomerService {

  void createCustomer(Customer customer);

  Customer updateCustomer(Customer customer);

  void deleteCustomer(Customer customer);

  void deleteCustomerById(Long customerId);

  Customer inquireCustomerById(Long customerId);

  List<Customer> inquireCustomerListByIds(List<Long> customerIdList);

  CustomerDto inquireCustomerDto(Customer customer);

  List<CustomerDto> inquireCustomerDtoList(List<Customer> customerList);
}
