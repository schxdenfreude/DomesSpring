package com.example.domes.controllers;

import com.example.domes.beans.Client;
import com.example.domes.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("page home");
        return "index";
    }

    @GetMapping("/login")
    public String goLogin(){
        System.out.println("page login");
        return "login";
    }

    @ModelAttribute("client")
    public Client getDefaultClient(){
        return new Client();
    }
}
