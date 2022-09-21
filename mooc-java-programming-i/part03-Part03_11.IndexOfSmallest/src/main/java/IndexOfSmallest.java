
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        
        int smallest = list.get(0);
        
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
            i++;
        }
        
        System.out.println("Smallest number: " + smallest);
        
        int j = 0;
        while (j < list.size()) {
            if (list.get(j) == smallest) {
                System.out.println("Found at index: " + j);
            }
            j++;
        }
        
    }
}
