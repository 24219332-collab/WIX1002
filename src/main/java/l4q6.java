/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiam
 */
import java.util.Random;

public class l4q6 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int randomNum = rand.nextInt(Integer.MAX_VALUE);

        int digitCount = String.valueOf(randomNum).length();
        
        System.out.println("Generated number: " + randomNum);
        System.out.println("Number of digits: " + digitCount);
    }
}
