
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        
        double average = ( (1.0 * firstNum + secondNum + thirdNum) / 3);
        System.out.println("The average is " + average);
      
    }
}
