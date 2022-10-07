/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author johndo
 */
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int times) {
        while (times > 0) {
            System.out.println("Application logic is working");
            times--;
            this.ui.update();
        }
        
        
    }
}
