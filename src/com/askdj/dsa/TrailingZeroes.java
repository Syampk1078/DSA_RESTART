package com.askdj.dsa;

public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(zeroes(24));
    }

    private static int zeroes(int n) {
        int res = 0;
        int powerOf5 = 5;
        while(n>=powerOf5){
            res += (n/powerOf5);
            powerOf5 *= 5;
        }
        return res;
    }
}
