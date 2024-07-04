package com.askdj.dsa;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(efficientCheck(n));
    }

    static boolean efficientCheck(int n) {
        //Time Complexity = O(ROOT(N)) - more efficient
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5; i*i<=n; i=i+6){ //starts with 5, step over 6, check i+2 and itself
            if(n%(i+2) ==0 || n%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {

        if(n==1) return false;
        for(int i=2;i<=n/2;i++){ //More efficient using root n
            //Time complexity O(n) = n/2
            //Time Complexity O(root(n)) = root(n)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
