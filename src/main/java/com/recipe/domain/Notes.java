package com.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by E063709 on 1/29/2018.
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Notes() {

    }


}
