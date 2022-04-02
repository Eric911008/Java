package com.company;

public class TestTime3 {
    public static void main(String[] args) {
        Time3 t1 = new Time3();
        t1 = t1.setHour(9).setMinute(58).setSecond(0);
        System.out.println(t1.toString());
    }
}