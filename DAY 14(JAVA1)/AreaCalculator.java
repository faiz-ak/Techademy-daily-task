import java.util.Scanner;


// Activity: Create a method calculateArea() with different parameters to find area of circle and rectangle.
public class AreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

 
    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter Radius: ");
        double radius =  sc.nextDouble();

        System.out.print("Enter Length: ");
       double length =  sc.nextDouble();

        System.out.print("Enter Breadth: ");
       double breadth = sc.nextDouble();
        
        double circleArea = calculateArea(radius); 
        double rectangleArea = calculateArea(length, breadth); 

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
