package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // initiate scanner to read user input
        Scanner myScanner = new Scanner(System.in);


        // added " \n " to start a new line before the print & prompt user for name
        System.out.println("\nPlease enter name in one of the following two formats:");
        System.out.println("first last OR first middle last (i.e: Jane Doe)");

        // added " \n " to start a new line before the print
        System.out.print("\nEnter name: ");
        // use trim for removing leading & trailing spaces from string
        String fullName = myScanner.nextLine().trim();

        // creating variables for the parts of the names
        String firstName = " ";
        String middleName = " ";
        String lastName = " ";

        

    }
}
