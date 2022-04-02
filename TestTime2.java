package com.company;

public class TestTime2 {
    public static void main(String[] args) {
        Time2 t1 = new Time2(9,58,0);
        Time2 t2 = t1.addMinutes(1);
        System.out.println(t2.toString());
        t2 = t2.addMinutes(1);
        System.out.println(t2.toString());
    }
}
