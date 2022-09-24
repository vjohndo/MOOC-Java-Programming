/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            
            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String search = this.scanner.nextLine();
                
                String translation = this.dictionary.translate(search);
                
                // Rememeber that a string object is just a reference
                // Check if the reference value is null
                if (translation == null) {
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                
                System.out.println("Translation: " + this.dictionary.translate(search));
                continue;
            }
            
            System.out.println("Unknown command");
        }

    }
}
