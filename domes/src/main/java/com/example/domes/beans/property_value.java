package com.example.domes.beans;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class property_value {
    private int id_value;
    private String property_value;
    @OneToMany
    private int id_property;

}
