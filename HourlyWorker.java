package com.company;
// 繼承 WorkerSalary （兼職）
// 子類別 2
public class HourlyWorker extends WorkerSalary
{
    private int hours;   // 本月工作時數

    public HourlyWorker() {
        setName("");
        setHours(0);
    }

    public HourlyWorker(String n, int h) {
        setName(n);
        setHours(h);
    }

    public void setHours(int h) {
        if(h < 0) {
            System.out.println(name + " 工作時數錯誤");
            System.exit(-1);
        }
        else
            hours = h;
    }

    public int getHours() {
        return hours;
    }

    public double computeSalary() {
        return hours * 90;
    }
}
