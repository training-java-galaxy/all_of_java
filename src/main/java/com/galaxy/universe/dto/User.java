package com.galaxy.universe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private LocalDate dateOfBirth;
    private String address;
    private String socialSecurityNumber;
    private String bankAccountNumber;
}