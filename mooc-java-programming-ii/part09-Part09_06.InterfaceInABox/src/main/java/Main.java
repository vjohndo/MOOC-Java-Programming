
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box myBox = new Box(100);
        Box yourBox = new Box(1000);
        
        yourBox.add(myBox);
        
        myBox.add(new CD("1232","312312",232));
        
        System.out.println(myBox);
    }

}
