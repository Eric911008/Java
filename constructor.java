package com.company;

public class constructor
{
    private String name;
    private int hours;
    // 建構元的名稱必須與類別名稱相同
    public constructor(){
        name = "";
        hours = 0;
    }
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
    public static void main(String[] args) {
        constructor w = new constructor();
        w.setName("Eric");
        w.setHours(1500);
        System.out.println("姓名是" + w.getName() + "!");
        System.out.println("工作時數為" + w.getHours());
        int Salary = w.calculateSalary();
        System.out.println("薪水 " + Salary + " 元");
    }
}
