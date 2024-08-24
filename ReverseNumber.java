import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit of the number
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
