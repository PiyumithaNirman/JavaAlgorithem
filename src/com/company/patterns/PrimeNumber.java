package com.company.patterns;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[]args){

        System.out.println("Add number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(isPrime(number)){
            System.out.println("Prime number");
        }
        else
            System.out.println("Not prime number");
    }

    static boolean isPrime(int n){

        if (n<1){
            return false;
        }

        for (int i = 2; i< Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}

