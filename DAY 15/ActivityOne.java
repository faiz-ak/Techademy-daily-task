import java.util.*;
// Create a List<Integer> and store 10 numbers.
// Sort and display the even numbers only.
// Use a HashMap to store and display employee id -> name.
public class ActivityOne {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 5, 8, 23, 4, 9, 2, 15, 6, 10);

    
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        Collections.sort(evenNumbers);

        System.out.println("Sorted Even Numbers:");
        for (int even : evenNumbers) {
            System.out.print(even + " ");
        }

        System.out.println("\n");

      
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Faizan");
        employees.put(102, "Rohit");
        employees.put(103, "Kishor");

        System.out.println("Employee ID -> Name:");
       employees.forEach((id, name) -> 
       System.out.println(id + " -> " + name));
    }
}
