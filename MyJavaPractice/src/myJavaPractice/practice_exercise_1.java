package myJavaPractice;// Create a Rock, Paper and Scissors game and play against computer

import java.util.Scanner;
import java.util.Random;

public class practice_exercise_1 {
    public static void main(String[] args) {
        // 0 is for Rock
        // 1 is for Paper
        // 2 is for Scissors

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock,\nEnter 1 for Paper and\nEnter 2 for Scissors");
        System.out.println();
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer choice: Paper");
        } else {
            System.out.println("Computer choice: Scissors");
        }

        if (userInput == computerInput) {
            System.out.println("Result is Draw..!");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win..!");
        } else {
            System.out.println("Computer Wins..!");
        }
    }
}