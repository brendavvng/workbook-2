package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // initiating scanner to read user input
    static Scanner myScanner = new Scanner(System.in);

    // adding main method to application, applicable only for applications
    public static void main(String[] args) {

        // creating cell phone / variable
        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number? ");
        String serialNumber = myScanner.nextLine();

        System.out.println("What is the model of the phone? ");
        String model = myScanner.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = myScanner.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        // set the cell phone data on the object
        myPhone.setSerialNumber( Integer.parseInt(serialNumber) );
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // creating a new line to separate info
        System.out.println("\n");

        // use the getters to display the info
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

    }
}
