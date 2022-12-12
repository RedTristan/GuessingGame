/**
 * The CardGame is a simple guessing game that lets the user guess the next possible randomly
 * generated card. The possible numbers are 1-20
 * @author Tristan Hsu
 * @version final
 * @since 2022-12-11
 */
import java.util.Random;

import java.util.Scanner;

public class CardGame {

    public static void main(String[] args)
    {
        int count = 0;
        //Introduction to game
        System.out.println("This is a game where you need to guess if the next following card");
        System.out.println("is going to be higher, lower, or the same as the current card.");
        System.out.println();
        System.out.println("In this game, the possible numbers are 1-20. ");
        System.out.println("The goal is to guess correctly 3 times.");
        System.out.println("If you guess wrong, you lose a point\n(Does not completely reset points)");
        System.out.println("New random numbers are created after each guess.");
        System.out.println();

        Card card = new Card();

        //starts a counter to determine when you reach 3 points
        while (count < 3) {
            //calls the getCard method
            int card1 = card.getCard(1);
            int card2 = card.getCard(2);
            //calls judgement
            String result = card.judgement();
            System.out.println();
            System.out.println("The current card's number is: " + card1);
            System.out.print("Guess if the next number is higher, lower or a tie: ");
            //Asks for user input
            Scanner input = new Scanner(System.in);
            String guess = input.nextLine();
            //Allows user to put uppercase or lowercase (doesn't matter which one)
            if (guess.toLowerCase().equals(result)) {
                System.out.println("Correct! The new number is " + card2);
                count ++;
            } else {
                System.out.println("Incorrect. The new number is " + card2);
                //only decreases the counter if higher than 0 (no negatives)
                if (count > 0) {
                    count --;
                }
            }
            //updates the point tally everytime you guess
            System.out.println("You now have " + count + " point(s)");
        }
        System.out.println("\nCongrats! You finished the game :)");
    }

}