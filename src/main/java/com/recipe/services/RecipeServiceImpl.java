package com.recipe.services;

import com.recipe.domain.Recipe;
import com.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Service;
import sun.print.resources.serviceui_zh_TW;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by e063709 on 2/1/2018.
 */
@Service
public class RecipeServiceImpl implements  RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
