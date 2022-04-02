package com.company;

public class worker
{
    private String name;
    private hiredDate2 hireddate;

    public worker(){
        setName("");
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setHiredDate1(hiredDate2 hd){
        hireddate = hd;
    }
    public void setHiredDate2(hiredDate2 hd){
        hireddate = new hiredDate2();
        hireddate.setYear(hd.getYear());
        hireddate.setMonth(hd.getMonth());
        hireddate.setDay(hd.getDay());
    }
    public void setHiredDate3(hiredDate2 hd){
        hireddate.setYear(hd.getYear());
        hireddate.setMonth(hd.getMonth());
        hireddate.setDay(hd.getDay());
    }
    public hiredDate2 getHiredDate(){
        return hireddate;
    }
}
