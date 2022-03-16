package com.company;

public class localVariable
{
    private double x = 12.3;

    public void test1() {
        //f區域變數
        int x = 100;
        double y = 11.1;
        System.out.println("x = " + x + "; y = " + y);
        x = x * 2;
    }

    public void test2() {
        System.out.println("x = " + x);
        x = x * 2;
    }

}
