package com.askdj.dsa;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = -1;
        if(m>n) min = n;
        else min = m;

        for(int i=min;i>=1;i--){
            if(m%i == 0 && n%i == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
