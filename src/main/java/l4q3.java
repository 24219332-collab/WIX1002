/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiam
 */
import java.util.Scanner;

public class l4q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int sumSquares = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            int score = scanner.nextInt();
            
            if (score < 0) {
                break;
            }
            
            count++;
            sum += score;
            sumSquares += (score * score);
            
        
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }
        
        
        if (count > 0) {
            double average = (double) sum / count;
            
            
            double variance = (sumSquares - (Math.pow(sum, 2) / count)) / (count - 1);
            double standardDeviation = Math.sqrt(variance);
            
            
            System.out.println(variance); 
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
        }
        
        scanner.close();
    }
}