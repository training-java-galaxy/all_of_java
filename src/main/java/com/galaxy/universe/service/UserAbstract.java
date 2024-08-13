package com.galaxy.universe.service;

public abstract class UserAbstract {

    public abstract boolean validateEmail();

    // Method to encrypt the user's password before storing it
    public  String encryptPassword(String password){
        return "";
    }

    // Method to verify if the user's bank account information is valid
    public abstract boolean verifyBankAccount(String bankAccountNumber, String routingNumber);
}
