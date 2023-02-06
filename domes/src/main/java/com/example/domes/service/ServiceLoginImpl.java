package com.example.domes.service;

import com.example.domes.beans.Client;
import com.example.domes.beans.User;
import com.example.domes.repository.ClientRepository;
import com.example.domes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLoginImpl implements ServiceLogin{
    private UserRepository userRepository;
    private ClientRepository clientRepository;

    @Autowired
    public ServiceLoginImpl(UserRepository userRepository, ClientRepository clientRepository) {
        this.userRepository = userRepository;
        this.clientRepository = clientRepository;
    }


    public User verifyLogin(User user) {
        if (userRepository.loginVerif(user.getLoginUser(), user.getPasswordUser()) == null) {
            System.out.println("on est bien dans le if le user est null");
           return null;
        } else return userRepository.loginVerif(user.getLoginUser(), user.getPasswordUser());
    }

    public User createClient(Client client){
        Client newClient = client;
        clientRepository.save(newClient);
        System.out.println("on est dans la methode createClient de login service");

        return newClient;
    }
}
