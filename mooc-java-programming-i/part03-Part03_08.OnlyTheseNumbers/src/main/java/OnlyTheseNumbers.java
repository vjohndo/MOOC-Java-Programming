
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.print("From where?");
        int indexStart = Integer.valueOf(scanner.nextLine());
        
        System.out.print("To where?");
        int indexEnd = Integer.valueOf(scanner.nextLine());
        
        while (indexStart <= indexEnd) {
            System.out.println(numbers.get(indexStart));
            indexStart++;
        }

    }
}
