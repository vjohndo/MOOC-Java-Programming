
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int userNumberTo = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from? ");
        int userNumberFrom = Integer.valueOf(scanner.nextLine());
        
        int i = userNumberFrom;
        while (i <= userNumberTo) {
            System.out.println(i);
            i++;
        }
    }
}
