package com.oguz.bookstore.bookstore.mapper;

import com.oguz.bookstore.bookstore.dto.CustomerOrderItemDto;
import com.oguz.bookstore.bookstore.entitiy.CustomerOrderItem;
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
    uses = {BookMapper.class}
)
public interface CustomerOrderItemMapper {

  CustomerOrderItemMapper INSTANCE = Mappers.getMapper(CustomerOrderItemMapper.class);

  CustomerOrderItemDto customerOrderItemToCustomerOrderItemDto(CustomerOrderItem customerOrderItem);

  List<CustomerOrderItemDto> customerOrderItemListToCustomerOrderItemDtoList(List<CustomerOrderItem> customerOrderItemList);
}
