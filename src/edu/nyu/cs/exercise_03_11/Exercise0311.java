package edu.nyu.cs.exercise_03_11;

import java.util.Scanner;

public class Exercise0311 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, month;

        System.out.print("Please enter the year: ");
        year = Integer.parseInt(input.nextLine());
        System.out.print("Please also enter the month: ");
        month = Integer.parseInt(input.nextLine());

        // Check for the leap year if the month is 2

        // Create a switch case
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month in " + year + " has 31 days." );
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month in " + year + "has 30 days");
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("This month in " + year + " has 29 days (leap year)");
                } else {
                    System.out.println("This month in " + year + " has 28 days.");
                }
                break;
            default:
                System.out.print("Invalid month");
                break;
        }


        input.close();

    }
}
