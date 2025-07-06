import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ActivityTwo {
    public static void main(String[] args) {
      
        List<String> students = Arrays.asList("Faizan", "Ali", "Maaz", "Rohit", "Ahmed");
      try {
            FileWriter writer = new FileWriter("students.txt");
            for (String name : students) {
                writer.write(name + "\n");
            }
            writer.close();
            System.out.println("All Names written to file.");
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }

          System.out.println("\nNames are in Uppercase:");
        try {
            FileReader reader = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
            // reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
