package com.capgemini.address_book.service.impl;

import com.capgemini.address_book.dto.AddressBookDto;
import com.capgemini.address_book.dto.AddressBookDtoMapper;
import com.capgemini.address_book.model.AddressBookEntity;
import com.capgemini.address_book.repository.AddressBookRepository;
import com.capgemini.address_book.service.IAddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"prod"})
@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    public AddressBookService(AddressBookRepository addressBookRepository){
        this.addressBookRepository= addressBookRepository;
    }
    
    @Override
    public AddressBookDto addressBook(AddressBookEntity addressBookEntity) {
        AddressBookEntity addAddressBook1 = addressBookRepository.save(addressBookEntity);
        return AddressBookDtoMapper.mapToAddressBookDto(addAddressBook1);
    }

    @Override
    public AddressBookDto getAddressBook(Long id) {
        AddressBookEntity getAddressBook = addressBookRepository.findById(id).orElseThrow ();
        return AddressBookDtoMapper.mapToAddressBookDto(getAddressBook);

    }

    @Override
    public AddressBookDto updateAddressBook(AddressBookEntity addressBookEntity) {
        AddressBookEntity updatedAddressBook = addressBookRepository.save(addressBookEntity);
        return AddressBookDtoMapper.mapToAddressBookDto(updatedAddressBook);
    }

    @Override
    public boolean deleteAddressBook(Long id) {
        addressBookRepository.deleteById(id);
        return true;
    }
}
