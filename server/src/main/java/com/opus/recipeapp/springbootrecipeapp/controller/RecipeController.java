package com.opus.recipeapp.springbootrecipeapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opus.recipeapp.springbootrecipeapp.model.Ingredients;
import com.opus.recipeapp.springbootrecipeapp.model.Recipe;
import com.opus.recipeapp.springbootrecipeapp.repository.IngredientsRepository;
import com.opus.recipeapp.springbootrecipeapp.repository.RecipeRepository;
 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RecipeController {
 
  @Autowired
  RecipeRepository recipeRepository;
  
  @Autowired
  IngredientsRepository ingredientsRepository;
  
  //Retorna ingredientes em ordem alfabetica
  @GetMapping(value="/ingredients")
  public List<Ingredients> getIngrendientsOrderByName() {
    return (List<Ingredients>) ingredientsRepository.findAllByOrderByName();
  }
  
  //Retorna ingredientes por id de receita
  @GetMapping("/ingredients/recipes/{id}")
  public List<Recipe> getIngredientsByRecipeId(@PathVariable(value = "id") long id){
	  return (List<Recipe>) recipeRepository.findIngredientsById(id);
  }	
 
  //Retorna todas as receitas
  @GetMapping("/recipes")
  public List<Recipe> getAllRecipes() {
    return (List<Recipe>) recipeRepository.findAll();
  }
 
  //Retorna receita por id
  @GetMapping("/recipes/{id}")
  public Optional<Recipe> getRecipeById(@PathVariable(value = "id") long id){
	return recipeRepository.findById(id);
  }
  
  //Retorna receitas que contenham id de ingrediente
  @GetMapping("/recipes/ingredients/{id}")
  public List<Recipe> getRecipeByIngredientsId(@PathVariable(value = "id") long id){
	return recipeRepository.findByIngredientsId(id);
  }
  
  //Recebe receita e salva
  @PostMapping(value = "/recipes/create")
  public Recipe postRecipe(@RequestBody Recipe recipe) {
    Recipe _recipe = recipeRepository.save(new Recipe(recipe.getName(), recipe.getServings(), recipe.getCalories(), recipe.getIngredients(), recipe.getHowTo()));
    return _recipe;
  }
 
  //Deleta receita por id
  @DeleteMapping("/recipes/{id}")
  public ResponseEntity<String> deleteRecipe(@PathVariable("id") long id) {
    recipeRepository.deleteById(id);
    return new ResponseEntity<>("Recipe has been deleted!", HttpStatus.OK);
  }
 
  //Deleta todas as receitas
  @DeleteMapping("/recipes/delete")
  public ResponseEntity<String> deleteAllRecipes() {
    recipeRepository.deleteAll();
    return new ResponseEntity<>("All recipes have been deleted!", HttpStatus.OK);
  }
  //Atualiza receita por id
  @PutMapping("/recipes/{id}")
  public ResponseEntity<Recipe> updateRecipe(@PathVariable("id") long id, @RequestBody Recipe recipe) {
    Optional<Recipe> recipeData = recipeRepository.findById(id);
    
    if (recipeData.isPresent()) {
      Recipe _recipe = recipeData.get();
      _recipe.setName(recipe.getName());
      _recipe.setServings(recipe.getServings());
      _recipe.setCalories(recipe.getCalories());
      _recipe.setIngredients(recipe.getIngredients());
      _recipe.setHowTo(recipe.getHowTo());
      return new ResponseEntity<>(recipeRepository.save(_recipe), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
