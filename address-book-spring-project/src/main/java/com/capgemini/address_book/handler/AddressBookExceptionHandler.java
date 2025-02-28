package com.capgemini.address_book.handler;

import com.capgemini.address_book.controller.AddressBookController;
import com.capgemini.address_book.exception.AddressBookAlreadyExitsException;
import com.capgemini.address_book.exception.AddressBookNotFoundException;
import com.capgemini.address_book.exception.InvalidRequestBodyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = {AddressBookController.class})
@Slf4j
public class AddressBookExceptionHandler {

    @ExceptionHandler(InvalidRequestBodyException.class)
    public ResponseEntity<Object> handleInvalidRequestBodyException(InvalidRequestBodyException exception){
        log.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

    @ExceptionHandler(AddressBookAlreadyExitsException.class)
    public ResponseEntity<Object> handleAddressBookAlreadyExitsException(AddressBookAlreadyExitsException e){
        log.error("Book already exits");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(AddressBookNotFoundException.class)
    public ResponseEntity<Object> handleAddressBookNotFoundException(AddressBookNotFoundException e){
        log.error("invalid validation");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
