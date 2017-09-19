package com.Chris.project;

import javax.swing.*;

/**
 * Created by t00185230 on 19/09/2017.
 */
public class OOP_Q2 {

    public static void main (String args[]){





        String FName = JOptionPane.showInputDialog("Please enter your Forename");
        String initial = JOptionPane.showInputDialog("Please enter your initials");
        String SName =JOptionPane.showInputDialog("Please enter your Surname");

        int Distance = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Distance"));



        Double Raised=0.0;

        if (Distance < 10) {
            Raised = Distance * 0.07;

        }
        else if (Distance > 10) {
            Raised = 0.07 * 10 + ((Distance - 10)* 0.1);
        }

        JOptionPane.showMessageDialog(null,"Cyclist " + FName + " " + initial + " " + SName + "\n " +
                "Has Traveled " + Distance + " and has raised " + Raised);
    }
}


