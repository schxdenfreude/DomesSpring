package com.example.domes.beans;

import org.hibernate.mapping.Property;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CategoryProperties {

@EmbeddedId
        private CategoriesPropertiesPK idCategory = new CategoriesPropertiesPK();
}
