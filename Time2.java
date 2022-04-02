package com.company;

public class Time2 {
    private int h, m, s;

    public Time2() {
        setHour(0);
        setMinute(0);
        setSecond(0);
    }

    public Time2(int h, int m, int s) {
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

    public Time2 addMinutes(int minute) {
        Time2 t = new Time2(h, m, s);
        if(minute >= 0 && minute < 60) {
            if(m + minute < 60)
                t.setMinute(m + minute);
            else {
                t.setMinute(m + minute - 60);
                if(h + 1 == 24)
                    t.setHour(0);
                else
                    t.setHour(h+1);
            }
        } else {
            System.out.println("錯誤");
            System.exit(1);
        }
        return t;
    }

    public String toString() {
        return ( ( h == 12 || h == 0 ) ? 12 : h % 12 ) +
                ":" + ( m < 10 ? "0" : "" ) + m +
                ":" + ( s < 10 ? "0" : "" ) + s +
                ( h < 12 ? " AM" : " PM" );
    }
}