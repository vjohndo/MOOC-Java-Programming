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

public class BirdRegister {
    public ArrayList<Bird> birds;
    
    public BirdRegister() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String birdName, String latinName) {
        this.birds.add(new Bird(birdName, latinName));
    }
    
    public boolean observation(String name) {
        Bird bird = findBird(name);
        if (bird == null) {
            return false;
        }
        
        bird.observe();
        return true;
    }
    
    public Bird findBird(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name) || bird.getLatinName().equals(name)) {
                return bird;
            }
        }
        
        return null;
    }
    
    
    
    @Override
    public String toString() {
        String toReturn = "";
        for (int i = 0; i < this.birds.size(); i++) {
            toReturn += this.birds.get(i);
            if (i < this.birds.size() - 1) {
                toReturn += "\n";
            }
        }
        
        return toReturn;
    }
}
