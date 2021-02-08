package com.company.array;

import java.util.Arrays;

public class ReverseArrayUsingTwoArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 5, 8, 6, 1, 4};
        int[] arrNew = new int[arr.length];
        int i = arr.length-1;

        for(int j = 0; j <= arr.length-1; j++){
            arrNew[i] = arr[j];
            i--;
        }
        System.out.println(Arrays.toString(arrNew));
    }

}
