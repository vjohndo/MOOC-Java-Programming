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

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person toReturn = this.people.get(0);
        
        for (Person person: people) {
            if (person.getHeight() < toReturn.getHeight()) {
                toReturn = person;
            }
        }
        
        return toReturn;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        
        this.people.remove(shortest);
        
        return shortest;
    }
}