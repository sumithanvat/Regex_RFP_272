package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

    public static void main(String[] args) {
        // taking user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Email");

        // storing input to Email
        String Email = input.nextLine();

        // Regex pattern to match first name
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");

        // Match the pattern against the input
        Matcher matcher = pattern.matcher(Email);

        // Check if the input matches the pattern
        if (matcher.matches()) {

            System.out.println("Email is valed");

        } else {
            System.out.println("invalid Email");
        }
    }
}

