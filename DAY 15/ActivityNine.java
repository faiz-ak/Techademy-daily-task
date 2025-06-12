import java.util.Scanner;
// Create a Java program to handle NullPointerException when trying to access the length of a null string.
public class ActivityNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the String");
        String str = sc.nextLine();
        if (str == null || str.isEmpty()) {
         throw new NullPointerException();
        } else {
            System.out.println("Valid String");
        }

        } catch(NullPointerException e){
            System.out.println("Error : " + e.getMessage() + "string Entered");
        }
  
    }
}
