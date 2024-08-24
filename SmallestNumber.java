import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        // Variable to store the smallest number
        int smallest;
        // logic to det. smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;  // num1 is the smallest
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;  // num2 is the smallest
        } else {
            smallest = num3;  // num3 is the smallest
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
