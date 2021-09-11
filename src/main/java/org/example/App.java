/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program is made to compute the tax on an order amount.
// The program prompts for the order amount and the state.
// If the state is “WI,” then the order is charged 5.5% tax.
// The program displays the subtotal, tax, and total
// for Wisconsin residents but displays just the total for non-residents.

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // use a decimal formatter in order to round decimal numbers accordingly
        DecimalFormat df = new DecimalFormat("#.00");

        // variables declaration
        double tax = 0, initial = 0, amount = 0;
        String State;

        // prompt the user for the order amount adn store it accordingly
        System.out.print("What is the order amount? ");
        initial = Double.valueOf(scanner.nextLine());

        // prompt the user for the state
        System.out.print("What is the state? ");
        State = scanner.nextLine();

        // check if the state is not "WI
        if (!State.equals("WI")) {

            System.out.printf("The total is $%.2f", initial);
            return;

        }

        // calculate the tax and the final amount using tax and initial
        tax = (5.5 / 100);
        amount = initial;
        amount += (amount * tax);

        // output according to the format specified by the assignment
        System.out.printf("The subtotal is $" +df.format(initial) + ".\n" + "The tax is $"+Math.round((initial*tax) * 100.0) / 100.0+".\n"+ "The total is $"+Math.round(amount * 100.0) / 100.0+".");

    }

}