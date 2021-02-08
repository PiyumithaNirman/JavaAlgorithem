package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        System.out.println("Add array size");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Add array elements");

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j <= arr.length - 1; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
