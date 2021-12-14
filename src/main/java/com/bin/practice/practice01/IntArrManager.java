
package com.bin.practice.practice01;

import java.util.Scanner;

public class IntArrManager {
    private static IntArrManager arrManager;
    private int n ;
    private int[] arr;

    public static IntArrManager getInstance() {
        if (arrManager == null) arrManager = new IntArrManager();
        return arrManager;
    }

    private IntArrManager() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length arr :");
        n = sc.nextInt();
        arr = new int[n];
    }
    /* require
     * Prints the entered array elements
     * Sum the elements in the array
     * Print odd elements in array
     * Find the value and position of the smallest element in an array
     * */

    public void inputArrayElements() {
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i < arr.length ; i++) {
            System.out.println("Please enter index "+i+":");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void findMinArray() {
        System.out.println("\n");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        System.out.print("Sum the elements in array :" +min);
    }

    public void sumElementsArray() {
        System.out.println("\n");
        int s = 0;
        for (int i =0 ; i < arr.length ; i++) {
            s += arr[i];
        }
        System.out.print("Sum the elements in array :" +s);
    }

    public void printArrayElements() {
        System.out.println("\n");
        System.out.print("Prints the entered array elements :");
        for (int i =0 ; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public void printOddElements() {
        System.out.println("\n");
        System.out.print("Prints odd elements in array :");
        for (int i =0 ; i < arr.length ; i++) {
            if (arr[i] % 2 != 0) System.out.print(" "+arr[i]);
        }
    }
}