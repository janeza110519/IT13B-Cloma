/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter length of rows: ");
       int rows = scan.nextInt();
       System.out.println("Enter length of column: ");
       int column = scan.nextInt();
       
       int[][] matrix = new int[rows][column];
       System.out.println("Enter the elements for the matrix:");
        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < column; j++) { // Inner loop for columns
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt(); // Store input in matrix
            }
        }
        
        // Display the matrix using nested loops
        System.out.println("\nThe matrix you entered is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t"); // Print each element with tab spacing
            }
            System.out.println(); // Move to the next row after each iteration
        }

        // Close the scanner to avoid resource leak
        scan.close();
    }
}
