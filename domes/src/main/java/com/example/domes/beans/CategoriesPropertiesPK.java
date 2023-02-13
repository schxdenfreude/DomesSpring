package com.example.domes.beans;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable

public class CategoriesPropertiesPK implements Serializable {

    @OneToOne
    private Category category;

    @OneToOne
    private Properties properties;
}
