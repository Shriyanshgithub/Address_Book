package com.capgemini.address.book.spring.project.controller;

import com.capgemini.address.book.spring.project.dto.AddressBookDto;
import com.capgemini.address.book.spring.project.model.AddressBookEntity;
import com.capgemini.address.book.spring.project.service.impl.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBookDto> getAddress(@PathVariable("id") long id){
        return new ResponseEntity<>(addressBookService.getAddressBook(id),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<AddressBookDto> createAddress(@RequestBody AddressBookEntity addressBookEntity){
        return new ResponseEntity<>(addressBookService.addressBook(addressBookEntity),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<AddressBookDto> updateAddress(@RequestBody AddressBookEntity addressBookEntity){
        return new ResponseEntity<>(addressBookService.updateAddressBook(addressBookEntity),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAddress(@PathVariable("id") long id){
        return new ResponseEntity<>(addressBookService.deleteAddressBook(id),HttpStatus.OK);
    }

}
