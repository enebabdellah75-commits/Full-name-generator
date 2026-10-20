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

        //store the middel name
        System.out.println("Middle Name:  ");
        String Middlename =namescanner.nextLine();

        System.out.println("Last Name:  ");
        String lastname =namescanner.nextLine();

        System.out.println("suffix:  ");
        String suffix =namescanner.nextLine();

        //

    }
}
