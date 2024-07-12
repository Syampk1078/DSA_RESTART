package com.askdj.exception;

public class DefaulExceptionHandler {
    public static void main(String[] args) {
        doStuff();
    }

    private static void doStuff() {
        doMoreStuff();
    }

    private static void doMoreStuff() {
        System.out.println(10/0);
    }
}
