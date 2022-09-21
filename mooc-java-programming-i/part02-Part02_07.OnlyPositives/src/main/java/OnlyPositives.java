
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int guessNum = Integer.valueOf(scanner.nextLine());
            
            if (guessNum < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            
            if (guessNum == 0) {
                break;
            }
            
            System.out.println(guessNum * guessNum);
        }
    }
}
