package com.company;

import javax.swing.*;

// 繼承 WorkerSalary （專職）
// 子類別 1
public class SalaryWorker extends WorkerSalary
{
    private int salary; // 年薪

    public SalaryWorker() {
        setName("");
        setSalary(0);
    }

    public SalaryWorker(String n, int s) {
        setName(n);
        setSalary(s);
    }



    public void setSalary(int s) {
        if(s < 0) {
            System.out.println(name + " 薪資金額錯誤");
            System.exit(-1);
        }
        else
            salary = s;
    }

    public int getSalary() {
        return salary;
    }

    public double computeSalary() {
        return salary / 12.0;
    }

}
