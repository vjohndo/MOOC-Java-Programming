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

public class UserInterface {
    private Scanner scanner;
    private BirdRegister birds;
    
    public UserInterface(Scanner scanner, BirdRegister birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
                
            }
            
            if (command.equals("Add")) {
                addBird();
                continue;
            }
            
            if (command.equals("Observation")) {
                addObservation();
                continue;
            }
            
            if (command.equals("All")) {
                printAllBirds();
                continue;
            }
            
            if (command.equals("One")) {
                printOneBird();
                continue;
            }
            
            System.out.println("Unknown command!");
        }
    }
    
    // Dont want to interact with bird directly, should be going through the register
    public void addBird() {
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        this.birds.add(birdName, latinName);
    }
    
    // Dont want to interact with bird directly, should be going through the register
    public void addObservation() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        
        boolean wasSuccessful = birds.observation(birdName);

        if (wasSuccessful) {
            return;
        }
        
        System.out.println("Not a bird!");
    }
    
    public void printAllBirds() {
        System.out.println(birds);
    }
    
    
    public void printOneBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        
        Bird targetBird = this.birds.findBird(birdName);
        
        if (targetBird == null) {
            System.out.println("Not a bird!");
            return;
        }
        
        System.out.println(targetBird);
    }
}
