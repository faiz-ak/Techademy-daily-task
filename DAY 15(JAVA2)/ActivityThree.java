
// Activity3:
import java.util.Scanner;

class InvalidAgeException extends Exception {
    String errormessage;
    public InvalidAgeException(String message) {
        this.errormessage = message;
    }
    @Override
    public String getMessage(){
      return errormessage;
    }
}

public class ActivityThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Write a program to input two numbers and divide them. Handle division by zero.
         try{
        int one, two;
        System.out.println("Enter the First Number");
        one = sc.nextInt();
           System.out.println("Enter the Second Number");
        two = sc.nextInt();
         int result = one/two;
         System.out.println("Result : " + result);
    }catch(ArithmeticException e){
       System.out.println("Error: Can't be divided by zero");
        }
           try{
            int age;
             System.out.println("Enter the Age");
             age = sc.nextInt();
              if (age < 18) {
                throw new InvalidAgeException("Age is below 18. Not allowed.");
              } else {
                System.out.println("Valid age: " + age);
            }
}catch(InvalidAgeException e){
 System.out.println("Custom Exception: " + e.getMessage());
}     
    }
}
