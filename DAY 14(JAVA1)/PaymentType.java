// Activity: Create a base class Payment with method payAmount(). Extend it into CreditCardPayment, UPIPayment, and CashPayment. Override payAmount() to show different messages. Call the method using a Payment reference.
class Payment{
    void payAmount(){
     System.out.println("Payment made.");
    }
}
class CreditCardPayment extends Payment{
    @Override
    void payAmount(){
          System.out.println("Payment made with Credit Card");
    }
}
class UPIPayment extends Payment{
    @Override
    void payAmount(){
           System.out.println("Payment made with Upi Payment");
    }
}
class CashPayment extends Payment{
    @Override
    void payAmount(){
          System.out.println("Payment made with Cash Payment");
    }
}
public class PaymentType {
     public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new CashPayment();

        p1.payAmount();  
        p2.payAmount(); 
        p3.payAmount(); 
}
}