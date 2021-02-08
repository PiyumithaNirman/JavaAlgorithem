package com.company.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 5, 8, 6, 1, 4};

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
//        System.out.println(Arrays.toString(arr));
        for(int j = 0; j <= arr.length-1; j++){
            System.out.println(arr[j]);
        }
    }
}