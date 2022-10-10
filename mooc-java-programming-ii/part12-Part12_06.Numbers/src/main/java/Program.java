
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many numbers should be printed?");
        int i = Integer.valueOf(scanner.nextLine());

        while (i > 0) {
            System.out.println(rand.nextInt(11));
            i--;
        }
    }

}
