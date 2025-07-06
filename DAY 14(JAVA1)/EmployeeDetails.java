public class EmployeeDetails {
        String name;
        float salary;
        int age;
        String designation;

        EmployeeDetails(String name, float salary, int age, String designation) {
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.designation = designation;
        }

  
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);
            System.out.println("");
        }

    public static void main(String[] args) {  
        EmployeeDetails emp1 = new EmployeeDetails("Faizan Akram", 50000, 22, "Frontend Developer");
        EmployeeDetails emp2 = new EmployeeDetails("Riya Sharma", 60000, 28, "UI/UX Designer");
        EmployeeDetails emp3 = new EmployeeDetails("Amit Roy", 75000, 30, "Backend Engineer");

      
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
