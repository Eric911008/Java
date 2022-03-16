package com.company;

public class testBadWorker
{
    public static void main (String [] args) {
        badWorker w = new badWorker();
        w.setHours(-20);
        System.out.println("工作時數為" + w.getHours());
    }

}
