package com.pluralsight;

import java.time.format.DateTimeFormatter; // importing formatting for date
import java.util.Scanner; // the import from when you initiate scanner to read user input
import java.time.LocalDate; // importing LocalDate for storing dates

public class TheaterReservations {

    // creating a DateTimeFormatter to define user input to MM/dd/yyyy
    static DateTimeFormatter fullDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    public static void main(String[] args) {

        // initiate scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        // greeting the user
        System.out.println("\nHello, welcome to Theater Reservations app!");

        // asking user for first and last name. \n = new line
        System.out.print("\nPlease enter your first and last name: ");
        // creating name variable and using trim to remove any spaces
        String fullName = myScanner.nextLine().trim();

        // asking user for date \n = new line
        System.out.print("\nWhat date will you be coming? (MM/dd/yyyy): ");
        // creating a date from user input
        LocalDate date = LocalDate.parse(myScanner.nextLine().trim(),fullDateFormat);

        // asking user for number of tickets
        System.out.print("\nHow many tickets would you like? ");
        // ticket will be a number, therefore will be using "int"
        int tickets = myScanner.nextInt();

        // splitting name into parts
        String[] nameParts = fullName.split(" ");

        // creating string variables for parts of the name
        String firstName = "";
        String lastName = "";

        // checking if the name parts are equal to or greater than 2 parts
        if (nameParts.length >=2) {
            firstName = nameParts[0]; // first word, which is 0 (first name)
            lastName = nameParts[nameParts.length - 1]; // assigning the last word as the last name

        }

        String numberTicket; // creating string variable for number of tickets
        if (tickets == 1) { // if there is only 1 ticket, it'll print out as "ticket" (singular)
            numberTicket = "ticket";
        } else { // code will go down to this line if the previous line is not true
            numberTicket = "tickets"; // plural, more than 1 ticket
        }

        // create output for the entire user input by using 'concatenation'. concat = '+'
        // \n = new line
        System.out.println("\n----Confirmed! Thank you!----");
        System.out.println("\n" + tickets + " " + numberTicket + " reserved for " + date + " under " + lastName + ", " + firstName);

    }
}
