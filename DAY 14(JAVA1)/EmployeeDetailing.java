import java.util.Scanner;
// Create a base class Person with name and age, and a derived class Employee with salary. Display inherited values.
class Person {
    String name;
    int age;
}

class Employee extends Person {
    Float salary;

    void displayinfo() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }
}


public class EmployeeDetailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter age: ");
        emp.age = sc.nextInt();

        System.out.print("Enter salary: ");
        emp.salary = sc.nextFloat();

        emp.displayinfo();
    }
}
