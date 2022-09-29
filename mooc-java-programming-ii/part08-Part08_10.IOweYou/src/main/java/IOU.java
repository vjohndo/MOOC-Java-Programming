/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> ious;
    
    public IOU() {
        this.ious = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        ious.put(sanitisedString(toWhom), amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return ious.getOrDefault(sanitisedString(toWhom), 0.0);
    }
    
    public static String sanitisedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.trim();
        string = string.toLowerCase();
        
        return string;
    }
}
