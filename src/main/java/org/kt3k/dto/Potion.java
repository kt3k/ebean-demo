package org.kt3k.dto;

import javax.persistence.*;

@Entity
@Table(name="potions")
public class Potion extends com.avaje.ebean.Model {

    @Id
    Long id;

    @Column
    String color;

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
