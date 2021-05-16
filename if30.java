package com.company;

import java.util.Scanner;

public class if30 {

    public static void main(String[] args) {
        int x, count = 0;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = keyboardInput.nextInt();
        while (x>0){
            x/=10;
            count+=1;
        }
        System.out.println("Number of Digits in a number which you entered = " + count);
    }
}
