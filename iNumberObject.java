package com.company;

public class iNumberObject
{
    private int num;

    public iNumberObject(int n) {
        setNum(n);
    }

    public void setNum(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }

    public int isOddEven() {
        if( getNum() % 2 == 0){
            System.out.println("The number " + getNum() + " is even.");
        }
        else {
            System.out.println("The number " + getNum() + " is odd.");
        }
        return getNum() ;
    }

    public int isPrime(){
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= getNum() / 2; i++) {
            temp = getNum() % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println((num + " is a prime number."));
        }
        else {
            System.out.println((num + " is not a prime number."));
        }
        return num;
    }

    public static void main(String [] args) {
        iNumberObject number = new iNumberObject(83);
        number.isOddEven();
        number.isPrime();
    }
}
