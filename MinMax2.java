package com.company;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter 'a' side: ");
        int a = in.nextInt();
        System.out.print("Enter 'b' side: ");
        int b = in.nextInt();
        double S = a * b;
        int index = 1;

        int max = (int) S;
        int min = (int) S;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter " + a + "-side: ");
            a = in.nextInt();
            System.out.print("Enter " + b + "-side: ");
            b = in.nextInt();
            S = a * b;
            if (max <= S) {
                max = (int) S;
                index = i;
            }
        }

        System.out.println("large surface: " + max + ", its index:  " + index);
        System.out.println("small surface : " + min + ", its index: " + index);
    }
}
