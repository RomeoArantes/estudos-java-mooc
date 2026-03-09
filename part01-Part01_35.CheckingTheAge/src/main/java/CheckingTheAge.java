
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int userInput = Integer.valueOf(scan.nextLine());
        
        if (userInput < 0) {
            System.out.println("Impossible!");
        } else if (userInput > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
