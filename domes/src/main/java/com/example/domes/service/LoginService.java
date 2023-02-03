package com.example.domes.service;
import com.example.domes.beans.User;
import com.example.domes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private UserRepository userRepository;

    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User verifyLogin(User user){
        return userRepository.loginVerif(user.getLoginUser(),user.getPasswordUser());
    }
}
