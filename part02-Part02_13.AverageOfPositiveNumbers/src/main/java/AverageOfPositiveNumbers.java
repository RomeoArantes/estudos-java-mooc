
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
            }

            if (number == 0) {
                break;
            }

            if (number > 0) {

                count++;
                sum += number;
                avg = 1.0 * sum / count;
            }
        }
        if (count > 0) {
            System.out.println(avg);
        }
    }
}
