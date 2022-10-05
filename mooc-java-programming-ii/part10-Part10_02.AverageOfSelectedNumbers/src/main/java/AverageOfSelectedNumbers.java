
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(Integer.valueOf(input));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        
        if (choice.equals("n")) {
            System.out.print("Average of the negative numbers: ");
            double average = inputs.stream().mapToInt(i -> Integer.valueOf(i)).filter(number -> number < 0).average().getAsDouble();
            System.out.println(average);
        }
        
        if (choice.equals("p")) {
//            System.out.print("Average of the positive numbers: ");
//            double average = inputs.stream().mapToInt(i -> Integer.valueOf(i)).filter(number -> number > 0).average().getAsDouble();
//            System.out.println(average);
            System.out.println("Average of the positive numbers: " + inputs.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }
        

    }
}
