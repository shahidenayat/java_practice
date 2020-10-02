package com.company;
import java.util.Scanner;

public class swap {
    int a,b;
   /* public void getN(int a,int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("input n");
        a = sc.nextInt();
        b = sc.nextInt();

    }*/
    public void swaps(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("swapped numbers"+" "+a +", "+b);
    }
}
