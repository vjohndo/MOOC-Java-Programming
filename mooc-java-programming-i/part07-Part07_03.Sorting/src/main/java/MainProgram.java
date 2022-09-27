
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 2};
        System.out.println("SmallestIndex: " + MainProgram.indexOfSmallest(array));
        System.out.println("IndexOfSmallestFrom: " + indexOfSmallestFrom(array, 1));
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num: array) {
            if (smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex; // 2 
        
        for (int i = startIndex; i < table.length; i++) { // i = 3
            if (table[smallestIndex] > table[i]) { // 1 > 2 ?  
                smallestIndex = i; // 2
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            i++;
        }
    }
}
