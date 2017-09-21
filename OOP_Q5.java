import javax.swing.*;

public class OOP_Q5 {
    public static void main(String args[]) {


        String choice = JOptionPane.showInputDialog("Please enter your Choice");

        int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a Number"));
        int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another Number"));
        double operation =0;


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



        }
        JOptionPane.showMessageDialog(null, " The First Number entered: " + Num1 + " The second Number entered: " + Num2 + " Calculation Solution: " + operation);

    }
}


