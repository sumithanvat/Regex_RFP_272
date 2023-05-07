package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLatName {

    public static void main(String[] args) {
        // taking user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Last name");

        // storing input to first name
        String lastName = input.nextLine();

        // Regex pattern to match first name
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

        // Match the pattern against the input
        Matcher matcher = pattern.matcher(lastName);

        // Check if the input matches the pattern
        if (matcher.matches()) {

            System.out.println("Last name is valed");

        } else {
            System.out.println("invalid Last name");
        }
    }
}

