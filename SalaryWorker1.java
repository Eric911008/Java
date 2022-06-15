package com.company;
//super()

public class SalaryWorker1 extends Worker1{
    private int salary;

    public SalaryWorker1(String n, int s) {
        super(n);
        salary = s;
    }

    public String toString() {
        return name + " 的薪資為" + salary;
    }

}
