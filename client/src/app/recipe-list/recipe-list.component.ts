import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
 
import { RecipeService } from '../recipe.service';
import { Recipe } from '../recipe';
 
@Component({
  selector: 'recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {

  recipes: Observable < Recipe[] > ;

  constructor(private recipeService: RecipeService) {}

  ngOnInit() {
    this.reloadData();
  }

  deleteRecipes() {
    this.recipeService.deleteAll()
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log('ERROR: ' + error));
  }

  reloadData() {
    this.recipes = this.recipeService.getRecipesList();
  }
}
