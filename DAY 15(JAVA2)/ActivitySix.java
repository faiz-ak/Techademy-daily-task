import java.util.Scanner;
// Write a program with a try, catch, and finally block to show that the finally block always executes.
public class ActivitySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = 100 / num; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error Division : " + e.getMessage() + " is not allowed");
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
