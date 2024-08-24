// Program to find if a number is negative,positive or zero
import java.util.Scanner;  // import scanner class to read input

public class NumNegOrPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");    //input
        double number = scanner.nextDouble();    // store in variable

        if(number>0) { //if num is +ve
            System.out.print("The number is positive");
        } else if (number<0) {  //if num is -ve
            System.out.print("The number is negative");
        }else {   //if num is 0
            System.out.print("The number is 0");

        }
    }
    }

