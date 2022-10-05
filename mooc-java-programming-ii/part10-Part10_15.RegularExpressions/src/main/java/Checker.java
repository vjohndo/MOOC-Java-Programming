import java.util.Arrays;

public class Checker {
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    public boolean timeOfDay(String string) {
        return string.matches("([0-1][0-9]|[2][0-3]):([0-5][0-9]):([0-5][0-9])");
        
        
        // my way
//        if (!string.matches("([0-2][0-9]):([0-5][0-9]):([0-5][0-9])")) {
//            return false;
//        }
//        
//        String[] parts = string.split(":");
//        
//        boolean hoursCorrect = Integer.valueOf(parts[0]) <= 23;
//        
//        boolean minsCorrect = Integer.valueOf(parts[1]) <= 59;
//        
//        boolean secsCorrect = Integer.valueOf(parts[2]) <= 59;
//       
//        return hoursCorrect & minsCorrect & secsCorrect;
    }
}
