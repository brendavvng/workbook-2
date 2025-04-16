package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // initiate scanner to read user input
     Scanner myScanner = new Scanner(System.in);

        // added " \n " to start a new line, before and after the print
        System.out.println("\nPlease enter your name below.\n");

        // ask user for their first name
        System.out.print("First name: ");
        // get user input before moving on to next line
        // use trim for removing leading & trailing spaces from string
        String firstName = myScanner.nextLine().trim();

        // ask user for middle name, can be optional
        System.out.print("Middle name (if N/A, press enter): ");
        // get user input before moving on to next line
        // use trim for removing leading & trailing spaces from string
        String middleName = myScanner.nextLine().trim();
        // if user hits 'enter', trim helps avoid the spaces

        // ask user for last name
        System.out.print("Last name: ");
        // get user input before moving on to next line
        // use trim for removing leading & trailing spaces from string
        String lastName = myScanner.nextLine().trim();

        // ask user for suffix
        System.out.print("Suffix (if N/A, press enter): ");
        /* get user input before moving on to next line
        use trim for removing leading & trailing spaces from string */
        String suffixName = myScanner.nextLine().trim();
        // if user hits 'enter', trim helps avoid the spaces


        // starts off building the string full name with just the first name
        String fullName = firstName;


        /* checking if middle name is empty
        .isEmpty() checks if the string has no characters
        ! = NOT, so this means if middle name is NOT empty
        code will run everything inside curly braces only if condition is true since middle name is optional
        " " is adding a space to the name */
        if (!middleName.isEmpty()) {
            // I.E: "Brenda" (first name) + "S." (middle name) = "Brenda S."
            fullName += " " + middleName;
        }

        // now adding the last name to whatever is in "fullName"
        // I.E: "Brenda S." + "Vang" (last name) = "Brenda S. Vang"
        // " " is adding a space to the name
        fullName += " " + lastName;


        /* checking if suffix is empty
        if the suffix is NOT empty, it will add a comma to the full name
        ! = NOT, so this means if suffix name is NOT empty
        code will run everything inside curly braces only if condition is true since suffix is optional
        " " is adding a space to the name */
        if (!suffixName.isEmpty()) {
            fullName += ", " + suffixName;
        }

        // adding in dashes to create separation
        // added " \n " to start a new line before and after the dashes
        System.out.println("\n----------------------------\n");

        // this prints the output / final result
        // I.E: Full Name: "Brenda S. Vang"
        System.out.println("Full name: " + fullName);

    }
}
