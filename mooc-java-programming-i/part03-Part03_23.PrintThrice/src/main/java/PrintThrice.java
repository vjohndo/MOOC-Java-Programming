
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String userString = scanner.nextLine();
        
        System.out.println(userString + userString + userString);
        

    }
}
