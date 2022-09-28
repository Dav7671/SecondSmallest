package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int secondMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < secondMin && arr[i] > min){
                secondMin = arr[i];
            }
        }

        System.out.println("The second smallest = " + secondMin);
    }
}
