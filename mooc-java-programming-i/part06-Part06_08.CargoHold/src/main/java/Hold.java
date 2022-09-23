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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> contents;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.contents = new ArrayList<>();
    }
    
    public int getWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase: contents) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.getWeight() + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }
        
        contents.add(suitcase);
    }
    
    public void printItems() {
        for (Suitcase suitcase: contents) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        if (this.contents.size() == 1) {
            return "1 suitcase (" + this.getWeight() + ")";
        }
        
        return this.contents.size() + " suitcases (" + this.getWeight() + " kg)";
    }
}
