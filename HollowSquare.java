
public class HollowSquare {

    public static void printHollowSquare(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size) {
                    System.out.print("*");
                } else if (col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printHollowSquare(5);
    }
}
