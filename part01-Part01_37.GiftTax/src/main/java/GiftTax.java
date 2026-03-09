
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double userInput = Double.valueOf(scan.nextLine());
        
        if (userInput >= 5000 && userInput <= 25000) {
            double giftTax = (100 + (userInput - 5000) * 0.08);
            System.out.println("Tax: " + giftTax);
        } else if (userInput > 25000 && userInput <= 55000) {
            double giftTax = (1700 + (userInput - 25000) * 0.10);    
            System.out.println("Tax: " + giftTax);
        } else if (userInput > 55000 && userInput <= 200000) {
            double giftTax = (4700 + (userInput - 55000) * 0.12);    
            System.out.println("Tax: " + giftTax);
        } else if (userInput > 200000 && userInput <= 1000000) {
            double giftTax = (22100 + (userInput - 200000) * 0.15);    
            System.out.println("Tax: " + giftTax);
        } else if (userInput > 1000000) {
            double giftTax = (142100 + (userInput - 1000000) * 0.17);    
            System.out.println("Tax: " + giftTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
