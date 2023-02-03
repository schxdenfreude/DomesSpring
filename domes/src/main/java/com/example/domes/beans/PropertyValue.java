package com.example.domes.beans;

import org.hibernate.mapping.Property;

import javax.persistence.*;
import java.util.List;

@Entity
public class PropertyValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idValue;
    private String propertyValue;
    @OneToMany
    private List<Properties> idProperty;

    public int getIdValue() {
        return idValue;
    }

    public void setIdValue(int idValue) {
        this.idValue = idValue;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public List<Properties> getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(List<Properties> idProperty) {
        this.idProperty = idProperty;
    }
}
