package com.capgemini.address.book.spring.project.repository;

import com.capgemini.address.book.spring.project.model.AddressBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookEntity,Long> {
}
