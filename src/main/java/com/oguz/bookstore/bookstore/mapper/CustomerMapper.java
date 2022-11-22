package com.oguz.bookstore.bookstore.mapper;

import com.oguz.bookstore.bookstore.dto.CustomerDto;
import com.oguz.bookstore.bookstore.entitiy.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    uses = {AddressMapper.class}
)
public interface CustomerMapper {

  CustomerMapper ISNTANCE = Mappers.getMapper(CustomerMapper.class);

  CustomerDto customerToCustomerDto(Customer customer);

  List<Customer> customerListToCustomerDtoList(List<CustomerDto> customerDtoList);

  Customer customerDtoToCustomer(CustomerDto customerDto);

  List<Customer> customerDtoListToCustomerList(List<CustomerDto> customerDtoList);
}
