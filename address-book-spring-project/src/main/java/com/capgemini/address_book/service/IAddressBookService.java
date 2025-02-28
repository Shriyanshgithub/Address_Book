package com.capgemini.address_book.service;

import com.capgemini.address_book.dto.AddressBookDto;
import com.capgemini.address_book.model.AddressBookEntity;

public interface IAddressBookService {
    AddressBookDto addressBook(AddressBookEntity addressBookEntity);
    AddressBookDto getAddressBook(Long id);
    AddressBookDto updateAddressBook(AddressBookEntity addressBookEntity);
    boolean deleteAddressBook(Long id);
}
