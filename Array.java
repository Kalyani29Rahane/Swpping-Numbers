package com.tka;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Swap every two adjacent elements
        for (int i = 0; i < numbers.length - 1; i += 2) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }

        // Print the swapped array
        System.out.println("\nArray after swapping every two elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
