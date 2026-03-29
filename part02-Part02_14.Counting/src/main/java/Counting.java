
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number= Integer.valueOf(scanner.nextLine());
        
        int start = 0;
        
        for (int i = start; number >= i; i++) {
            System.out.println(i);
        }
    }
}
