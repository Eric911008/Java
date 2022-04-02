package com.company;

public class TestTime5 {
    public static void main(String[] args) {
        Time5 t1 = new Time5(9,58,30);
        Time5 t2 = new Time5(9,58,30);
        if(Time5.compare(t1,t2))
            System.out.println(t1.toString() + " >= " + t2.toString());
        else
            System.out.println(t1.toString() + " < " + t2.toString());
    }
}
