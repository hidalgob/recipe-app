import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CreateRecipeComponent } from './create-recipe/create-recipe.component';
import { RecipeDetailsComponent } from './recipe-details/recipe-details.component';
import { RecipeListComponent } from './recipe-list/recipe-list.component';
import { IngredientsListComponent } from './ingredients-list/ingredients-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateRecipeComponent,
    RecipeDetailsComponent,
    RecipeListComponent,
    IngredientsListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
