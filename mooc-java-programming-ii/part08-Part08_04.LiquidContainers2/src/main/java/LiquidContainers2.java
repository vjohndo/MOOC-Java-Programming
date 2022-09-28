
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            
            if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                first.add(amount);
            }
            
            if (command.equals("remove")) {
                int amount = Integer.valueOf(parts[1]);
                second.remove(amount);
            }
            
            if (command.equals("move")) {
                int amount = Integer.valueOf(parts[1]);
                first.moveTo(second, amount);
            }

        }
    }

}
