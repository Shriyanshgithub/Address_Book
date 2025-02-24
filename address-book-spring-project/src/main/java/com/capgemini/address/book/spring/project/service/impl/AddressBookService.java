package com.capgemini.address.book.spring.project.service.impl;

import com.capgemini.address.book.spring.project.dto.AddressBookDto;
import com.capgemini.address.book.spring.project.model.AddressBookEntity;
import com.capgemini.address.book.spring.project.service.IAddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

    
    @Override
    public AddressBookDto addressBook(AddressBookEntity addressBookEntity) {
        return null;
    }

    @Override
    public AddressBookDto getAddressBook(Long id) {
        return null;
    }

    @Override
    public AddressBookDto updateAddressBook(AddressBookEntity addressBookEntity) {
        return null;
    }

    @Override
    public boolean deleteAddressBook(Long id) {
        return false;
    }
}
