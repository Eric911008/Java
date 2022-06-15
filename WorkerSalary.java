package com.company;

import javax.swing.*;

// 父類別
public class WorkerSalary  {

    protected String name;

    public WorkerSalary() {
        setName("");
    }

    public String inputName(WorkerSalary ws) {


        int error;

        do {
            error = 0;
            name = JOptionPane.showInputDialog("Please enter your name");

            try {
                if (name.length() > 5)
                    throw new IllegalArgumentException("姓名長度不能超過 5");
                if (name.matches(".*\\d.*"))
                    throw new Exception("名字中不能有0-9的數字");

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage() + " Please enter your name again(1)");
                error = 1;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage() + " Please enter your name again(2)");
                error = 1;
            }
        } while(error == 1);
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
