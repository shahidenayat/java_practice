package com.company;

public class LoopsInJava {
    public void forLoop(){
        for(int i =0;i<5;i++){
            System.out.println("hello world");
        }
    }

    public void whileLoop(){
        int number = 5;
        while(number>1){
            System.out.println(number);
            number--;
        }
    }

    public void doWhile(){
        int number = 5;
        do{
            System.out.println();
        }while (number > 2);
    }

    public void forEachLoop(){
        int[] array1 = new int[7];
        int [] array2 = {1,2,3,4};
        int [] array3 = new int[] {5,6,7,8};

        for(int i:array1){
            System.out.println("Array has the value"+i);
        }
    }
}

//task1 = swapping two numbers
//sum of odd numbers from 1 to n and sum of even numbers from 1 to n
//fibonacci series n-"fibonacci = sum of the previous two equals the next one"