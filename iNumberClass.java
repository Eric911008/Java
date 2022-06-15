package com.company;

public class iNumberClass
{
    private static int num = 83 ;

    public static int isOddEven() {
        if( num % 2 == 0){
            System.out.println("The number " + num + " is even.");
        }
        else {
            System.out.println("The number " + num + " is odd.");
        }
        return num;
    }

    public static int isPrime(){
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
        return num;
    }
    public static void main (String [] args) {
        iNumberClass.isOddEven();
        iNumberClass.isPrime();
    }
}
