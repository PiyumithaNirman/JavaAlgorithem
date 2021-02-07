package com.company;

import java.util.Arrays;

public class ArrayZeroValueOneSide {

    public static void main(String[]args){

        int[] arr = {2, 0, 34, 43, 0, 67, 56,0, 32};
        int count =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];

                count++;
            }


        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
