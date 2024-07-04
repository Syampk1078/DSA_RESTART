package com.askdj.dsa;

import java.util.Scanner;

public class GCD {

    static int gcd(int n, int m){
        int min = -1;
        if(m>n) min = n;
        else min = m;

        for(int i=min;i>=1;i--){
            if(m%i==0 && n%i==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n,m));

    }
}
