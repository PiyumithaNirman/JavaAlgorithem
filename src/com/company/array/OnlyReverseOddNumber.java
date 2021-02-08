package com.company.array;

import java.util.Arrays;

public class OnlyReverseOddNumber {

    public static void main(String[] args) {

        int[] arr = {2, 32, 41, 57, 84, 37, 73, 58};

        int i = 0;
        int j = arr.length;
        while (i < j) {
            if (((arr[i] % 2) == 1) && ((arr[j] % 2) == 1)) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if ((arr[i] % 2) == 0) {
                i++;
            } else if ((arr[j] % 2) == 0) {
                j--;
            }
            else
                i++;
                j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
