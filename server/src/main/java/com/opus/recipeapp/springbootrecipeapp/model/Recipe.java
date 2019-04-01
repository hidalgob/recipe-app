package com.opus.recipeapp.springbootrecipeapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "recipe")
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "servings")
    private int servings;
	
	@Column(name = "calories")
    private int calories;
	
	@ManyToMany
    private List<Ingredients> ingredients;
	
	@Column(name = "howTo")
    private String howTo;
    
	public Recipe() {
	}
	
	public Recipe(String name, int servings, int calories, List<Ingredients> ingredients, String howTo) {
		this.name = name;
		this.servings = servings;
		this.calories = calories;
		this.ingredients = ingredients;
		this.howTo = howTo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public List<Ingredients> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
	public String getHowTo() {
		return howTo;
	}
	public void setHowTo(String howTo) {
		this.howTo = howTo;
	}
}