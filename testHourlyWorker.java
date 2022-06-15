package com.company;
// 繼承
public class testHourlyWorker
{
    public static void main(String[] args) {
        HourlyWorker s = new HourlyWorker("Mary", 180);
        System.out.println(s.getName() + " 的月薪為 " + s.computeSalary());
    }
}
