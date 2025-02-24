package com.capgemini.address.book.spring.project.service;

import com.capgemini.address.book.spring.project.dto.AddressBookDto;
import com.capgemini.address.book.spring.project.model.AddressBookEntity;

public interface IAddressBookService {
    AddressBookDto addressBook(AddressBookEntity addressBookEntity);
    AddressBookDto getAddressBook(Long id);
    AddressBookDto updateAddressBook(AddressBookEntity addressBookEntity);
    boolean deleteAddressBook(Long id);
}
