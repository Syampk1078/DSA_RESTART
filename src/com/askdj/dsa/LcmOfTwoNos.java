package com.askdj.dsa;

import java.util.Scanner;

import static com.askdj.dsa.GCD.efficientEclids;

public class LcmOfTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Lcm of 2 No's: "+lcm(n,m)); //brute force
        //TC: O(N*M - MAX(N,M))
        System.out.println("Lcm of 2 No's: "+(n*m)/(efficientEclids(n,m)));
        //TC: O(log(min(n,m))

//        Formula:
//        Eculid's Algorithm
//            Lcm(n,m)*gcd(n,m) = n*m
//            => lcm(n,m) = n*m / gcd(n,m)
    }

    private static int lcm(int n, int m) {

        int max = Math.max(n,m);
        while(true){
            if(max%n==0 && max%m==0){
                break;
            }
            max++;
        }
        return max;
    }
}
