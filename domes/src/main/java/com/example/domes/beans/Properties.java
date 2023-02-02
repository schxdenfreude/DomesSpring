package com.example.domes.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_property;
    private String property_name;

}
