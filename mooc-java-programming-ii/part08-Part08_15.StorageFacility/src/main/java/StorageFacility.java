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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        // Should use contains. key could exist but have a null value
        if (!this.storage.containsKey(storageUnit)) {
            return;
        }
        
//        ArrayList<String> foundStorageUnit = this.storage.get(storageUnit);
//        
//        if (foundStorageUnit == null) {
//            return;
//        }
        
        this.storage.get(storageUnit).remove(item);
        
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> toReturn = new ArrayList<>();
        for (String storageUnit : this.storage.keySet()) {
            toReturn.add(storageUnit);
        }
        return toReturn;
    }
}
