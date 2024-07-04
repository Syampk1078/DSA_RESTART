package com.askdj.dsa;

import java.util.Scanner;

import static com.askdj.dsa.PrimeNumber.efficientCheck;

public class FindAllPrimes {
    //Eratosthenes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        printPrimeNumbers(n);
        printPrimeNumbers2(n);

    }

    private static void printPrimeNumbers2(int n) {
        //O(n*root(n))
        for(int i=2;i<=n;i++) {
            if(efficientCheck(i)){
                System.out.print(i+" ");
            }


        }
    }

    private static void printPrimeNumbers(int n) {

        //Time Complexity: O(root(n)*log(log(n)))
        boolean[] arr = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(arr[i] == false){
                for(int j= i*i;j<=n;j=j+i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i] == false)
            System.out.println(i);
        }
    }
}
