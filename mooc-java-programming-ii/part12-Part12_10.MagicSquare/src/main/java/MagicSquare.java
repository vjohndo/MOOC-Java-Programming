
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> sumOfRows = new ArrayList<>();
        
        for (int i = 0; i < this.square.length; i++) {
            int sumOfRow = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                sumOfRow += this.square[i][j];
            }
            sumOfRows.add(sumOfRow);
        }
        
        return sumOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        
        ArrayList<Integer> sumOfCols = new ArrayList<>();
        
        // can iterator over the columns first
        
        for (int col = 0; col < this.square.length; col++) {
            int sumOfCol = 0;
            for (int row = 0; row < this.square[col].length; row++) {
                sumOfCol += this.square[row][col];
            }
            sumOfCols.add(sumOfCol);
        }
        
        return sumOfCols;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        // easier to do indivodual iterations!
        
        int firstDiag = 0;
        for (int y = 0; y < this.square.length; y++) {
            firstDiag += this.square[y][y];
        }
        
        int secondDiag = 0;
        for (int y = 0; y < this.square.length; y++) {
            secondDiag += this.square[y][this.square.length-y-1];
        }
        
        sumOfDiagonals.add(firstDiag);
        sumOfDiagonals.add(secondDiag);
        
//        sumOfDiagonals.add(0);
//        sumOfDiagonals.add(0);
//        
//        for (int row = 0; row < this.square.length; row++) {
//            for (int col = 0; col < this.square[row].length; col++) {
//                if (row == col) {
//                    sumOfDiagonals.set(0, sumOfDiagonals.get(0) + this.square[row][col]);
//                }
//                
//                if (row + col == this.square.length - 1) {
//                    sumOfDiagonals.set(1, sumOfDiagonals.get(1) + this.square[row][col]);
//                }
//            }
//        }
        
        return sumOfDiagonals;
        
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
