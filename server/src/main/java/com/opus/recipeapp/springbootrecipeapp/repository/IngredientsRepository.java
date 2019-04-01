package com.opus.recipeapp.springbootrecipeapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.opus.recipeapp.springbootrecipeapp.model.Ingredients;

@CrossOrigin(origins = "http://localhost:4200")
public interface IngredientsRepository extends CrudRepository<Ingredients, Long> {
	List<Ingredients> findAllByOrderByName();
}