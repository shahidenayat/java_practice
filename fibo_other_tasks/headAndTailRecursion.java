package com.company;

public class headAndTailRecursion {
    public void tails(int n){
        if (n == 0){
            return;
        }else{
            System.out.println(n);
            tails(n-1);
        }
    }

    public void heads(int n){
        if(n==0){
            return;
        }else{
            heads(n-1);
            System.out.println(n);
        }
    }


}
