package Homework_While;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        int n, k;
        System.out.print("Bo'linuvchini kiriting: ");
        n = kirit.nextInt();
        System.out.print("Bo'luvchini kiriting: ");
        k = kirit.nextInt();

        int sana = 0;

        while (n >= k)
        {
            n = n - k;
            sana++;
        }
        System.out.println("Bo'linma: " + sana);
        System.out.println("Qoldiq: " + n);

    }
}
