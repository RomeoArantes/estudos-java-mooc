
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOne = Integer.valueOf(scanner.nextLine());
        int numberTwo = Integer.valueOf(scanner.nextLine());
        
        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
        } else if (numberTwo > numberOne) {
            System.out.println(numberTwo + " is smaller than " + numberOne);
        } else {
            System.out.println(numberTwo + " is equal to " + numberOne);
        }
    }
}
