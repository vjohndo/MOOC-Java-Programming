/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Book {
    private String title;
    private int minAge;
    
    public Book(String title, int minAge) {
        this.title = title;
        this.minAge = minAge;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAge() {
        return this.minAge;
    }
    
    public String toString() {
        return this.title + " (recommended for " + this.minAge + " year-olds or older)";
    }
    
}
