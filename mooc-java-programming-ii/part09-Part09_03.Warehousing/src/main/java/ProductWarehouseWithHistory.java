/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double toReturn = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return toReturn;
    }
    
    public String history() {
        return this.history + "";
    }
    
    public void printAnalysis() {
        System.out.println(
            "Product: " + this.getName() + "\n"+ 
            "History: " + this.history() + "\n" +
            "Largest amount of product: " + this.history.maxValue() + "\n"+ 
            "Smallest amount of product: " + this.history.minValue() + "\n"+ 
            "Average: " + this.history.average()
        );
    }
    
}
