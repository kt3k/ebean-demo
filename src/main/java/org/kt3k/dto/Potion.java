package org.kt3k.dto;

import javax.persistence.*;
import com.avaje.ebean.Model;

@Entity
@Table(name="potions")
public class Potion extends Model {

    //public static final Finder<Long, Potion> find = new Finder<Long, Potion>(Long.class, Potion.class);

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
