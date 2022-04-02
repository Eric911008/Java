package com.company;

public class Time1 {
    private int h, m, s;

    public Time1() //建構元1
    {
        setHour(0);
        setMinute(0);
        setSecond(0);
    }
    public Time1(int h, int m, int s) //建構元2
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24)
            h = hour;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public void setMinute(int minute)
    {
        if(minute >= 0 && minute < 60)
            m = minute;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public void setSecond(int second)
    {
        if(second >= 0 && second < 60)
            s = second;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public int getHour() {return h;}
    public int getMinute() {return m;}
    public int getSecond() {return s;}
    public String toString()
    {
        return (( h == 12 || h == 0) ? 12 : h % 12)+
                " : " + ( m < 10 ? "0" : "") + m +
                " : " + ( s < 10 ? "0" : "") + s +
                ( h < 12 ? "AM" : "PM");
    }
}



