package com.capgemini.address_book.controller;

import com.capgemini.address_book.dto.AddressBookDto;
import com.capgemini.address_book.exception.InvalidRequestBodyException;
import com.capgemini.address_book.model.AddressBookEntity;
import com.capgemini.address_book.service.impl.AddressBookService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBookDto> getAddress(@PathVariable("id") long id){
        if(id < 1){
            log.error("Invalid id: {}" , id);
            throw new IllegalArgumentException("Invalid id");
        }
        log.info("Get book from the database by id");
        return new ResponseEntity<>(addressBookService.getAddressBook(id),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<AddressBookDto> createAddress(@RequestBody @Valid AddressBookEntity addressBookEntity, BindingResult bindingResult){
        log.info("save the book details in database");
        if(bindingResult.hasErrors()){
            log.error("validation failed due to invalid post request");
            for(ObjectError error : bindingResult.getAllErrors()){
                log.warn(error.getDefaultMessage());
            }
            throw new InvalidRequestBodyException("Invalid request body");
        }
        return new ResponseEntity<>(addressBookService.addressBook(addressBookEntity),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<AddressBookDto> updateAddress(@RequestBody @Valid AddressBookEntity addressBookEntity,BindingResult bindingResult){
        log.trace("Trace the book in database and update it");
        if(bindingResult.hasErrors()){
            log.error("validation failed due to invalid put request");
            for(ObjectError error : bindingResult.getAllErrors()){
                log.warn(error.getDefaultMessage());
            }
            throw new InvalidRequestBodyException("Invalid request body");
        }
        return new ResponseEntity<>(addressBookService.updateAddressBook(addressBookEntity),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAddress(@PathVariable("id") long id){
        if(id < 1){
            log.error("invalid id : {}",id);
        }
        log.info("Delete book data from the database");
        return new ResponseEntity<>(addressBookService.deleteAddressBook(id),HttpStatus.OK);
    }

}
