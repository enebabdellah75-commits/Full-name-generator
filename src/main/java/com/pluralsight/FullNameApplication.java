package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        //creat scanner
        Scanner namescanner =new Scanner(System.in);

        //Print enter your name
        System.out.println("please enter your name");
        System.out.println("First Name:  ");

        //store the first name they provide
        String fistname =namescanner.nextLine();

        //store the middle name
        System.out.println("Middle Name:  ");
        String Middlename =namescanner.nextLine();

        System.out.println("Last Name:  ");
        String lastname =namescanner.nextLine();

        System.out.println("suffix:  ");
        String suffix =namescanner.nextLine();

        // Start with the first name
        String fullName = fistname;

        // Add the middle name if provided
        if (!Middlename.isEmpty()) {
            fullName += " " + Middlename;
        }
        // Add the last name
        fullName += " " + lastname;


        // Add a comma and suffix if provided
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Display the full name
        System.out.println("Full name: " + fullName);

        namescanner.close();



    }
}
