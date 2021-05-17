package com.company;

import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter 'a' side: ");
        int a = in.nextInt();
        System.out.print("Enter 'b' side: ");
        int b = in.nextInt();
        double P = 2 * (a + b);
        int index = 1;

        int max = (int) P;
        int min = (int) P;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter " + a + "-side: ");
            a = in.nextInt();
            System.out.print("Enter " + b + "-side: ");
            b = in.nextInt();
            P = 2 * (a + b);
            if (max <= P) {
                max = (int) P;
                index = i;
            }
        }

        System.out.println("big perimetr : " + max + " its index is " + index);
        System.out.println("small perimetr : " + min + " its index is " + index);
    }
}
