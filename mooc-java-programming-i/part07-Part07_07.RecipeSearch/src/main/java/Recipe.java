/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int prepTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int prepTime) {
        this.name = name;
        this.prepTime = prepTime;
        this.ingredients = new ArrayList<>();
    }
    
    public boolean nameContains(String name) {
        return this.name.contains(name);
    }
    
    public boolean isShorterThan(int maxCookingTime) {
        return this.prepTime <= maxCookingTime;
    }
    
    public boolean ingredientContains(String ingredient) {
        return this.ingredients.contains(ingredient);
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.prepTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override 
    public String toString() {
        return this.name + ", cooking time: " + this.prepTime;
    }
}
