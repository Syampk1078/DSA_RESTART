package com.askdj.dsa;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1213));
    }

    private static int countDigits(int val) {
        int count = 0;
        while(val>0){
            count++;
            val = val/10;
        }
        return count;
    }
}
