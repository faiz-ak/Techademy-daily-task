// Create an interface Vehicle with methods start() and stop(). Implement it in Car and Bike classes.

import java.util.Scanner;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting.");
    }

    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

// Main class to test
public class ActivityTwo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

       
        System.out.println("Choose the option to display for Car/Bike Info:");
        System.out.println("1: Car Info");
        System.out.println("2: Bike Info");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
               myCar.start();
               myCar.stop();
                break;
            case 2:
               myBike.start();
               myBike.stop();
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
