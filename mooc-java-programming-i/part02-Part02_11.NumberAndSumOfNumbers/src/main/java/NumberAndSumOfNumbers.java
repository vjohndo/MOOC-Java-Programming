
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfNums = 0;
        int sumOfNums = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNumInput = Integer.valueOf(scanner.nextLine());
            if (userNumInput == 0) {
                break;
            }
            numberOfNums += 1;
            sumOfNums += userNumInput;
        }
        
        System.out.println("Number of numbers: " + numberOfNums);
        System.out.println("Sum of the numbers: " + sumOfNums);
    }
}
