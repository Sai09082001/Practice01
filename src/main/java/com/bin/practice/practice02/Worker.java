package com.bin.practice.practice02;

public class Worker {
    private final String iD;
    private String name;
    private float coSalary;

    public Worker(String iD , String name , float coSalary) {
        this.iD = iD;
        this.name = name;
        this.coSalary = coSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCoSalary() {
        return coSalary;
    }

    public void setCoSalary(float coSalary) {
        this.coSalary = coSalary;
    }

    public float calPayWorker() {
       return coSalary*1550000;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", coSalary=" + coSalary +
                '}';
    }
}
