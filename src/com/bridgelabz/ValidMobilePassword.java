package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobilePassword {

    public static void main(String[] args) {
        // taking user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Mobile Password ");
        String mobilePassword = input.next();
        //rule3: minimum 8 chracters with atleat 1 capital chracter and 1 numeric word and 1 special charactor
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(?=\\\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(mobilePassword);
        if (matcher.matches()) {
            System.out.println("valid Rule 3 ");
        } else {
            System.out.println("Invalid Rule 2");

        }
    }
}

