package com.bin.practice.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerManager {
    private ArrayList<Worker> workersList;

    public WorkerManager() {
        this.workersList = new ArrayList<>();
    }

    private void printWorkerWithSalaryRequire(float s) {
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).calPayWorker() > s) {
                System.out.println("Worker have salary better require : " + workersList.get(i));
            }
        }
    }

    public void insertDataWorker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length list worker :");
        int n = sc.nextInt();
        System.out.print("Please enter salary require :");
        float s = sc.nextFloat();
        if ( n <= 0 || n >20)  System.out.println("Please enter again length list worker :");
        else {
            for (int i = 0 ; i < n ; i++ ){
                System.out.println("Please enter iD worker :");
                String iD = sc.next();
                System.out.println("Please enter name worker :");
                String name = sc.next();
                System.out.println("Please enter coSalary worker :");
                float coSalary = sc.nextFloat();
                Worker worker = new Worker(iD , name , coSalary);
                workersList.add(worker);
            }
        }
        printWorkerWithSalaryRequire(s);
        sc.close();
    }

    public ArrayList<Worker> getWorkersList() {
        return workersList;
    }
}
