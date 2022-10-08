
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (array.length == 0) {
            return 0;
        }
        
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        
        if (toWhere >= array.length) {
            toWhere = array.length - 1;
        }
        
        int sum = 0;
        
        for (int i = fromWhere; i <= toWhere; i++) {
            
            int currentValue = array[i];
            
            if (currentValue <= largest && currentValue >= smallest) {
                sum += currentValue;
            }
        }
        
        return sum;
    }

}
