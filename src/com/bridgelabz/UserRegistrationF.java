package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Regex Problem");
        /*
        UC1: User need to enter Valid firstname
         */

        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}", "sumit");
        if (result1)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
        /*
        uc2: User need to enter Last name
         */

        Pattern pattern = Pattern.compile("^[A-Z]?[a-z]{3,}$");
        Matcher matcher = pattern.matcher("Kumar");
        Matcher matcher1 = pattern.matcher("Hanvat");
        if (matcher.matches() && matcher1.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
        /*
        Uc3:User need valid Email
         */

        boolean result3 = Pattern.matches("[a-z]{3,}[.][a-z0-9]*@[a-z]{2,}[.][a-z]{2,}[.]*[a-z]*", "skhanvat@gmail.com");
        if (result3)
            System.out.println("Valid Email Address");
        else
            System.out.println("Invalid Email Address");
        /*
        U4:User need to follow pr-defined mobile Format
         */

        System.out.print("Enter Mobile number:- ");
        String mobileNumber = sc.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher("7581800900");
        if (matcher4.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
            /*
            U5: User Need to follow pre-defined Password rules
             */

            //rule1: minimum 8 chracters
            System.out.print("Enter Mobile Password:- ");
            String password = sc.next();
            Pattern pattern5 = Pattern.compile("^[a-z]{8}$");
            Matcher matcher5 = pattern5.matcher(password);
            if(matcher5.matches()){
                System.out.println("valid password_rule1");
            }
            else {
                System.out.println("Invalid password_rule1");

                //rule2: minimum 8 chracters with atlest 1 capital chracter
                Pattern pattern6 = Pattern.compile("^[A-Za-z]{8,}$");
                Matcher matcher6 = pattern.matcher("mySecretPassword");
                if (matcher.matches())
                    System.out.println("valid password_rule2");
                else
                    System.out.println("Invalid password_rule2");

                //rule3: minimum 8 characters with atleast 1 capital character and 1 numeric word
                Pattern pattern7 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9]).{8,}$");
                Matcher matcher7 = pattern7.matcher("Pass8word");
                if (matcher7.matches())
                    System.out.println("valid password_rule3");
                else
                    System.out.println("Invalid password_rule3");

                //rule4: minimum 8 characters with atleat 1 capital character and 1 numeric word
                // and one special character
                Pattern pattern8 = Pattern.compile("^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$");
                Matcher matcher8 = pattern8.matcher("Password8*new");
                if (matcher8.matches())
                    System.out.println("valid password_rule4");
                else
                    System.out.println("Invalid password_rule4");
            }

        }
    }
}
