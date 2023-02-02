package com.example.domes.beans;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class property_value {
    private int idValue;
    private String propertyValue;
    @OneToMany
    private int idProperty;

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

    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }
}
