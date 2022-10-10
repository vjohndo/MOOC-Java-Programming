


public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int[] row : array) {
            for (int col : row) {
                stringBuilder.append(col);
                
            }
            stringBuilder.append("\n");
        }
        
        return stringBuilder.toString();
        
    }

}
