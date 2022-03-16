package com.company;

public class worker
{
    public static void main(String [] args){
        constructor w1 = new constructor();

        System.out.println("Name"+w1.getName());
        System.out.println("hours"+w1.getHours());

        constructor w2 = w1;
        w2.setName("Mary");//w1也會跟著改變
        w2.setHours(35);
        System.out.println("Name"+w1.getName());
        System.out.println("hours"+w1.getHours());

    }
}
