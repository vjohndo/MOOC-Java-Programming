
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Second number? ");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
