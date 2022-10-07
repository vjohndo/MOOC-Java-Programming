/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author johndo
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.Collection;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try (Scanner reader = new Scanner (new File(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
        return true;
    }
    
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void delete(String word) {
        String translation = this.dictionary.get(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            
            HashMap<String, String> singleTranslations = new HashMap<>();
            Collection<String> keys = this.dictionary.keySet();
            
            for (String key : keys) {
                String translation = this.dictionary.get(key);
                if (singleTranslations.containsKey(key)) {
                    continue;
                }
                if (singleTranslations.containsKey(translation)) {
                    continue;
                }
                singleTranslations.put(key, translation);
                writer.println(key+":"+translation);
            }
            
            writer.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
        return true;
    }

}


