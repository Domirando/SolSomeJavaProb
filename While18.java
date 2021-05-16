package Homework_While;

import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Raqam kiring: ");
        int number = in.nextInt(),
                k = 0;

        while(number != 0) {

            int d = number % 10;
            k = k * 10 + d;
            number /= 10;
        }

        System.out.println("Natija: " + k);
    }
}
