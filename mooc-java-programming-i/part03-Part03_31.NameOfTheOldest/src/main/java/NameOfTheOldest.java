
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = -1;
        String nameOfOldest = "";
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            if (oldestAge < age) {
                oldestAge = age;
                nameOfOldest = name;
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
