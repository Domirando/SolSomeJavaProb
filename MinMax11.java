package com.company;

import java.util.Scanner;

public class MinMax11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter 1-number: ");
        int a = in.nextInt();
        int big = a;
        int index = 1;

        int lastEx = a;
        int last = 1;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter " + i + "-number: ");
            a = in.nextInt();
            if (a >= big) {
                big = a;
                index = i;
            }
            if (a <= lastEx) {
                lastEx = a;
                last = i;
            }
        }
        if (index > last) {
            System.out.print("last extreme number is: " + big + "\nits index is: " + index);
        } else {
            System.out.print("last extreme number is: " + big + "\nits index is: " + last);
        }
    }
}
