package com.company;
// original
public class testSalaryWorker
{
    public static void main(String[] args) {

        WorkerSalary ws = new WorkerSalary();

        SalaryWorker s = new SalaryWorker();
        ws.setName(s.inputName(ws));
        s.setSalary(4000000);
        System.out.println(s.getName() + " 的月薪為 " + s.computeSalary());

        HourlyWorker w = new HourlyWorker();
        ws.setName(w.inputName(ws));
        w.setHours(180);
        System.out.println(w.getName() + " 的月薪為 " + w.computeSalary());


    }
}
