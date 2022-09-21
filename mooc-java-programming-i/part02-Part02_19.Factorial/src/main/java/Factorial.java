
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        
        int result = 1;
        
        while (n > 0) {
            result *= n;
            n--;
        }
        
        System.out.println("Factorial: " + result);
    }
}
