package com.company;

public class ToString {
    private int rollno;
    private String name;
    private String city;

    ToString(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    //overriding the toString() method
    public String toString(){
        return rollno + " " + name + " " + city;
    }
    public static void main(String[] args) {
        ToString s1 = new ToString(101,"Raj","lucknow");
        ToString s2 = new ToString(102,"Vijay","ghaziabad");

        System.out.println(s1);
        System.out.println(s2);
    }
}

