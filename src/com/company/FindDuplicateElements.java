package com.company;

public class FindDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {2, 45, 68, 32, 45, 67, 78, 6};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if ((arr[i] == (arr[j])) && (i != j)){
                    System.out.println(arr[i]+", ");
                }
            }
        }

    }
}
