package com.company;

import java.util.SplittableRandom;

public class testString2
{
    public static void main (String[] args)

    {
        //字串相加
        System.out.println("偶像團體" + 183);
        System.out.println("偶像團體" + 55 + 66);
        System.out.println(55 + 66 + "偶像團體");
        System.out.println(55 + 66 + "偶像團體" + 55 + 66);
        //跳脫字元
        System.out.println("\"c:\\java\\data.txt\"");
        System.out.println("Harry\t哈利\nPotter\t波特");
        //practice
        String input;
        input = "Hello";
        input = "World";
        input = input + "Hello";
        System.out.println(input);
        //practice2
        int x = 5;
        String s1 = "Hello";
        String s2 = new String("Hello");
        s1  = s1 + s2;
        System.out.println(s1);


    }
}
