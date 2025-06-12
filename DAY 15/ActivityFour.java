// Create a package called mathutils with a class Calculator.
// Add add, subtract, multiply methods.
// Use the package in your main program to perform operations.

import java.util.Scanner;
import mathutils.Calculator;

public class ActivityFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
         int a,b;
         System.out.println("Enter the First Number");
         a=sc.nextInt();
         System.out.println("Enter the Second Number");
         b=sc.nextInt();
         System.out.println("Choose the option");
         System.out.println("1: Addition");
         System.out.println("2: Subtraction");
         System.out.println("3: Multiplication");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calc.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
