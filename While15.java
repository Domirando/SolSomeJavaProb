package Homework_While;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float s, p, bosh;
        int oy = 0;

        System.out.print("Boshlang'ich summani kiriting = ");
        s = in.nextFloat();

        System.out.print("Oshish foizini kiriting = ");
        p = in.nextFloat();

        bosh = 2 * s;
        p /= 100;

        while (s < bosh){
            s += s * p;
            oy++;
            System.out.println(oy + " - oy\t" + s);
        }
        System.out.println("Oy = " + oy);
        System.out.println("summa = " + s);
    }
}
