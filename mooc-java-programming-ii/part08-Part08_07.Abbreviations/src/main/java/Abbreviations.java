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

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(sanitizedString(abbreviation), explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(sanitizedString(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(sanitizedString(abbreviation));
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.replace(".","");
        string = string.toLowerCase();
        string = string.trim();
        return string;
    }
}
