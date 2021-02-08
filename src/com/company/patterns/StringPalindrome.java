package com.company.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[]args){

        System.out.println("Add the word");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char[] arr = word.toCharArray();
        String reverseWord = "";

        for(int i = arr.length-1; i >= 0; i--){
            reverseWord = reverseWord + arr[i];
        }
        System.out.println(reverseWord);

        if(reverseWord.equals(word)){
            System.out.println("Word is palindrome");
        }
        else
            System.out.println("Word is not palindrome");


    }
}
