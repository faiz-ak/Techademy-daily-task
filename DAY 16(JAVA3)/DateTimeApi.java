
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// 4. Date and Time API
// Activity: Event Countdown
 
// Task:
 
// Ask the user to enter a future event date (e.g., "2025-12-25")
 
// Use LocalDate and Period to calculate how many months and days remain
 
// Display a message like:
// "Your event is in 6 months and 12 days."

public class DateTimeApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the event year (e.g.2025): ");
        int year = sc.nextInt();

        System.out.println("Enter the event month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter the event day (1-31): ");
        int day = sc.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.of(year, month, day);

        if(future.isBefore(now)){
            System.out.println("Please Fill the future Date");
        }else{
             Period remain = Period.between(now, future);
             System.out.println("Your event is in " + remain.getMonths() + " months and " + remain.getDays() + " days.");
        }

    }
}
