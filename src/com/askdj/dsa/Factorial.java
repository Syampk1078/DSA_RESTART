package com.askdj.dsa;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int val) {
        int res = 1;
        for(int i=1;i<=val;i++){
            res *= i;
        }
        return res;
    }
}
