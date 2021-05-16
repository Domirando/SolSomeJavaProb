package com.company;

import java.util.Scanner;

public class if29 {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number (x): ");
        float x = keyboardInput.nextFloat();
        if (x%2==0){
            if (x<0){
                System.out.println("The number which you entered is negative and even number!");
            } else if (x>0){
                System.out.println("The number which you entered is positive and even number!");
            }
        } else if (x%2!=0){
            if (x<0){
                System.out.println("The number which you entered is negative and uneven(odd) number!");
            } else if (x>0){
                System.out.println("The number which you entered is positive and uneven(odd) number!");
            }
        } else if(x==0){
            System.out.println("The number which you entered is equal to 0!");
    }
    }
}
