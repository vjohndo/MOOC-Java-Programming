/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Result {
    
    private String sex;
    private String country;
    private int year;
    private double literacyRate;
    
    public Result(String sex, String country, int year, double literacyRate) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }
    
    public String getSex() {
        return this.sex;
    } 
    
    public String getCountry() {
        return this.country;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public double getLiteracyRate() {
        return this.literacyRate;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyRate;
    }
    
}
