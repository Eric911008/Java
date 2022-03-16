package com.company;

public class badWorker
{
    public String name;
    public int hours;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setHours(int h) {
        if (h < 0)
            hours = 0;
        else
            hours = h;
    }
    public int getHours() {
        return hours;
    }
    public int calculateSalary() {
        return hours * 100;
    }

}
