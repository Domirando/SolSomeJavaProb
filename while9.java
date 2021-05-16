package Homework_While;

import java.util.Scanner;

public class while9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k = 0, daraja = 1;
        System.out.print("N = ");
        n = in.nextInt();

        while (!(daraja > n)){
            daraja *= 3;
            k++;
        }
        System.out.println("K = " + k);
    }
}
