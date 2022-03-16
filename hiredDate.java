package com.company;

public class hiredDate
{
    private int currentYear;
    private int currentMonth;
    private int currentDay;

    private int hiredYear;
    private int hiredMonth;
    private int hiredDay;
    //current
    public void setCurrentYear(int y1) {currentYear = y1;}

    public int getCurrentYear() {return currentYear;}

    public void setCurrentMonth(int m1) {currentMonth = m1;}

    public int getCurrentMonth() {return currentMonth;}

    public void setCurrentDay(int d1) {currentDay = d1;}

    public int getCurrentDay() {return currentDay;}

    //hired
    public void setHiredYear(int y2) {hiredYear = y2;}

    public int getHiredYear() {return hiredYear;}

    public void setHiredMonth(int m2) {hiredMonth = m2;}

    public int getHiredMonth() {return hiredMonth;}

    public void setHiredDay(int d2) {hiredDay = d2;}

    public int getHiredDay() {return hiredDay;}
    //計算年資
    public double calculateSeniority(){
        return ((currentYear*365.0+(currentMonth-1.0)*30.0+currentDay-
                hiredYear*365.0+ (hiredMonth-1.0)*30.0+hiredDay)/365.0);
    }
}
