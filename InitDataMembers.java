package com.company;

public class InitDataMembers
{
    private byte b = 1;
    private short s = 2;
    private int i = 3;
    private long l = 4;
    private float f = 5.2F;
    private  double d = 6;

    public InitDataMembers(){
        i = 6;
        d = 12.0;
    }
    //注意i & d，宣告資料成員時給的初始值會先被執行，再執行建構元的方法主體
    public static void main(String[] args){
        InitDataMembers idm = new InitDataMembers();
        System.out.println("b = " + idm.b);
        System.out.println("s = " + idm.s);
        System.out.println("i = " + idm.i);
        System.out.println("l = " + idm.l);
        System.out.println("f = " + idm.f);
        System.out.println("d = " + idm.d);
    }
}
