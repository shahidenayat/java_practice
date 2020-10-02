package com.company;

public class SumOfNum {
    public static int oddSum(int n){
        int sum = 0;
        //int n;
        for (int i = 1; i < n; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}
