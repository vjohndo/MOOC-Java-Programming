
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int y = 0;
        int x = size/2;
        
        
        int placedNums = 0;
        while (placedNums < size * size) {
            square.placeValue(x, y, placedNums + 1);
            placedNums++;
            
            int potentialX = x + 1;
            int potentialY = y - 1;
            
            if (potentialX >= size) {
                potentialX %= size;
            }
            
            if (potentialY < 0) {
                potentialY += size;
            }
            
            
            if (square.readValue(potentialX, potentialY) == 0) {
                x = potentialX;
                y = potentialY;
            } else {
                y++;

                if (y >= size) {
                    y %= size;
                }
            }
        }
        
        
        return square;
    }

}
