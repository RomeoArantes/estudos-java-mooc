
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- between the shapes

        printSquare(4);

        System.out.println("\n---");

        printRectangle(17, 3);

        System.out.println("\n---");

        printTriangle(4);

        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int row = 0;

        while (row < size) {

            int col = 0;

            while (col < size) {
                System.out.print("*");
                col++;
            }
            System.out.println("");
            row++;
        }
    }

    public static void printRectangle(int width, int height) {
        int row = 0;

        while (row < height) {
            int column = 0;
            while (column < width) {
                System.out.print("*");
                column++;
            }
            System.out.println("");
            row++;
        }
    }

    public static void printTriangle(int size) {
        int helper = -1;
        
        for (int rows = 0; rows < size; rows++) {
            System.out.print("*");
            helper++; // > 0

            for (int columns = 0; columns < helper; columns++) {
                System.out.print("*");  
            }
            System.out.println("");
        }
    }
}
