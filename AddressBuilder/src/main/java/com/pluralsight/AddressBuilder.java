package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        // initialize scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        // initialize string builder - this adds pieces of text together
        // customerInfo = variable
        StringBuilder customerInfo = new StringBuilder();
        // below, append method will be used. it means to add something to the end of something else. (i.e; a list)

        // requesting user to provide requested info
        System.out.println("Please provide the following information below: ");



        // requesting user for full name
        System.out.print("Full name: ");
        // creating variable for user input, which would be the name
        // trim = used to remove any extra spaces
        String fullName = myScanner.nextLine().trim();
        // append full name to string builder and then append a new line to move to new line
        customerInfo.append(fullName).append("\n");
        // \n for new line
        System.out.print("\n");

        // requesting for billing street info, \n to create new line
        System.out.print("Billing Street: ");
        // creating variable for billing street info, user input
        // trim = used to remove any extra spaces
        String billingStreet = myScanner.nextLine().trim();
        // append billing address to string builder, also adding a new line after
        // append the billing street followed by another new line
        customerInfo.append("\nBilling Address:\n").append(billingStreet).append("\n");

        // requesting for billing city info
        System.out.print("Billing City: ");
        // creating variable for billing city info, user input
        // trim = used to remove any extra spaces
        String billingCity = myScanner.nextLine().trim();
        // append the billing city to string builder, also adding a comma and a space
        customerInfo.append(billingCity).append(", ");

        // requesting for billing state info
        System.out.print("Billing State: ");
        // creating variable for billing state info, user input
        // trim = used to remove any extra spaces
        String billingState = myScanner.nextLine().trim();
        // append billing state info to the string builder followed by a space
        customerInfo.append(billingState).append(" ");

        // requesting for billing zip info
        System.out.print("Billing Zip: ");
        // creating variable for billing zip info, user input
        // trim = used to remove any extra spaces
        String billingZip = myScanner.nextLine().trim();
        // append the billing zip code to string builder followed by new line
        customerInfo.append(billingZip).append("\n");

        // \n for new line
        System.out.print("\n");

        // requesting for shipping street info
        System.out.print("Shipping Street:  ");
        // creating variable for shipping street info, user input
        // trim = used to remove any extra spaces
        String shippingStreet = myScanner.nextLine().trim();
        // append the string label "shipping address" followed by a new line
        // append the shipping street and also adding another new line
        customerInfo.append("\nShipping Address:\n").append(shippingStreet).append("\n");

        // requesting for shipping city info
        System.out.print("Shipping City:  ");
        // creating variable for shipping city info, user input
        // trim = used to remove any extra spaces
        String shippingCity = myScanner.nextLine().trim();
        // append the shipping city to string builder followed by a comma and a space
        customerInfo.append(shippingCity).append(", ");

        // requesting for shipping state info
        System.out.print("Shipping State:  ");
        // creating variable for shipping state info, user input
        // trim = used to remove any extra spaces
        String shippingState = myScanner.nextLine().trim();
        // append the shipping state info to string builder followed by a space
        customerInfo.append(shippingState).append(" ");

        // requesting for shipping zip info
        System.out.print("Shipping Zip:  ");
        // creating variable for shipping zip info, user input
        // trim = used to remove any extra spaces
        String shippingZip = myScanner.nextLine().trim();
        // append shipping zip info and adding a new line after
        customerInfo.append(shippingZip).append("\n");

        // printing out text
        System.out.print("\n");
        System.out.println("Customer Information:");
        System.out.println("---------------------");
        // now converting string builder pieces to get results using toString()
        System.out.println(customerInfo.toString());


    }
}
