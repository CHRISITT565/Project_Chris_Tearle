package com.Chris.project;

import javax.swing.*;

/**
 * Created by t00185230 on 19/09/2017.
 */
public class OOP_Q3 {


    public static void main (String args[]){



        Double IAT, Tax;
        int TaxRate;

        String Name = JOptionPane.showInputDialog("Please enter your name");

        Double Income = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Taxable income"));

        if (Income < 20000) {
            TaxRate= 0;
            Tax = Income* 0.0;
            IAT = Income-Tax;


        }
        else if (Income < 36000) {
            TaxRate= 20;
            Tax = Income* 0.2;
            IAT = Income-Tax;
        }

        else
            TaxRate= 41;
        Tax = Income* 0.41;
        IAT = Income-Tax;

        JOptionPane.showMessageDialog(null, "Name " + Name + "Income " + Income + " Tax Rate " + TaxRate + "%\n Tax " +
                + Tax + " Income After Tax " + IAT);
    }
}




