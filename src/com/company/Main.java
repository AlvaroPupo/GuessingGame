package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. Allow user input of a number(guess)
        //2. Tell the user if their guess is too high or too low
        //3. Allow for 5 chances, is the number isn't guessed tell them what it is
        //4. If the number is guessed, congratulate them
        //5. Allow the user play again if they would like.

        Scanner input = new Scanner(System.in);
        int numberOfGuesses = 0;
        final int MAX_GUESS_COUNT = 4;

        System.out.println("Enter your guess: ");
        int userGuess = input.nextInt();

        int generatedNumber = (int) Math.ceil(Math.random() * 100);

        do {
            if (userGuess > generatedNumber) {
                System.out.println("Your number is too high!");
                numberOfGuesses++;
            } else if (userGuess < generatedNumber) {
                System.out.println("Your number is too low");
                numberOfGuesses++;
            } else if (userGuess == generatedNumber){
                System.out.println("you guessed the correct number!!");
            } else if (numberOfGuesses == MAX_GUESS_COUNT){
                System.out.println("Sorry, you have ran out of chances. The correct number was: " + generatedNumber);
            }
        } while (numberOfGuesses <= 4);

    }

}
