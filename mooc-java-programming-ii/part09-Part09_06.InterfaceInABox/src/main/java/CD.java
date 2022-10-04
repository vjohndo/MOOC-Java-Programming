/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class CD implements Packable {
    private String artist;
    private String title;
    private int publicationYear;
    
    public CD(String artist, String title, int publicationYear) {
        this.artist = artist;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publicationYear + ")";
    }
    
}
