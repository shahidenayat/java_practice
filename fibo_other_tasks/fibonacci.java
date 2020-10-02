package com.company;

public class fibonacci {
    static int fib(int n){

        if (n <=1) {
            return n;
        }else {
            int fibo = fib(n - 1) + fib(n - 2);
            System.out.println(fibo);
            return fibo;
        }
        }
}
