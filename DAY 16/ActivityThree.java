// Create an abstract class Employee with an abstract method calculateSalary() and a concrete method displayDetails(). Extend it with FullTimeEmployee and PartTimeEmployee.

import java.util.Scanner;

abstract class Employee {
    abstract void calculateSalary();


    void displayDetails() {
        System.out.println("Displaying the details of the employee");
    }
}


class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Full-time employee salary: ₹50,000");
    }
}


class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Part-time employee salary: ₹26,000");
    }
}

// Main class
public class ActivityThree {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();

        System.out.println("Choose the option to display for full/part time employee:");
        System.out.println("1: FullTimeEmployee");
        System.out.println("2: PartTimeEmployee");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                fullTime.displayDetails();
                fullTime.calculateSalary();
                break;
            case 2:
                 partTime.displayDetails();
                 partTime.calculateSalary();
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
