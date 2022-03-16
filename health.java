package com.company;

public class health
{
    private String name;
    private String gender;
    double waistline;
    double height;
    double weight;

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setGender(String g){
        gender = g;
    }
    public String getGender() {
        return gender;
    }
    public void setWaistline(double wl) {
        waistline = wl;
    }
    public double getWaistline(){
        return waistline;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double w){
        weight = w;
    }
    public double getWeight(){
        return weight;
    }


    public static void main(String[] args)
    {
        //student's information
        health person = new health();
        person.setName("Eric");
        person.setGender("male");
        System.out.println("Name: " + person.getName());
        System.out.println("Gender: " + person.getGender());
        //calculate BMI
        health num = new health();
        num.setWeight(60);
        num.setHeight(1.85);
        double BMI = num.getWeight() / (num.getHeight() * num.height);
        System.out.println(person.name + "'s" + " BMI is " +  BMI );
        // check range
        if(BMI < 18.5)
            System.out.println("You are thin!");
        else if(BMI < 25)
            System.out.println("You are normal!");
        else if(BMI < 30)
            System.out.println("You are overweight!");
        else
            System.out.println("You are obese!");
    }
}
