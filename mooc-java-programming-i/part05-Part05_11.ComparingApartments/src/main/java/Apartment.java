
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int price() {
        return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        // Notice that private are accessible by all methods from same class
        // This is how we can access compared.squares
        // You wouldn't be able to access compared squares in main as a counter e.g.
        return (this.squares > compared.squares);
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.price() > compared.price());
    }
}
