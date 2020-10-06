package com.sparta.shahid;

public class Starter {
    public void start(){
        BubbleSort bubbleSort1 = new BubbleSort();
        int arr[] = {9, 2, 6, 5, 3, 8, 1};
        System.out.println("Before bubble sort ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        bubbleSort1.bubbleSort(arr);
        System.out.println("After bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
