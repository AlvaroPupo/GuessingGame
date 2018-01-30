
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
        int userGuess = input.nextInt();
        int generatedNumber = (int) Math.ceil(Math.random() * 100);
        
                if (userGuess == generatedNumber) {
                    System.out.println("you guessed the correct number!!");

                } else if (userGuess > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;

                } else if (userGuess < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
            }
            if (numberOfGuesses >= 1) {
                Scanner newnumber = new Scanner(System.in);
                System.out.println("Enter your guess: ");
                int newGuess = newnumber.nextInt();

                if (newGuess == generatedNumber) {
                    System.out.println("you guessed the correct number!!");
                } else if (newGuess > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;

                } else if (newGuess < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
                }
            }
            if (numberOfGuesses >= 2) {
                Scanner newnumber2 = new Scanner(System.in);
                System.out.println("Enter your guess: ");
                int newGuess2 = newnumber2.nextInt();

                if (newGuess2 == generatedNumber) {
                    System.out.println("you guessed the correct number!!");
                } else if (newGuess2 > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;

                } else if (newGuess2 < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
                }
            }
            if (numberOfGuesses >= 3) {
                Scanner newnumber3 = new Scanner(System.in);
                System.out.println("Enter your guess: ");
                int newGuess3 = newnumber3.nextInt();

                if (newGuess3 == generatedNumber) {
                    System.out.println("you guessed the correct number!!");
                } else if (newGuess3 > generatedNumber) {
                    System.out.println("Your number is too high!");
                    numberOfGuesses++;

                } else if (newGuess3 < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
                }
            }
            if (numberOfGuesses >= 4) {
                Scanner newnumber4 = new Scanner(System.in);
                System.out.println("Enter your guess: ");
                int newGuess4 = newnumber4.nextInt();

                if (newGuess4 == generatedNumber) {
                    System.out.println("you guessed the correct number!!");
                    System.out.println("do you want to play again? Y/N");

                } else if (newGuess4 != generatedNumber) {
                    System.out.println("Sorry, you have ran out of chances. The correct number was: " + generatedNumber);
                    System.out.println("do you want to play again? Y/N");
                }
            }

        }
    }