package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeNumberArray {

    public static void main(String[] args) {

        System.out.println("Add array size");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Add array elements");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        //find second max element
        int firstLarge, secondLarge;
        if (arr[0] > arr[1]) {
            firstLarge = arr[0];
            secondLarge = arr[1];
        } else
            firstLarge = arr[1];
        secondLarge = arr[0];
        for (int j = 2; j <= arr.length - 1; j++) {
            if (arr[0] < arr[j]) {
                firstLarge = arr[j];
                secondLarge = arr[0];
            } else if (arr[0] > arr[j] && arr[1] < arr[j]) {
                secondLarge = arr[j];
            }
        }
        System.out.println(secondLarge);
    }
}