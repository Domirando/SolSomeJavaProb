package Homework_While;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, s = 0, oxir, k = 0;
        System.out.print("N = ");
        n= in.nextInt();

        while (n > 0){
            oxir = n % 10;
            s+= oxir;
            n/=10;
            k++;
        }

        System.out.println("Raqamlar yig'indisi: " + s);
        System.out.println("Raqamlar soni: " + k);

    }
}
