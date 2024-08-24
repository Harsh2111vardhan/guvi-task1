import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        // Read input from user using Scanner class object
        Scanner obj = new Scanner(System.in);

        // Prompt the user to enter the value for i, j, and k
        System.out.print("Enter the value for i, j, and k: ");
        int n = obj.nextInt();

        //Logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(n - i);  // Print the decreasing number based on row
                } else {
                    System.out.print(n - j);  // Print the decreasing number based on column
                }
            }
            System.out.println();
        }
    }
}
