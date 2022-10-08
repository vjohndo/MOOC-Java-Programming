
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        


        // You can test the class here
        HashMap<String, String> myHashMap = new HashMap<>();
        
        myHashMap.add("myKey", "myValue");
        
        for (int i = 0; i < 100; i++) {
            myHashMap.add("myKey" + i, "myValue" + i);
        }
        
        System.out.println(myHashMap.get("myKey"));
        System.out.println(myHashMap.get("myKey2"));
        System.out.println(myHashMap.get("myKey33"));
        myHashMap.remove("myKey33");
        System.out.println(myHashMap.get("myKey33"));
        System.out.println(myHashMap.get("myKey101"));
    }
    
    
}
