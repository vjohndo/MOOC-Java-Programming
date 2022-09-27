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
    private GradeStatistics grades;
    
    public UserInterface(Scanner scanner, GradeStatistics grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        inputGrades();
        printAverage();
        printPassingAverage();
        printPassPercentage();
        printGradeDistribution();
    }
    
    public void inputGrades() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }
            
            this.grades.add(input);
        }
    }
    
    public void printAverage() {
        System.out.print("Point average (all): ");
        
        double result = this.grades.getAverage();
        
        String output = result + "";
        
        if (result == -1) {
            output = "-";
        }
        
        System.out.println(output);
    }
    
    public void printPassingAverage() {
        System.out.print("Point average (passing): ");
        
        double result = this.grades.getPassingAverage();
        
        String output = result + "";
       
        if (result == -1) {
            output = "-";
        }
        
        System.out.println(output);
    }
    
    public void printPassPercentage() {
        System.out.print("Pass percentage: ");
        System.out.println(this.grades.getPassPercentage());
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        this.grades.printGradeDistribution2();
    }
}
