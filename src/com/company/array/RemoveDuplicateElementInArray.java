package com.company.array;

import java.util.Arrays;

public class RemoveDuplicateElementInArray {

    public static void main(String[]args){

        int[] arr = {2, 45, 67, 2, 45, 69, 42};

        int duplicate = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < duplicate; j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[duplicate-1];
                    duplicate--;
                    j--;
                }
            }
        }
        int[] withOutDuplicates = Arrays.copyOf(arr, duplicate);

        System.out.print(Arrays.toString(withOutDuplicates));
    }
}
