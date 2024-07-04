package com.askdj.dsa;

import java.util.Scanner;

public class GCD {

    static int gcd(int n, int m){
        int steps=0;
        int min = -1;
        if(m>n) min = n;
        else min = m;

        for(int i=min;i>=1;i--){
            if(m%i==0 && n%i==0){
                return i;
            }
            steps++;
            System.out.println("steps: "+steps);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n,m)); //Brute force approach
        System.out.println(eclidsGcd(n,m)); //Eclid's Algorithm
        System.out.println(efficientEclids(n,m)); //eclid's algorithm

    }

    private static int efficientEclids(int n, int m) {
        int steps = 0;
        while(n!=0 && m!=0) {
            if (m > n) m = m % n;
            else n = n % m;
        }
        steps++;
        System.out.println("Steps: "+steps);
        if(n!=0) return n;
        else return m;
    }

    private static int eclidsGcd(int n, int m) {

        int steps = 0;
        while(n!=m) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
            steps++;
            System.out.println("steps: "+steps);
        }

        return m;
    }
}
