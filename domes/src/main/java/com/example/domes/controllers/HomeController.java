package com.example.domes.controllers;

import com.example.domes.beans.Client;
import com.example.domes.beans.Products;
import com.example.domes.beans.User;
import com.example.domes.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ServiceProduct serviceProduct;

    @GetMapping("/home")
    public String goHome(Model model){
        System.out.println("page home");
        //choisir les animaux en facade
        List<Products> listeProduits = serviceProduct.homeCarousel();
        model.addAttribute("ListeCarousel",listeProduits);
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
