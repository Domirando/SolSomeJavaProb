package com.company;
import java.util.Scanner;
public class arr48 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 1, 4, 9, 6, 5, 9, 7, 6, 0, 6, 7, 6};

        int count = 0, occur = 0, high = 0, a;
        // Finding the length of array 'arr'
        int length = arr.length;

        // Sorting an array
        for (int j = 0; j < length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }

//        finding the most popular
        for (a = 1; a < arr.length; a++) {
            if (arr[a - 1] == arr[a]) {
                count++;
                if (count > occur) {
                    occur = count;
                    high = arr[a];
                }
            } else {
                count = 0;
            }
        }

//        Count number of occurrences in a sorted array
        int res = 0;
        int n = arr.length;
        for (int i=0; i<n; i++)
            if (high == arr[i])
                res++;
        System.out.println(res+"; "+arr[0]);
    }
}
