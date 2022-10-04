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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double max = this.history.get(0);
        for (Double status : this.history) {
            if (status > max) {
                max = status;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double min = this.history.get(0);
        for (Double status : this.history) {
            if (min > status) {
                min = status;
            }
        }
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        for (Double status : this.history) {
            total += status;
        }
        
        return total / this.history.size();
    }
}
