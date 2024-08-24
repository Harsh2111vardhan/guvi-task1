
import java.util.Scanner;
public class Discount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);  // Create Scanner
            System.out.print("Enter the purchase amount: ");
            double purchaseAmount = scanner.nextDouble();

            // variable to store the discount rate
            double discountRate;

            // logic to determine the discount rate
            if (purchaseAmount >= 1000) {
                discountRate = 0.10;  // 20% discount for purchases of Rs1000 or more
            } else if (purchaseAmount >= 500) {
                discountRate = 0.05;  // 10% discount for purchases between Rs500 and Rs999.99
            } else {
                discountRate = 0.00;  // 0% discount for purchases below Rs500
            }
            // Calculate the discount amount
            double discountAmount = purchaseAmount * discountRate;
            double finalAmount = purchaseAmount - discountAmount;
            System.out.println("Discount: Rs" + discountAmount);
            System.out.println("Final payable amount: Rs" + finalAmount);
        }
    }

