package com.example.domes.beans;

import org.hibernate.mapping.Property;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Category_properties {


    @Embeddable
    public class PropertyId implements Serializable {

        private int id_category;
        private int id_property;
    }
    @EmbeddedId
    @OneToOne
    private Property property;
}
