package com.company;

import java.util.*;

public class BMI
{
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your weight(kg): ");
            double weight = sc.nextDouble();
            System.out.print("Please enter your height(m): ");
            double height = sc.nextDouble();
            double BMI = weight / (height * height);
            // check range
            if(BMI < 18.5)
                System.out.println("Thin");
            else if(BMI < 25)
                System.out.println("Normal");
            else if(BMI < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");

            System.out.println("Your BMI is " +  BMI );
        }
}
