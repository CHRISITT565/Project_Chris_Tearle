import javax.swing.*;

/**
 * Created by t00185230 on 21/09/2017.
 */
public class OOP_Q1_LAB2 {
    public static void main(String[] args) {
        Double MoneyPounds= Double.parseDouble(JOptionPane.showInputDialog("please enter an amount you wish to convert to Pounds "));
        Double MoneyEuro= Double.parseDouble(JOptionPane.showInputDialog("please enter an amount you wish to convert to Euro "));

        converttopounds(MoneyPounds );
        converttoEuro(MoneyEuro);

    }
    static void converttopounds(double x)
    {
        JOptionPane.showMessageDialog(null, "Your amount in Pounds £" + x*0.88 );
    }

    static void converttoEuro(double x)
    {
        JOptionPane.showMessageDialog(null, "Your amount in Pounds €" +String.format("%.2f", x*1.13) );
    }
}
