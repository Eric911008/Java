package com.company;

public class testHiredDate
{
    public static void main (String[] args){
        hiredDate w1 = new hiredDate();
        w1.setCurrentYear(2022);
        w1.setCurrentMonth(3);
        w1.setCurrentDay(16);

        w1.setHiredYear(2000);
        w1.setHiredMonth(12);
        w1.setHiredDay(31);

        double Seniority = (double) w1.calculateSeniority();
        System.out.println("年資：" + Seniority);
    }
}
