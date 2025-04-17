package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // initiate scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        // instructing user how to enter full name with two different formats
        // \n = new line
        System.out.println("\nPlease enter your name in one of the following two formats:");
        System.out.println("first last OR first middle last (i.e: Jane Doe or Jane Anne Doe)");

        // prompt user to enter their full name, \n = new line
        System.out.print("\nEnter full name: ");
        // reading user input and using trim to remove leading/trailing spaces
        // creating variable for full name
        String fullNameInput = myScanner.nextLine().trim();

        // split the input into parts wherever there is a space
        // creating variable for the name parts
        // string[] holds multiple string values
        String[] nameParts = fullNameInput.split(" ");

        // creating variables to hold first, middle, and last name
        String firstName = ""; // to hold first name, creating variable for first name
        String middleName = "(none)"; // default to "(none)" in case no middle name, creating variable for middle name
        String lastName = ""; // to hold last name, creating variable for last name

        // code will check what to do next based on user input
        if (nameParts.length == 2) { // if there are exactly 2 parts, first & last name
            firstName = nameParts[0]; // first word, which is 0 (first name)
            lastName = nameParts[1]; // second word, which is 1 (last name)
        } else if (nameParts.length == 3) { // if there are exactly 3 parts, first, middle, & last name
            firstName = nameParts[0]; // first word, which is 0 (first name)
            middleName = nameParts[1]; // second word, which is 1 (middle name)
            lastName = nameParts[2]; //  third word, which is 2 (last name)
        }

        // output each part of the name
        System.out.println("\nFirst name: " + firstName); // displays first name
        System.out.println("Middle name: " + middleName); // displays middle name
        System.out.println("Last name: " + lastName); // displays last name

    }
}
