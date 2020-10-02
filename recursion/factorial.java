package com.sparta.shahid;

public class factorial {
    public static int factorialRecursive(int number){
        int factorialOutput = 1;
        //stopping condition
        if(number == 1){
            return 1;
        }else {
            factorialOutput = number * factorialRecursive(number - 1);
        }
        return factorialOutput;
    }
}
