package com.company;

import java.util.Scanner;

public class switch10 {

    public static void main(String[] args) {
        String direction;
        int command;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a direction: ");
        direction = keyboardInput.nextLine();
        Scanner keyboardInput2 = new Scanner(System.in);
        System.out.print("Enter a command to move: ");
        command = keyboardInput2.nextInt();
        switch (direction) {
            case "north":
                System.out.print("Your direction is north!");
                break;
            case "east":
                System.out.print("Your direction is east!");
                break;
            case "south":
                System.out.print("Your direction is south!");
                break;
            case "west":
                System.out.print("Your direction is west!");
                break;
        }
        switch (command) {
            case 0:
                System.out.print(" 0-Keep this going!");
                break;
            case 1:
                System.out.print(" 1-Turn left!");
                break;
            case 2:
                System.out.print(" 2-Turn right!");
                break;
        }
    }
}

