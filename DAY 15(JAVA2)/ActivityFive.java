// Write a program that accepts an array and prints an element at a specific index, handling ArrayIndexOutOfBoundsException.

import java.util.Scanner;

public class ActivityFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.err.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println("Enter the Index you want to access");
        int index = sc.nextInt();

        try {
            System.err.println("Element at this " + index + "is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
