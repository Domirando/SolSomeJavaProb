package com.company;

import java.util.Scanner;

public class switch9 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int d, m;

        System.out.print("d = ");
        d = k.nextInt();
        System.out.print("m = ");
        m = k.nextInt();

        d++; // next day

        switch (m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 31)
                {
                    d = 1;
                    m++;
                }
                break;

            case 2: // fevral 28 kun bo'lgani uchun martga oshiramiz
                if (d > 28)
                {
                    d = 1;
                    m++;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11: // 30 dan katta bo'lsa oyni oshirish
                if (d > 30)
                {
                    d = 1;
                    m++;
                }
                break;
            default:
                System.out.print("Please enter month correctly:(");


                m %= 12;
                switch (m)
                {
                    case 1:
                        System.out.print(d + "-January"); break;
                    case 2:
                        System.out.print(d + "-February"); break;
                    case 3:
                        System.out.print(d + "-March"); break;
                    case 4:
                        System.out.print(d + "-April"); break;
                    case 5:
                        System.out.print(d + "-May"); break;
                    case 6:
                        System.out.print(d + "-June"); break;
                    case 7:
                        System.out.print(d + "-July"); break;
                    case 8:
                        System.out.print(d + "-August"); break;
                    case 9:
                        System.out.print(d + "-September"); break;
                    case 10:
                        System.out.print(d + "-October"); break;
                    case 11:
                        System.out.print(d + "-November"); break;
                    case 12:
                        System.out.print(d + "-December"); break;

                }
        }


    }
}
