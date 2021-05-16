package com.company;

import java.util.Scanner;

public class if26 {

    public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter a number (x): ");
	float x = keyboardInput.nextFloat();
	if (x<=0){
        System.out.println("x is less than or equal to 0 so x =  "+x);
    } else if(0<x && x<2){
        System.out.println("x is bigger than 0 and less than 2, so x =  "+Math.pow(x, 2));
    } else if(x>=2){
        System.out.println("x is bigger than or equal to 2, so x =  "+4);
    }
    }
}
