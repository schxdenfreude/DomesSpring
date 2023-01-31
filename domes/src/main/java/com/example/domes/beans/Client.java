package com.example.domes.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user;

    private String first_name;

    private String last_name;

    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date creation_date;

    private String mail;

    private String address_client;

    private String city;

    private String city_code;
}
