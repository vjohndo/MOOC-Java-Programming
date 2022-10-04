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

public class Box implements Packable {
    private ArrayList<Packable> contents;
    private double maxCapacity;
    
    public Box(double maxCapacity) {
        this.contents = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable packable) {
        if (this.weight() + packable.weight() > this.maxCapacity) {
            return;
        }
        
        this.contents.add(packable);
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : this.contents) {
            weight += packable.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }
}

