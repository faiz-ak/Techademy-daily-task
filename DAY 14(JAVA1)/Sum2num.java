import java.util.Scanner;

public class Sum2num {

    public static int Sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();


        int result = Sum(a, b);

        System.out.println("The Sum of two Numbers is: " + result);
    }
}
