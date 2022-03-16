package com.company;

public class testConstructor
{
    public static void main(String[] args) {
        constructor w = new constructor();
        System.out.println("姓名是" + w.getName() + "!");
        System.out.println("工作時數為" + w.getHours());
        int Salary = w.calculateSalary();
        System.out.println(Salary + " 元");
    }

}
