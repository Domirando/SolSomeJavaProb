package com.company;

import java.util.Scanner;

public class switch15 {

    public static void main(String[] args) {
        int type, value;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number of type (between 1 and 4): ");
        type = keyboardInput.nextInt();
        Scanner keyboardInput2 = new Scanner(System.in);
        System.out.print("Enter a value (between 6 and 14): ");
        value = keyboardInput2.nextInt();

        switch (value) {
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 10:
                System.out.print("Ten ");
                break;
            case 11:
                System.out.print("Valet ");
                break;
            case 12:
                System.out.print("Drama ");
                break;
            case 13:
                System.out.print("King ");
                break;
            case 14:
                System.out.print("Tuz ");
                break;
        }
        switch (type) {
            case 1:
                System.out.print("brick!");
                break;
            case 2:
                System.out.print("apple!");
                break;
            case 3:
                System.out.print("willowcrow!");
                break;
            case 4:
                System.out.print("crow!");
                break;
        }

    }
}
