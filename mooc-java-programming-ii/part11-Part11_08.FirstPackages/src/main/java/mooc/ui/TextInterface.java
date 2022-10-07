/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.ui;

import mooc.ui.UserInterface;

/**
 *
 * @author johndo
 */
public class TextInterface implements UserInterface {
    
    @Override
    public void update() {
        System.out.println("Updating UI");
    }
}
