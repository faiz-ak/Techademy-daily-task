import java.util.Scanner;
// Another one : Create a class Calculator and overload methods add(int, int), add(double, double), add(int, int, int). Test all overloads.
public class Calculator {

   
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static double add(double a, double b) {
        return a + b;
    }


    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first integer: ");
        int x1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int x2 = sc.nextInt();
        System.out.println("Sum of two integers: " + add(x1, x2));
        System.out.println("");
        
        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();
        System.out.println("Sum of two doubles: " + add(d1, d2));
         System.out.println("");
    
        System.out.print("Enter First integer: ");
        int y1 = sc.nextInt();
        System.out.print("Enter Second integer: ");
        int y2 = sc.nextInt();
        System.out.print("Enter Third integer: ");
        int y3 = sc.nextInt();
        System.out.println("Sum of three integers: " + add(y1, y2, y3));
    }
}
