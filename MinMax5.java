package com.company;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        System.out.print("Enter number 'm': ");
        int m = in.nextInt();

        System.out.print("Enter number 'v': ");
        int v = in.nextInt();

        int big = m / v;

        for (int i = 2; i <= n; i++) {
            System.out.print("enter " + i + "-number 'm'");
            m = in.nextInt();

            System.out.print("enter " + i + "-number 'v'");
            v = in.nextInt();

            if ((m / v) > big) {
                big = (m / v);
            }
        }
        System.out.println("large density is: " + big);
    }
}
