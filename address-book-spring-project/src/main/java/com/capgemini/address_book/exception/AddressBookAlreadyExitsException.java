package com.capgemini.address_book.exception;

public class AddressBookAlreadyExitsException extends RuntimeException{

    public AddressBookAlreadyExitsException(String message){
        super(message);
    }
}
