package com.company;

import java.io.*;
import javax.swing.*;

public class TestNumber {

    public static void main(String[] args) {
        String name1 = "Seven7Eleven";
        String name2 = "SevenEleven";
        System.out.println("Seven7Eleven: " + name1.matches(".*[0-9]*."));
        System.out.println("SevenEleven: " + name2.matches(".*[0-9]*."));
    }
}
