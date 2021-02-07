package com.company;

public class TwoArrayEqual {

    public static void main(String[] args) {

        int[] arr1 = {23, 45, 65, 78, 34, 56, 78, 86};
        int[] arr2 = {23, 45, 65, 78, 34, 56, 78, 86};

        boolean equal = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                }
            }
        } else {
            equal = true;
        }

        if(equal){
            System.out.println("Arrays are equal");
        }
        else
            System.out.println("Arrays are not equal");
    }
}

