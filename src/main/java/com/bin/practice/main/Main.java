package com.bin.practice.main;

import com.bin.practice.practice01.IntArrManager;
import com.bin.practice.practice02.WorkerManager;

public class Main {
    public static void main(String[] args) {
        IntArrManager.getInstance().inputArrayElements();
        IntArrManager.getInstance().printArrayElements();
        IntArrManager.getInstance().printOddElements();
        IntArrManager.getInstance().sumElementsArray();
        IntArrManager.getInstance().findMinArray();
        WorkerManager manager = new WorkerManager();
        manager.insertDataWorker();
        System.out.println(manager.getWorkersList());
    }
}
