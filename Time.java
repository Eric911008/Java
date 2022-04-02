package com.company;

public class Time
{
    private int h, m, s;

    public Time() {
        setHour(0);
        setMinute(0);
        setSecond(0);
    }

    public Time(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour < 24)
            h = hour;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60)
            m = minute;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60)
            s = second;
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
    }

    public int getHour() { return h; }
    public int getMinute() { return m; }
    public int getSecond() { return s; }

    public String toString()
    {
        return ( ( h == 12 || h == 0 ) ? 12 : h % 12 ) +
                ":" + ( m < 10 ? "0" : "" ) + m +
                ":" + ( s < 10 ? "0" : "" ) + s +
                ( h < 12 ? " AM" : " PM" );
    }

    public Time addMinutes(int minute) {
        Time t = new Time(h, m, s);
        if(minute >= 0 ) {
            t.setHour (((m + minute)/ 60 + h) % 24);
            t.setMinute((m+minute) % 60) ;
        }
        else {
            System.out.println("錯誤");
            System.exit(1);
        }
        return t;
    }

    public static void main(String[] args) {
        Time t1 = new Time(5,30,0);
        Time t2 = t1.addMinutes(3270);
        System.out.println("Before adding: " + t1.toString());
        System.out.println("After adding: " + t2.toString());
    }
}
