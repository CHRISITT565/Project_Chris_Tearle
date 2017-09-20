//package com.Chris.project;

import javax.swing.*;

/**
 * Created by t00185230 on 19/09/2017.
 */
public class OOP_Q4 {

    public static void main(String args[]) {
        int count = 0, num, total = 0;
        String numAsString;

        numAsString = JOptionPane.showInputDialog("Please enter a number (q to quit)");

        while (!numAsString.equals("q")) {

            num = Integer.parseInt(numAsString);
            total += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number (q to quit)"));
            count++;


        }

        JOptionPane.showMessageDialog(null, "The amount of numbers entered is " + count + "\n The total of the numbers is " + total);
    }
}