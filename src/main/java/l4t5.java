/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chiam
 */

public class l4t5 {

    public static void main(String[] args) {
        int p1 = 0, p2 = 0, dice, currentPlayer;
        boolean isOneTurn = true;
        
        while (Math.max(p1, p2) <= 100) {
            dice = (int) (Math.random() * 6 + 1);
            currentPlayer = isOneTurn ? 1 : 2;
            
            if (isOneTurn) {
                p1 += dice;
                isOneTurn = dice == 6;
            } else {
                p2 += dice;
                
                isOneTurn = dice != 6; 
            }
            
            System.out.printf("Player %d rolls the dice and gets %d points.%n", currentPlayer, dice);
        }
        
        System.out.printf("Player %d win with %d points!%n", p1 > p2 ? 1 : 2, Math.max(p1, p2));
    }
}
