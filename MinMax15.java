package com.company;

import java.util.Scanner;

public class MinMax15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int b = in.nextInt();
        System.out.println("Enter a positive integer: ");
        int c = in.nextInt();
        int a = 0;
        int big = b;
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter " + i + "-number: ");
            a = in.nextInt();
            if (b < a && c > a && big < a) {
                big = a;
                index = i;
            }
        }
        if (index == 0) {
            System.out.println("00");
        } else {
            System.out.println(index + " - index \nnumber - " + big);
        }
    }
}
