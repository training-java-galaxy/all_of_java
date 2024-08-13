package com.galaxy.universe.service.impl;

import com.galaxy.universe.dto.User;
import com.galaxy.universe.service.UserAbstract;
import com.galaxy.universe.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  extends UserAbstract implements UserService{
    //TAREA implementar metodos (Usar la creatividad y los requisitos vistos en clase)
    //Agregar 2 mtodos a la interfaz e la clase abstracta uno sobreescrito y uno sobrecargado
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public boolean validateEmail() {
        return false;
    }

    @Override
    public boolean verifyBankAccount(String bankAccountNumber, String routingNumber) {
        return false;
    }
}