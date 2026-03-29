
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }
            sum += userInput;
            count++;

            if (userInput % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + sum * 1.0 / count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
