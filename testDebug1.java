package com.company;

public class testDebug1
{
    public static void main (String [] args)
    {
        int sum = 0; int i = 1;
        while (i <= 10) {
            if (i ==5) {
                i++;
                System.out.println("i=" + i);
                continue;
            }
            sum += i;
            i++;
            System.out.println(i);
        }
        System.out.println("Sum is " + sum );
    }
}
