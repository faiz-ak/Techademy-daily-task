import java.util.Scanner;
// Create a Java program that simulates a bank withdrawal process and throws an exception if the balance is insufficient.

class BankWithdrawalException extends Exception{
    String errormessage;
    public BankWithdrawalException(String message) {
        this.errormessage = message;
    }
    @Override
    public String getMessage(){
      return errormessage;
    }
}

public class ActivitySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Double bankbalnce = 5000.00;
            System.out.println("Enter the Account number : ");
            long accnum = sc.nextLong();
            sc.nextLine();  
            System.out.println("Enter the Account Holder Name : ");
            String accname = sc.nextLine();
            System.err.println("Enter the Amount you need to withdraw");
            double accwithdraw = sc.nextDouble();
            
            if(accwithdraw > bankbalnce){
                throw new BankWithdrawalException("Insufficient Balance for Withdrawal");
            } else{
                System.out.println(accwithdraw + " Amount Withdrawn Successfully");
            }
        } catch (BankWithdrawalException e) {
           System.out.println("Error : " + e.getMessage());
        }
    }
}
