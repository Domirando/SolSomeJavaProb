package Homework_While;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        System.out.print("n:  ");
        int n = kirit.nextInt();

        int k = n;

        while (!(k*k<=n)){
            k--;
        }
        System.out.println("natija "+k);
        
    }
}
