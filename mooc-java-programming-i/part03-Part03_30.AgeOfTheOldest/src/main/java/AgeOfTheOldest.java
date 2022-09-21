
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = -1;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            int age = Integer.valueOf(parts[1]);
            if (oldestAge < age) {
                oldestAge = age;
            }
            System.out.println("Age of the oldest: " + oldestAge);
        }
    }
}
