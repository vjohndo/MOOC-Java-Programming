
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        addRecipesToArrayList(file, recipes);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("");
        
        
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
            }
            
            // No point creating new methods to return a new list
            // just go ahead and print the list as you perform a check
            // use the recipe method in order to print out
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchTerm = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.nameContains(searchTerm)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());

                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.isShorterThan(maxCookingTime)) {
                        System.out.println(recipe);
                    }

                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchIngredient = scanner.nextLine();

                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.ingredientContains(searchIngredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
    
    public static void addRecipesToArrayList(String file, ArrayList<Recipe> recipes) {
        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {

                String name = reader.nextLine();
                int duration = Integer.valueOf(reader.nextLine());
                Recipe recipe = new Recipe(name, duration);
                
                
                // no point having true && reader.hadNextLine()
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    recipe.addIngredient(ingredient);
                }

                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
