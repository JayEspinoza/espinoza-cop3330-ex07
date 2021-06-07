/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 7 - Mad Lib
 *  Create a program that calculates the area of a room. Prompt the user for the length and
 *  width of the room in feet. Then display the area in both square feet and square meters.
 *
 *  Constraint:
 *  Keep the calculations separate from the output.
 *  Use a constant to hold the conversion factor.
 *
 */

package ex07;
import java.util.Scanner;

public class base {
    // Constant conversion
    public static double constant = 0.09290304;

    public static void main(String [] args)
    {
        // Variable initialization
        Scanner userInput = new Scanner(System.in);
        int length, width, feet;
        double meters;

        // User Input Step
        System.out.printf("What is the length of the room in feet? ");
        length = userInput.nextInt();

        System.out.printf("What is the width of the room in feet? ");
        width = userInput.nextInt();

        // Output
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is ");

        // Calculations separate from output
        feet = length * width;
        meters = (double)feet * constant;

        // Output continued
        System.out.println(feet + " square feet");
        System.out.printf("%.3f square meters", meters);

    }
}
