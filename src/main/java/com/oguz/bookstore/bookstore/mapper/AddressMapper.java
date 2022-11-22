package com.oguz.bookstore.bookstore.mapper;

import com.oguz.bookstore.bookstore.dto.AddressDto;
import com.oguz.bookstore.bookstore.entitiy.Address;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(
    componentModel = "spring",
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
public interface AddressMapper {

  AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

  AddressDto addressToAddressDto(Address address);

  List<AddressDto> addressListToAddressDtoList(List<Address> addressList);

  Address addressDtoToAddress(AddressDto addressDto);

  List<Address> addressDtoListToAddressList(List<AddressDto> addressDtos);
}
