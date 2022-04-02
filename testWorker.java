package com.company;

public class testWorker
{
    public static void main(String[] args){
        worker w1 = new worker();
        w1.setName("Mary");

        hiredDate2 h1 = new hiredDate2();
        h1.setYear(2022);
        h1.setMonth(3);
        h1.setDay(16);
        w1.setHiredDate2(h1);

        System.out.println("姓名是 " + w1.getName());
        System.out.println("聘用年份是 " + w1.getHiredDate().getYear());

        worker w2 = w1;
        w2.setName("John");
        w2.getHiredDate().setYear(2021);
        System.out.println("姓名是 " + w1.getName());
        System.out.println("聘用年份是 " + w1.getHiredDate().getYear());
    }
}
