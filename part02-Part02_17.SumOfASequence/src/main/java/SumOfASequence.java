
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sumOfSequence = 0;
        int start = 0;
        for (int i = start; i <= lastNumber; i++) {
            sumOfSequence += i;
            //System.out.println(i);
            //System.out.println(sumOfSequence);
        }
        System.out.println("Them sum is: " + sumOfSequence);
    }
}
