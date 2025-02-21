/*
Author: Paul Leishman
Class:  CS 113 Programming in Java
Date:   2/21/25
 */

import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input of feet
        System.out.print("Enter the number of feet: ");
        double feet = scanner.nextDouble();

        // Convert input of feet to meters
        double meters = feet * 0.305;

        // Display the result
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}

/*
JDK18>javac Exercise02_03.java
Compiled successful

JDK18>java Exercise02_03
Enter the number of feet: 16.5
16.5 feet is equal to 5.0325 meters.

JDK18>
 */