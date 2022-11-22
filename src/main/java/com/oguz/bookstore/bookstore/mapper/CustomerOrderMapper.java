package com.oguz.bookstore.bookstore.mapper;

import com.oguz.bookstore.bookstore.dto.CustomerOrderDto;
import com.oguz.bookstore.bookstore.entitiy.CustomerOrder;
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
    uses = {AddressMapper.class, CustomerOrderItemMapper.class}
)
public interface CustomerOrderMapper {

  CustomerOrderMapper INSTANCE = Mappers.getMapper(CustomerOrderMapper.class);

  CustomerOrderDto customerOrderToCustomerOrderDto(CustomerOrder customerOrder);

  List<CustomerOrderDto> customerOrderListToCustomerOrderDtoList(List<CustomerOrder> customerOrderList);
}
