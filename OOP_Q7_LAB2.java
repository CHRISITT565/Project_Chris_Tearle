import javax.swing.*;

public class OOP_Q7_LAB2 {
    public static void main(String[] args) {
        int num,CounterTrue=0,CounterFalse=0;


        num = Integer.parseInt(JOptionPane.showInputDialog("please enter a number"));

        if(isEven(num)==false)
        {
            CounterFalse++;
        }
        else{
            CounterTrue++;
        }
        while (num != -1)
        {

            num = Integer.parseInt(JOptionPane.showInputDialog("please enter a number (to quit enter -1)"));


            if(isEven(num)==false)
            {
                CounterFalse++;
            }
            else{
                CounterTrue++;
            }
        }
        JOptionPane.showMessageDialog(null,"the amount of even numbers is " + CounterTrue+ "the amount of odds is "+ (CounterFalse - 1) );



    }
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }


    }

}
