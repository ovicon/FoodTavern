package ro.ovidiuconeac.foodtavern.webapp.features.food.data.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@Entity(name = "cheese")
@Table(name = "cheeses")
public class CheeseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}