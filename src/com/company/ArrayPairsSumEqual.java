package com.company;

public class ArrayPairsSumEqual {

    public static void main(String[]args){

        int[] arr = {25, 34, 12, 46, 78, 56, 22, 48};
        int element = 34;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] + arr[j]) == element){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
