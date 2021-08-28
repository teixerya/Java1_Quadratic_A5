/*Name: Ryan Teixeira
Assignment:  Assignment 3 
Program: Information systems engineering

Designed a guessing game in which the user guesses a number between 1 - 100
The game allows the user to quit at any time by entering a negative value and play again.
A method is used to store the guessing game. */

import java.util.Scanner;

public class Guess_GameA_3 {

    static void myGuessMethod(Scanner input, char answer) {

        int hotNum = 0;
        boolean exitFlag;
        do { // do open bracket

            hotNum = (int) (Math.random() * 100 + 1);
            int guess;
            System.out.println("I'm thinking of a number " + "between 1 and 100. " + "\nWhat is it?");

            do {// user inputs guess.
                exitFlag = false;
                System.out.print("Guess: ");
                guess = input.nextInt();

                // if guess is negative game ends.
                if (guess < 0) {
                    System.out.println("You gave up!" + "\nYour number was " + hotNum + ".");
                    exitFlag = true;
                }

                if (guess > 0 && guess < hotNum) {
                    System.out.println("Too low.");
                } else if (guess > 0 && guess > hotNum) {
                    System.out.println("Too high.");
                }

                // if guess is the hotNum the
                if (guess == hotNum) {
                    System.out.println("You got it!");
                    exitFlag = true;
                }

            } while (!exitFlag);
            System.out.println("\nPlay again? (Y/N)");
            answer = input.next().toUpperCase().charAt(0);

        } while (answer != 'N');
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char answer = '\0';
        myGuessMethod(input, answer);

        System.out.println("Thanks for playing!");

    }
}
