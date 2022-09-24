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
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                todoList.add(task);
                continue;
            }
            
            if (command.equals("list")) {
                this.todoList.print();
                continue;
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int numToRemove = Integer.valueOf(this.scanner.nextLine());
                todoList.remove(numToRemove);
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
}
