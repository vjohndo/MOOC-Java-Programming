
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(28, 12, 2000);
        System.out.println(date);
        
        date.advance();
        System.out.println(date);
        
        date.advance();
        System.out.println(date);
        
        date.advance();
        System.out.println(date);
        
        date.advance(5);
        System.out.println(date);
    }
}
