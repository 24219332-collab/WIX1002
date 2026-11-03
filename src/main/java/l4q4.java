/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiam
 */
import java.util.Scanner;

public class l4q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Get user inputs
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int startDay = scanner.nextInt();
        
        // 2. Check for leap year to determine February's days[cite: 15]
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febDays = isLeapYear ? 29 : 28;
        
        // 3. Calculate the starting day of May and August
        // Days before May = Jan(31) + Feb + Mar(31) + Apr(30)
        int daysBeforeMay = 31 + febDays + 31 + 30;
        int startDayMay = (startDay + daysBeforeMay) % 7;
        
        // Days before August = Days before May + May(31) + Jun(30) + Jul(31)
        int daysBeforeAugust = daysBeforeMay + 31 + 30 + 31;
        int startDayAugust = (startDay + daysBeforeAugust) % 7;
        
        // 4. Print May Calendar
        System.out.println("\n          May " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces to align the 1st day of the month under the correct weekday
        for (int i = 0; i < startDayMay; i++) {
            System.out.print("    "); 
        }
        
        // Print the 31 days of May
        for (int day = 1; day <= 31; day++) {
            System.out.printf("%4d", day);
            // Move to a new line after Saturday (when total offset is divisible by 7)
            if ((startDayMay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
        
        // 5. Print August Calendar
        System.out.println("         August " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces for August
        for (int i = 0; i < startDayAugust; i++) {
            System.out.print("    ");
        }
        
        // Print the 31 days of August
        for (int day = 1; day <= 31; day++) {
            System.out.printf("%4d", day);
            if ((startDayAugust + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
