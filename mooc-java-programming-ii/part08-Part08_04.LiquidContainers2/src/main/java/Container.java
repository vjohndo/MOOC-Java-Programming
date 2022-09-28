/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Container {
    private int amount;
    private int limit; 
    
    public Container() {
        this.amount = 0;
        this.limit = 100;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
        
        if (this.amount > this.limit) {
            this.amount = this.limit;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
        }
        
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public void moveTo(Container toContainer, int amount) {
        if (amount > this.amount) {
            amount = this.amount;
        }
        
        this.remove(amount);
        toContainer.add(amount);
    }
    
    @Override
    public String toString() {
        return this.amount + "/" + this.limit;
    }
    
}
