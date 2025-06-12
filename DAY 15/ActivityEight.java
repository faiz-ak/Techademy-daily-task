import java.util.Scanner;
// Write a program with nested try-catch blocks and show how an inner block handles one exception and an outer block handles another.
public class ActivityEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] numbers = {10, 20, 30};

            System.out.print("Enter index : ");
            int index = sc.nextInt();

            try {
                System.out.print("Enter a number to divide 100 by: ");
                int num = sc.nextInt();
                int result = 100 / num; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch Error Division : " + e.getMessage() + " is not allowed");
            }


            System.out.println("Value at index: " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Error: " + e.getMessage());
        }
    }
}
