package com.askdj.dsa;

public class SpanOfArray {
    public static void main(String[] args) {

        int[] arr = {10,20,5,3,13,9};
        System.out.println(spanOfArr(arr));
    }

    private static int spanOfArr(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return (max-min);
    }
}
