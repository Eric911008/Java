package com.company;

public class testTime
{
    public static void main(String[] args)
    {
        Time T1 = new Time(9,58,0);
        Time t2 = T1.addMinutes(1);
        System.out.println(t2.toString());
        t2 = T1;
        System.out.println(t2.toString());
        T1 = T1.addMinutes(1);
        System.out.println(T1.toString());
    }
}
