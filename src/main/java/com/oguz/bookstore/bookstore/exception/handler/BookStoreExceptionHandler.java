package com.oguz.bookstore.bookstore.exception.handler;

import com.oguz.bookstore.bookstore.exception.UnexpectedInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookStoreExceptionHandler {

  @ExceptionHandler(value = UnexpectedInputException.class)
  public ResponseEntity<String> handleUnexpectedInputError(UnexpectedInputException exception) {
    return new ResponseEntity<>("Unexpected input from request.", HttpStatus.BAD_REQUEST);
  }
}
