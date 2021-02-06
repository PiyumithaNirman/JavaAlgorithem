package com.company;

import java.util.Scanner;

public class StringReverseSwap {

    public static void main(String[] args) {

        System.out.println("Add your string");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] strChar = str.toCharArray();

        int start = 0, end = 0;
        end = strChar.length - 1;

        while (start < end) {
            char temp = strChar[start];
            strChar[start] = strChar[end];
            strChar[end] = temp;
            start++;
            end--;
        }
        for (char e : strChar)
            System.out.print(e);
    }
}

