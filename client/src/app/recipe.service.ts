import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  private baseUrl = 'http://localhost:8080/api/recipes';
  private baseUrlIngredients = 'http://localhost:8080/api/ingredients';

  constructor(private http: HttpClient) {}

  getRecipe(id: number): Observable < Object > {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createRecipe(recipe: Object): Observable < Object > {
    return this.http.post(`${this.baseUrl}` + `/create`, recipe);
  }

  updateRecipe(id: number, value: any): Observable < Object > {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteRecipe(id: number): Observable < any > {
    return this.http.delete(`${this.baseUrl}/${id}`, {
      responseType: 'text'
    });
  }

  getRecipesList(): Observable < any > {
    return this.http.get(`${this.baseUrl}`);
  }

  getIngredientsList(): Observable < any > {
    return this.http.get(`${this.baseUrlIngredients}`);
  }

  getRecipesByName(name: string): Observable < any > {
    return this.http.get(`${this.baseUrl}/name/${name}`);
  }

  deleteAll(): Observable < any > {
    return this.http.delete(`${this.baseUrl}` + `/delete`, {
      responseType: 'text'
    });
  }
}
