package com.company;

import javax.swing.*;

public class testString
{
    public static void main(String[] args)
    {
        //將文字分成一半再對調
        String input = JOptionPane.showInputDialog("請輸入句子");
        int size = input.length();
        String firstHalf = input.substring(0, size/2);
        String secondHalf = input.substring(size/2);
        System.out.println(secondHalf + firstHalf);
    }
}
