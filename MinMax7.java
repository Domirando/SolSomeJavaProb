package com.company;

import java.util.Scanner;

public class MinMax7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter 1-number: ");
        int a = in.nextInt();
        int small = a;
        int index = 1;

        int big = a;
        int bigEx = 1;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter " + i + "-number: ");
            a = in.nextInt();
            if (a > small) {
                big = a;
                index = i;
            }
            if (a < big) {
                small = a;
                bigEx = i;
            }
        }
        System.out.println("the small 1-number is " + small + " its index is " + index);
        System.out.println("the last big number is " + big + " its index is " + index);
    }
}
