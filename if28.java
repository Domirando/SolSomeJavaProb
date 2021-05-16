package com.company;

import java.util.Scanner;

public class if28 {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = keyboardInput.nextInt();

        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println("The year is a Kabisa year");
        } else
        if (year % 4 == 0 && year%100!=0 ) {
            System.out.println("The year is a Kabisa year");
        } else {
            System.out.println("The year is`n a Kabisa year");
        }
    }
    }

