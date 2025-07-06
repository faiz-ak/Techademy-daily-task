// ACTIVITY - STREAM + LAMBDA
// Problem Statement:
// Given a list of employee names, filter names starting with 'A', convert them to uppercase, and print them.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActivityOne {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Bob", "Ami",  "Faizan", "Adityta");

        List<String> ChangedString = string.stream()
        .filter(s -> s.startsWith("A"))
        .map(s -> s.toUpperCase())
        .collect(Collectors.toList()); 
        System.out.println("Filtered and Uppercase Names: " + ChangedString);
    }
}
