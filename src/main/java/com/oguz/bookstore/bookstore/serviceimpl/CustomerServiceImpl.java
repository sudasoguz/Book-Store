package com.oguz.bookstore.bookstore.serviceimpl;

import com.oguz.bookstore.bookstore.dto.CustomerDto;
import com.oguz.bookstore.bookstore.entitiy.Customer;
import com.oguz.bookstore.bookstore.mapper.CustomerMapper;
import com.oguz.bookstore.bookstore.repository.CustomerRepository;
import com.oguz.bookstore.bookstore.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

  private final CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public void createCustomer(Customer customer) {
    customerRepository.save(customer);
  }

  @Override
  public Customer updateCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public void deleteCustomer(Customer customer) {
    customerRepository.delete(customer);
  }

  @Override
  public void deleteCustomerById(Long customerId) {
    customerRepository.deleteById(customerId);
  }

  @Override
  public Customer inquireCustomerById(Long customerId) {
    return customerRepository.findById(customerId).orElse(null);
  }

  @Override
  public List<Customer> inquireCustomerListByIds(List<Long> customerIdList) {
    return customerRepository.findAllById(customerIdList);
  }

  @Override
  public CustomerDto inquireCustomerDto(Customer customer) {
    return CustomerMapper.ISNTANCE.customerToCustomerDto(customer);
  }

  @Override
  public List<CustomerDto> inquireCustomerDtoList(List<Customer> customerList) {
    return CustomerMapper.ISNTANCE.customerListToCustomerDtoList(customerList);
  }
}
