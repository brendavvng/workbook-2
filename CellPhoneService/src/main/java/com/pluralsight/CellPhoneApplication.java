package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // initiating scanner class to read user input
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
        myPhone.setSerialNumber(Integer.parseInt(serialNumber));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // creating a new line to separate info
        System.out.println("\n");

        // use the getters to display the info
//        System.out.println("Serial Number: " + myPhone.getSerialNumber());
//        System.out.println("Model: " + myPhone.getModel());
//        System.out.println("Carrier: " + myPhone.getCarrier());
//        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
//        System.out.println("Owner: " + myPhone.getOwner());


        // creating new phone
        CellPhone burnerPhone = new CellPhone();
        burnerPhone.setPhoneNumber("888-123-4567");
        burnerPhone.setSerialNumber(32421);
        burnerPhone.setOwner("Winnie Miffy Diana Thumbelina");
        burnerPhone.setModel("iPhone 13 Pro Max");
        burnerPhone.setCarrier("Verizon");

        // new phone for 3rd exercise
        CellPhone thirdPhone = new CellPhone(11234, "iPhone 15", "ATT", "972-111-2222", "Kai Choco Vang");
        display(thirdPhone);


        System.out.println("------info for myPhone------");
        // use the display method instead
        display(myPhone);

        System.out.println("\n");

        System.out.println("------info for burnerPhone------");
        // use the display method instead
        display(burnerPhone);

        System.out.println("\n");

        // have phone call the burner
        myPhone.dial(burnerPhone.getPhoneNumber());

        // have burner call myPhone
        burnerPhone.dial(myPhone.getPhoneNumber());
    }

    // this method knows how to display the information for a phone - added in exercise 2
        static void display(CellPhone phone){
            System.out.println("Serial Number " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: "+ phone.getCarrier());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());

    }
}
