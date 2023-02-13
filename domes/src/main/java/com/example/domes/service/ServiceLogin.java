package com.example.domes.service;

import com.example.domes.beans.Client;
import com.example.domes.beans.User;

public interface ServiceLogin {
    public User createClient(Client client);
    public User verifyLogin(User user);

}
