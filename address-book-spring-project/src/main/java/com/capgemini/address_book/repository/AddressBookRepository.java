package com.capgemini.address_book.repository;

import com.capgemini.address_book.model.AddressBookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookEntity,Long> {
}
