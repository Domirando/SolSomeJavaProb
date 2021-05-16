package Homework_While;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k = 0, s = 0;
        System.out.print("N = ");
        n = in.nextInt();
        // s bu k gacha bo'lgan sonlar yig'indisi
        while (s < n){
            k++;
            s += k;
        }
        System.out.println("k = " + k);
        System.out.println("s = " + s);

    }
}
