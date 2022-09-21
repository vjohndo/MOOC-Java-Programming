
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-1);
        
        System.out.println("Printing numbers between 0 and 2");
        printNumbersInRange(numbers, 0, 2);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int num: numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
    
}
