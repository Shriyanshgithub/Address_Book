package com.capgemini.address.book.spring.project.controller;

import com.capgemini.address.book.spring.project.dto.AddressBookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressBookController {

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBookDto> getAddress(@PathVariable("id") long id){

    }

    @PostMapping("/create")
    public ResponseEntity<AddressBookDto> createAddress(@RequestBody AddressBook addressBookDto){

    }

    @PutMapping("/update")
    public ResponseEntity<AddressBookDto> updateAddress(@RequestBody AddressBook addressBookDto){

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteAddress(@PathVariable("id") long id){

    }

}
