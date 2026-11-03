/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author chiam
 */

import java.util.Scanner;

public class t4q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        
        int totalSum = 0;
        int currentTermSum=0;
        
        for(int i=1; i<=n; i++){
            currentTermSum +=i;
            totalSum += currentTermSum;
            
        }
        
        System.out.println("The sum of the series is: "+ totalSum);
        
        scanner.close();
    }
}
