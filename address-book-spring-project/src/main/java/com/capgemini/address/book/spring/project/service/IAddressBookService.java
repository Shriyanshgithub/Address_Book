package com.capgemini.address.book.spring.project.service;

import com.capgemini.address.book.spring.project.dto.AddressBookDto;

public interface IAddressBookService {
    AddressBookDto addressBook(AddressBookDto addressBookDto);
    AddressBookDto getAddressBook(Long id);
    AddressBookDto updateAddressBook(AddressBookDto addressBookDto);
    boolean deleteAddressBook(Long id);
}
