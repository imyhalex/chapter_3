package edu.nyu.cs.exercise_03_09;

import java.util.Scanner;

public class Exercise0309 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String isbnInString;
        int digit, total = 0, castTotal;

        System.out.print("Please enter the first 9 digit of an ISBN as integer: ");
        isbnInString = input.nextLine();

        // A for loop to iterate throught the each digit within ISBN
        for (int i = 1; i <= isbnInString.length(); i++) {
            digit = isbnInString.charAt(i - 1) - '0'; // in converting the integer from 0-9, we can do the ascii opeartion by subtracting '0'
            total += digit * i;
        }

        castTotal = total % 11;

        if (castTotal == 10) isbnInString = isbnInString + "X";
        else isbnInString = isbnInString + castTotal;

        System.out.println("The ISBN-10 number is: " + isbnInString);
        input.close();

    }
    
}
