package com.recipe.repositories;

import com.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by e063709 on 1/30/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
