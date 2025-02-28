package com.capgemini.address_book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String name;
    @NotNull
    @Min(value = 4,message = "minimum size of address is 4")
    @Max(value = 7, message = "maximum size of address is 7")
    private String address;
    @NotEmpty
    private String tittle;


}
