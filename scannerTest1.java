package com.company;

import java.util.Scanner;

public class scannerTest1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入三個數字(以空白鍵分開)：");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("您輸入第一個數字為：" + num1 );
        System.out.println("您輸入第二個數字為：" + num2 );
        System.out.println("您輸入第三個數字為：" + num3 );

    }
}
