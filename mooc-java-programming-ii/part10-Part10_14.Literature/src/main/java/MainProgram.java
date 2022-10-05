
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            
            int minAge = Integer.valueOf(scanner.nextLine());
            
            System.out.println("");
            
            books.add(new Book(title, minAge));
        }
        
        System.out.println("");
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        System.out.println("");
        
        Comparator<Book> comparator = Comparator
                                            .comparing(Book::getAge)
                                            .thenComparing(Book::getTitle);
        
        books.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book));
    }

}
