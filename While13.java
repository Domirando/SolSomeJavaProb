package Homework_While;

import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, k = 0, s = 0;
        System.out.print("A = ");
        a = in.nextFloat();

        // s == a bo'lsa sikl bajarilmaydi chunki masala shartida shunaqa

        while (s < a){
            k++;
            s = s + (1 / k);
        }
        System.out.println("k = " + k);
        System.out.println("s = " + s);

    }
}
