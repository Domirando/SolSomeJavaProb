package com.company;

import java.util.Scanner;

public class arr46 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("R = ");
        int R = in.nextInt();
        for (int i=0; i<arr.length; i++){
            System.out.print("");
            arr[i] = in.nextInt();
        }
        int res_l=0, res_r=0;

        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        while (r > l)
        {
            if (Math.abs(arr[l] + arr[r] - R) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - R);
            }

            if (arr[l] + arr[r] > R)
                r--;
            else // Move to larger values
                l++;
        }

        System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]);

    }
}
