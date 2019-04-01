import { Ingredients } from "./ingredients";

export class Recipe {
  id: number;
  name: string;
  servings: number;
  calories: number;
  ingredients: Ingredients[];
  howTo: string;
}
