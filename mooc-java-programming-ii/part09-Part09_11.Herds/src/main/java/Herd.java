/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */

import java.util.List;
import java.util.ArrayList;


public class Herd implements Movable {
    private List<Movable> members;
    
    public Herd() {
        this.members = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.members.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.members) {
            movable.move(dx, dy);
        }
    }
    
    
    public String toString() {
        String toReturn = "";
        for (Object object : this.members) {
            toReturn += object.toString() + "\n";
        }
        return toReturn;
    }
}
