import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        
    }
}
