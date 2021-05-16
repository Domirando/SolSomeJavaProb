package Homework_While;

import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k = 0, s = 0;
        System.out.print("N = ");
        n = in.nextInt();

        while (s < n)
        {
            k++;
            s += k;
        }
        if (s > n){
            s -= k--;
        }

        System.out.println("k = " + k);
        System.out.println("s = " + s);
    }
}
