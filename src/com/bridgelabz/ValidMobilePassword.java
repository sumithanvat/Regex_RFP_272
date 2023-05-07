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
        Pattern pattern4 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher4 = pattern4.matcher(mobilePassword);
        if (matcher4.matches()) {
            System.out.println("valid Rule 1");
        } else {
            System.out.println("Invalid Rule 1");
        }
    }
}

