package com.example.domes.controllers;

import com.example.domes.beans.User;
import com.example.domes.repository.UserRepository;
import com.example.domes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping ("/loginUser")
    public String loginUser(@ModelAttribute("newuser") User user, Model model){
        User localuser = new User();
        localuser = loginService.verifyLogin(user);
        System.out.println(user.getPasswordUser());

        if(localuser == null){
            System.out.println("pzpzpz");
            model.addAttribute("message","Les informations de connexion sont erronées");
            return"login";
        }else {
            System.out.println("ayaya");
            model.addAttribute("message","l'utilisateur est connecté");
            return "index";
        }
    }


    @ModelAttribute("user")
    public User getDefaultUser(){
        return new User();
    }
}
