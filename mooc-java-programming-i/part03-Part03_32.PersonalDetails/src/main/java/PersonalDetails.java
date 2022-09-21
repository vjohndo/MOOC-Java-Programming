
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int sumOfYears = 0;
        int count = 0;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] parts = text.split(",");
            if (longestName.length() < parts[0].length()) {
                longestName = parts[0];
            }
            
            sumOfYears += Integer.valueOf(parts[1]);
            count++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Aveage of the birth years: " + (1.0 * sumOfYears / count));

    }
}
