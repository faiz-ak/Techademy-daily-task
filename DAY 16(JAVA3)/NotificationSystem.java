
import java.util.Scanner;

// 1. Interfaces and Abstract Classes
// Activity: Notification System
 
// Task:
 
// Create an interface Notifier with a method send(String message)
 
// Create an abstract class BaseNotifier that implements Notifier and has a common recipient field
 
// Create two subclasses:
 
// EmailNotifier – prints: "Sending email to [recipient]: [message]"
 
// SMSNotifier – prints: "Sending SMS to [recipient]: [message]"
 
// Goal: Show how interfaces define behavior and abstract classes handle shared state or logic.

interface  Notifier{
    void send(String message);
}

abstract class BaseNotifier implements Notifier{
    String recipient;
}

class EmailNotifier extends BaseNotifier{
 public EmailNotifier(String recipient) {
      this.recipient=recipient;
    }
 @Override
    public void send(String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

class SMSNotifier extends BaseNotifier{
     public SMSNotifier(String recipient) {
      this.recipient=recipient;
    }
     @Override
    public void send(String message) {
        System.out.println("Sending sms to " + recipient + ": " + message);
    }
}
public class NotificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter recipient name: ");
        String recipient = sc.nextLine();

        System.out.print("Enter your message: ");
        String message = sc.nextLine();
         
          System.out.println("Choose the option to send the message:");
        System.out.println("1: Via Email");
        System.out.println("2: Via Sms");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
               BaseNotifier email = new EmailNotifier(recipient);
               email.send(message);
                break;
            case 2:
                  BaseNotifier sms = new SMSNotifier(recipient);
               sms.send(message);
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
