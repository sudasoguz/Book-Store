package com.oguz.bookstore.bookstore.mapper;

import com.oguz.bookstore.bookstore.dto.BookDto;
import com.oguz.bookstore.bookstore.entitiy.Book;
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
public interface BookMapper {

  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

  BookDto bookToBookDto(Book book);

  List<BookDto> bookListToBookDtoList(List<Book> bookList);

  BookDto bookDtoToBook(BookDto bookDto);

  List<Book> bookDtoListToBookList(List<Book> bookList);
}
