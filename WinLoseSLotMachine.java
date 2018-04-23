/*
 * Charlie Lew  
 * Date: March 28, 2016
 * Version:    v0.01
 * Description: This is a program that runs a slot machine with three numbers.
Starting number of coins: 50
Unlike three numbers: 0 coin 
All numbers are one: 4 coins
All numbers are two: 6 coins
All numbers are three: 8 coins
All numbers are four: 10 coins
If all the coins are lost, the game ends
 */
package ca.hdsb.gwss.charlielew.u4;

import java.util.Scanner;

/**
 *
 * @author JinHwanCharlieLew
 */
public class WinLoseSLotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);

        // Variables 
        int coin = 50;
        int lose = 0;
        int prize;

        // Intro
        System.out.println("-- WIN OR LOSE SLOT MACHINE --");

        // Spin 
        System.out.print("PLEASE ENTER \"7\" TO START: ");
        int spin = input.nextInt();

        // Can't Start
        while (spin != 7) {
            System.out.println("** INVALID CODE **");
            System.out.print("PLEASE ENTER 7 TO BEGIN: ");
            spin = input.nextInt();
        }

        // Start
        if (spin == 7) {

            // use 1 coin each time
            coin--;

            // First Number
            int firstSlot = (int) (Math.random() * 4) + 1;
            System.out.println("" + firstSlot);

            // Second Number
            int secondSlot = (int) (Math.random() * 4) + 1;
            System.out.println("" + secondSlot);

            // Third Number
            int thirdSlot = (int) (Math.random() * 4) + 1;
            System.out.println("" + thirdSlot);

            // LOSE
            if (firstSlot != secondSlot || secondSlot != thirdSlot) {
                System.out.println("Sorry!\n"
                        + "YOU WON " + lose + " TOKENS \n"
                        + "Try Again!!!");
            } // WIN
            else {
                prize = 2 * firstSlot + 2;
                coin = coin + prize;
                System.out.println("CONGRATULATIONS!\n"
                        + "YOU WON " + prize + " TOKENS \n"
                        + "Try Again!!!");
            }
            // Final number of coins left
            System.out.println("YOU HAVE " + coin + " COINS");
        }
    }
}
