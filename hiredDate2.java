//3/23 practice
package com.company;

import java.time.LocalDateTime;

public class hiredDate2
{
    private int year,month,day;

    public hiredDate2(){
        LocalDateTime date = LocalDateTime.now();
        setYear(date.getYear());
        setMonth(date.getMonthValue());
        setDay(date.getDayOfMonth());
    }
    public void setYear(int y){
        year = y;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int m){
        month = m;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int d){
        day = d;
    }
    public int getDay(){
        return day;
    }
}
