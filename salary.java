package com.company;

public class salary
{
    private String name;
    private int hours;

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setHours(int h) {
        hours = h;
    }
    public int getHours() {
        return hours;
    }
    public int calculateSalary() {
        return hours * 100;
    }

    public static void main(String [] args) {
        salary w1 = new salary();
        w1.setName("王大明");
        w1.setHours(15);
        int Salary = w1.calculateSalary();
        System.out.println(w1.getName() + "本月工作");
        System.out.println(w1.getHours() + "小時，收入");
        System.out.println(Salary + "元");
    }


}

