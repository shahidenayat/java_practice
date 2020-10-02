package com.sparta.shahid;

public class Recursions {

    public void methodRecursions(int number) {

        if(number > 0){
            printer.printBeforeRecursion(number);
            methodRecursions(number - 1);
            printer.printAfterRecursion(number);
        }

    }
}
