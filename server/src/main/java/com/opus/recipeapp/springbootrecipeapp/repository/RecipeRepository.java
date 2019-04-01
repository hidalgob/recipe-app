package com.opus.recipeapp.springbootrecipeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.opus.recipeapp.springbootrecipeapp.model.Recipe;

@CrossOrigin(origins = "http://localhost:4200")
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
  List<Recipe> findByName(String name);
  List<Recipe> findByIngredientsId(long id);
  
  @Query("select recipe.ingredients from Recipe recipe")
  Iterable<Recipe> findIngredientsById(long id);
}