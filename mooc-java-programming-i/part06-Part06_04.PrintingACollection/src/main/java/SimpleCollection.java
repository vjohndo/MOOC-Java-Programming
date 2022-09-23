
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        
        if (elements.size() == 1) {
            return "The collection " + name + " has 1 element:\n" + this.elements.get(0); 
        }
        
        String elementsAsString = "";
        
        for (String element: elements) {
            elementsAsString += "\n" + element;
        }
        
        return "The collection " + name + " has " + elements.size() + " elements:" + elementsAsString;
    }
}
