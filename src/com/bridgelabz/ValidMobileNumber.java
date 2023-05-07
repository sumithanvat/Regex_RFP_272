package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {

    public static void main(String[] args) {
        // taking user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Mobile number ");
        String mobileNumber = input.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher(mobileNumber);
        if (matcher4.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

