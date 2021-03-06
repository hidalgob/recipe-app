import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IngredientsListComponent } from './ingredients-list/ingredients-list.component';
import { RecipeListComponent } from './recipe-list/recipe-list.component';
import { CreateRecipeComponent } from './create-recipe/create-recipe.component';

 
const routes: Routes = [
    { path: '', redirectTo: 'recipe', pathMatch: 'full' },
    { path: 'ingredients', component: IngredientsListComponent },
    { path: 'recipe', component: RecipeListComponent },
    { path: 'add', component: CreateRecipeComponent },
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {}
