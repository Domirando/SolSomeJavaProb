package Homework_While;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k = 0;
        System.out.print("N = ");
        n = in.nextInt();

        while (3 <= n){
            n /= 3;
            k++;
        }
        System.out.println("K = " + k);
    }
}
