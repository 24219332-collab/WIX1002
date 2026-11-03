/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiam
 */

    import java.util.Scanner;

public class t4q2 {
    public static void main(String[] args) {
        // Create a scanner object to read user input[cite: 4]
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        // Captures the integer typed by the user and saves it into the variable[cite: 5]
        int n = scanner.nextInt(); 
        
        int totalSum = 0;
        int currentTermSum = 0;
        
        // Sums the series: 1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)[cite: 3]
        for (int i = 1; i <= n; i++) {
            currentTermSum += i;        // Calculates the current term (e.g., 1+2+3)
            totalSum += currentTermSum; // Adds the current term to the running total
        }
        
        System.out.println("The sum of the series is: " + totalSum);
        
        // Close the scanner resource to free up computer memory[cite: 4, 5]
        scanner.close();
    }
}

