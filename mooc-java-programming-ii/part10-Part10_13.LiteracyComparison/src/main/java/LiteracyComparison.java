
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        ArrayList<Result> results = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Result(parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]), Double.parseDouble(parts[5])))
                    .forEach(result -> results.add(result));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        results.stream()
                .sorted((r1, r2) -> {
                    if (r1.getLiteracyRate() > r2.getLiteracyRate()) {
                        return 1;
                    }
                    
                    if (r1.getLiteracyRate() < r2.getLiteracyRate()) {
                        return -1;
                    }
                    
                    return 0;
                }).forEach(result -> System.out.println(result));
                
        // Hacked solution;
//        try {
//            Files.lines(Paths.get("literacy.csv"))
//                    .map(row -> row.split(","))
//                    .sorted((parts1, parts2) -> { 
//                        Double obj1 = Double.parseDouble(parts1[5]);
//                        Double obj2 = Double.parseDouble(parts2[5]);
//                        return obj1.compareTo(obj2);
//                        })
//                    .forEach(array -> {
//                        System.out.println(array[3] + " (" + array[4] + "), " + array[2].split(" ")[1] + ", " + array[5]);
//                    });
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
        
    }
}
