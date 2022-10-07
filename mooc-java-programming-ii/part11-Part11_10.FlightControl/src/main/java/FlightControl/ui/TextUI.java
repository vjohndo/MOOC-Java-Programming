/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author johndo
 */

import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

public class TextUI {
    
    private FlightControl flightControl;
    private Scanner scanner;
    
    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
        
        
    }
    
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("--------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            
            System.out.print("> ");
            String input = this.scanner.nextLine();
            
            if (input.equals("1")) {
                printAirplanes();
                continue;
            }
            
            if (input.equals("2")) {
                printFlights();
                continue;
            }
            
            if (input.equals("3")) {
                printAirplaneDetails();
                continue;
            }
            
            if (input.equals("x")) {
                break;
            }
            
        }
    }
    
    private void printFlights() {
        this.flightControl.getFlights().stream()
                .forEach(flight -> System.out.println(flight));
    }
    
    private void printAirplanes() {
        this.flightControl.getAirplanes().stream()
                .forEach(plane -> System.out.println(plane));
    }
    
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        System.out.println(this.askForAirplane());
    }
    
    
    
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.print("> ");
            String input = this.scanner.nextLine();
            
            if (input.equals("1")) {
                addAirplane();
                continue;
            }
            
            if (input.equals("2")) {
                addFlight();
                continue;
            }
            
            if (input.equals("x")) {
                break;
            }
        }
    }
    
    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = this.scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(this.scanner.nextLine());
        
        this.flightControl.addAirplane(id, capacity);
    }
    
    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departure = this.scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String arrival = this.scanner.nextLine();
        
        // need the plane as an object
        this.flightControl.addFlight(plane, departure, arrival);
    }
    
    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = this.scanner.nextLine();
            airplane = flightControl.getAirplane(id);
            
            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }
        
        return airplane;
    }
    
}
