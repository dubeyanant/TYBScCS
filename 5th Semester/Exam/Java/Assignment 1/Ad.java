package com.anant.ass1;

import java.util.Arrays;
import java.util.Scanner;

public class Ad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements of the array : ");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();

        System.out.println("Entered array is : " + Arrays.toString(arr));

        reverse(arr, size);

        System.out.println("Reversed array is : " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
    }
}
