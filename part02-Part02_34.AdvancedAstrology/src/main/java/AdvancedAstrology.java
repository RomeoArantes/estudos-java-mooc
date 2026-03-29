
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int stars = 0; stars < number; stars++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int spaces = 0; spaces < number; spaces++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
     /* int i = 1;
        
        while (i <= height) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            i++;
        } */
        
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
