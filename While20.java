package Homework_While;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, x;
        System.out.print("N = ");
        n = in.nextInt();
        boolean bor = false;
        while (n > 0) {
            x = n % 10;
            n = n / 10;
            if (x == 2){
                bor = true;
                break;
            }

        }
        if (bor){
            System.out.println("Bor");
        }
        else {
            System.out.println("Yo'q");
        }
    }
}
