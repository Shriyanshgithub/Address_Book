package com.capgemini.address.book.spring.project.dto;

import com.capgemini.address.book.spring.project.model.AddressBookEntity;

public class AddressBookDtoMapper {
    public static AddressBookDto mapToAddressBookDto(AddressBookEntity addressBookEntity){
        return new AddressBookDto(addressBookEntity.getName(),addressBookEntity.getAddress(),addressBookEntity.getTittle());
    }

    public static AddressBookEntity mapToAddressBook(AddressBookDto addressBookDto){
        AddressBookEntity addressBookEntity = new AddressBookEntity();
        addressBookEntity.setAddress(addressBookDto.getAddress());
        addressBookEntity.setName(addressBookDto.getName());
        return addressBookEntity;
    }
}
