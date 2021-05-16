package Homework_While;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b = 10, sana = 0, p;

        System.out.print("P = ");
        p = in.nextFloat();

        while (200 >= b){
            b += (b * p / 100);
            sana++;
        }
        System.out.println("Kunlar soni = " + (int)sana);
        System.out.println("Masofa = " + (int) b);

    }
}
