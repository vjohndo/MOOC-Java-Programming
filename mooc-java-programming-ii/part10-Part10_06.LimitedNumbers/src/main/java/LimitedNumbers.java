
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }
            
            inputs.add(num);
        }
        
        inputs.stream()
            .filter(i -> i >= 1 && i <= 5)
            .forEach(i -> System.out.println(i));
    }
}
