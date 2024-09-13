package myJavaPractice;

/*
    Create a class Game, which allows a user to play "Guess the Number" game once.
    Game should have the following methods:
    1. Constructor to generate random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by user is true
    4. getters and setters of noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!
*/

import java.util.Scanner;

class Game {
    int userNumber;
    int computerNumber;
    int noOfGuesses = 0;

    public Game() {
        computerNumber = (int) (Math.random()*100);
    }
    public void setUserNumber(int n) {
        userNumber = n;
    }
    public int isCorrectNumber() {
        if(userNumber == computerNumber) {
            return 0;
        }
        else if(userNumber > computerNumber) {
            return -1;
        }
        else {
            return 1;
        }

    }
    public void getNoOfGuesses() {
        System.out.println("The number of guesses were: " + noOfGuesses);
    }
    public void setNoOfGuesses() {
        noOfGuesses++;
    }

}

public class practice_exercise_2 {
    public static void main(String[] args) {

        Game newGame = new Game();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number between 1-100 ");
            int n = sc.nextInt();
            newGame.setUserNumber(n);

            if(newGame.isCorrectNumber() == 0) {
                newGame.setNoOfGuesses();
                System.out.println("Congratulations..!! You have guessed the correct number.");
                newGame.getNoOfGuesses();
                break;
            }
            else if(newGame.isCorrectNumber() == 1) {
                newGame.setNoOfGuesses();
                System.out.println("Enter larger number..!!");
            }
            else if(newGame.isCorrectNumber() == -1){
                newGame.setNoOfGuesses();
                System.out.println("Enter smaller number");
            }
        }

    }
}
