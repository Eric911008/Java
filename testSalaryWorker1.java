package com.company;
// 父類別與子類別的型態轉換
public class testSalaryWorker1 {
    public static void main(String[] args) {

        WorkerSalary w = new SalaryWorker();

        if(w instanceof WorkerSalary)
            System.out.println("w 屬於 WorkerSalary 類別");
        if(w instanceof SalaryWorker)
            System.out.println("w 屬於 SalaryWorker 類別");
    }
}
