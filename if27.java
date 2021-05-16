package com.company;

import java.util.Scanner;

public class if27 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float x;
        System.out.print("X = ");
        x = enter.nextFloat();
        if (x < 0)
        {
            System.out.println(0);
        }

        else if (((int) x) % 2 == 0)
        {
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }
    }
}
