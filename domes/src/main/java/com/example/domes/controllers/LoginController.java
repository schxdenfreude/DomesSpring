package com.example.domes.controllers;

import com.example.domes.beans.Client;
import com.example.domes.beans.User;
import com.example.domes.service.ServiceLogin;
import com.example.domes.service.ServiceLoginImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private ServiceLogin loginService;

    @PostMapping ("/loginUser")
    public String loginUser(@ModelAttribute("client") Client client, Model model){
        User localuser = new Client();
        localuser = loginService.verifyLogin(client);
        System.out.println(client.getPasswordUser());

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

    @PostMapping ("/registerUser")
    public String registerUser(@ModelAttribute("client")Client client,Model model){
        System.out.println(loginService.verifyLogin(client));
        if (loginService.verifyLogin(client)==null){
            loginService.createClient(client);
            return "index";
        }else
        return "login";
    }


    @ModelAttribute("user")
    public User getDefaultUser(){
        return new Client();
    }
}
