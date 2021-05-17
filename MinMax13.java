package com.company;

import java.util.Scanner;

public class MinMax13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter 1-number: ");
        int a = in.nextInt();
        int big = a;
        int index = 1;

        int last = 1;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter " + i + "-number: ");
            a = in.nextInt();
            if (a % 2 != 0) {
                if (a > big) {
                    big = a;
                    index = i;
                }
            }
        }
        System.out.println("the first big odd number is " + big + ", its index is " + index);
    }
}
