package com.ps;

import java.util.Scanner;
import java.text.DecimalFormat;

public class NumberFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        double number = scanner.nextDouble(); // scanner portion that reads input

        // Format the # to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedNumber = df.format(number);

        // output the formatted number
        System.out.println( "Formatted number:" + formattedNumber);

        scanner.close();

    }

}


