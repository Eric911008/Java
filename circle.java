package com.company;

public class circle
{
    public double radius = 2.1;
    public static double PI = 3.14159;
    public double compute()
    {
        return PI*radius;
    }

    public static void main(String[] args)
    {
        System.out.println(PI);
        System.out.println(circle.PI);


    }
}
