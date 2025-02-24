/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        
        // Ask for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Declare the array of the entered size
        int[] numbers = new int[size];
        
        // Ask the user to input elements for the array
        System.out.println("Enter " + size + " numbers:");

        // Loop to read the numbers and store them in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Store each number entered by the user
        }

        // Print out the numbers in the array
        System.out.println("\nThe numbers you entered are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
