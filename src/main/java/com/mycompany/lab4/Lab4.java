/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        
        System.out.print("The factors are: ");
        
        for(int i=1; i<= num; i++) {
            if(num%i == 0) {
                System.out.print(i);
                
                // Adds a comma after each factor, except for the last one
                if(i!=num) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
}
