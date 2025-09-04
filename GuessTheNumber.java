/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessthenumber;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Step 1: Fix the secret number
        int secretNumber = 7;

        // Step 2: Prepare scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Ask for the first guess
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        // Step 4: Loop until correct
        while (guess != secretNumber) {
            System.out.println("Try again!");
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();
        }

        // Step 5: Success message
        System.out.println("Congratulations! You guessed it!");

        scanner.close();
    }
}
