package com.pluralsight;

public class WhileLoop {

    public static void main(String[] args) {

        // goal is to print "I love Java" 5 times
        String printText = "I love Java";
        // creating variable "number" to start at 0
        int number = 0;
        // "I love Java" will print 5 times, therefore storing value 5 in repeatedText
        int repeatedText = 5;


        // while loop will repeat "I love Java" if condition above is true, this is an action
        // 0 < 5 - this is true
        while (number < repeatedText) {
            // displaying the content of printText which is "I love Java"
            System.out.println(printText);

            // the number (0) is increasing the count by 1, until it reaches 5
            number++;
        }


    }
}
