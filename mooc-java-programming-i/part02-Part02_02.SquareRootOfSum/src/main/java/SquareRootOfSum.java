
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(firstNum + secondNum);
        System.out.println(squareRoot);
    }
}
