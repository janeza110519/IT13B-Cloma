/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test21;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Test21 {

    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
        }
       }
    }
}
