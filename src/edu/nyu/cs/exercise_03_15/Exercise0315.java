package edu.nyu.cs.exercise_03_15;

import java.util.Scanner;

public class Exercise0315 {
    
    public static void main(String[] args) {
        // Generate a lottery
        int lottery = (int)(100 + Math.random() * 900); // generate number between 100 and 999

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100; // contains tens and ones
        int lotteryDigit3 = lotteryDigit2 / 10; // get ones
        lotteryDigit2 %= 10; // get tens

        // Get digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100;
        int guessDigit13 = guess / 10;
        guessDigit2 %= 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess == lottery)
        System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit13 == lotteryDigit3)
        System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
        || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
        || guessDigit13 == lotteryDigit1 || guessDigit13 == lotteryDigit2 || guessDigit13 == lotteryDigit3)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match"); 

        input.close();
    }

}
