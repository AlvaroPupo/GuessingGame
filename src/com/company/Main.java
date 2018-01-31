
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. Allow user input of a number(guess)
        //2. Tell the user if their guess is too high or too low
        //3. Allow for 5 chances, is the number isn't guessed tell them what it is
        //4. If the number is guessed, congratulate them
        //5. Allow the user play again if they would like.

        int numberOfGuesses = 0;
        final int MAX_GUESS_COUNT = 4;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100: ");
        System.out.println("Enter your guess: ");
        int generatedNumber = (int) Math.ceil(Math.random() * 100);
        do {
            int userGuess;
            try {
                userGuess = input.nextInt();
                if (userGuess == generatedNumber) {
                    System.out.println("you guessed the correct number!!");
                    System.out.println("Want to play again? Y/N");

                } else if (userGuess > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;

                } else if (userGuess < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
                }
            } catch (InputMismatchException ime) {
                System.out.println("invalid input, please enter a number between 0 and 100...");
                System.out.println("Enter your guess again: ");
                input.nextLine();
            }
        } while (numberOfGuesses < 5);

        if (numberOfGuesses >= 6 || numberOfGuesses != generatedNumber) {

            System.out.println("Sorry, you have ran out of chances. The correct number was: " + generatedNumber);
            System.out.println("do you want to play again? Y/N");
            input.nextLine();

        }
            }
        }