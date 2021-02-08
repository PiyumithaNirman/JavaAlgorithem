package com.company.array;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Add your String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
//        StringBuffer stringBuffer = new StringBuffer();

        for(int i = chars.length-1; i >= 0; i--)
        {
//           stringBuffer.append(chars[i]);
           System.out.print(chars[i]);
        }
//        System.out.println(stringBuffer);
        }
    }



