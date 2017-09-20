//package com.Chris.project;

import javax.swing.*;

/**
 * Created by t00185230 on 19/09/2017.
 */
public class OOP_Q1 {
    public static void main (String args[]){



    int cost = 2;

    String Name = JOptionPane.showInputDialog("Please enter your name");
        String className =JOptionPane.showInputDialog("Please enter your name");

    int Amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter an amount"));

    int Price = Amount * cost;

    JOptionPane.showMessageDialog(null,Name + " from class " + className + "\n Ordered " + Amount + " Buns which will cost €" + Price + "");
    }
}
