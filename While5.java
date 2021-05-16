package Homework_While;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);

        int n, k = 0;
        System.out.print("2 - ning qandaydir darajasini kiritng\nn = ");
        n = kirit.nextInt();

        while (n > 1){
            if ((n / 2 ) * 2 != n){
                System.out.println("Bu son 2 ning darajasi emas");
                System.exit(0);

            }
            else{
                n = n / 2;
                k++;
            }

        }
        System.out.println("Bu son 2 ning "+k+" darajasi");



    }
}
