import javax.swing.*;

/**
 * Created by t00185230 on 21/09/2017.
 */
public class OOP_Q6 {
    public static void main(String args[]) {


        String choice = JOptionPane.showInputDialog("Please enter your Choice ( A for Addition , S for Subtraction, M for Multiply, D for Division, to Quit enter q or Quit");

        int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Number"));
        int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another Number"));
        int operation =0;
        int count=0;

        while(!choice.equals("q") && !choice.equals("Quit") )
        {
            count++;
        switch (choice) {
            case "A":


                operation = (Num1 + Num2);
                break;
            case "S":

                operation = (Num1 - Num2);
                break;

            case "M":

                operation = (Num1 * Num2);
                break;
            case "D":

                operation = (Num1 / Num2);
                break;


        }//end of switch


        JOptionPane.showMessageDialog(null, " The First Number entered: " + Num1 + " The second Number entered: " + Num2 + " Calculation Solution: " + operation);

            choice = JOptionPane.showInputDialog("Please enter your Choice ( A for Addition , S for Subtraction, M for Multiply, D for Division, to Quit enter q or Quit");

    }//end while

        JOptionPane.showMessageDialog(null, " The amount of times the system was used " + count);
    }
}


