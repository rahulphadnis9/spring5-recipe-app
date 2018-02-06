package com.recipe.services;

import com.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by e063709 on 2/1/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
