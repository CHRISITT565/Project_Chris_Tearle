import javax.swing.*;

public class OOP_Q5_LAB2 {
    public static void main(String[] args) {

        double b = 6, c = -16, a = 1, x1, x2, equation;



        x1 = (-b + Math.sqrt((b*b)-(4*a*c )))/(2*a);

        x2 = (-b - Math.sqrt((b*b)-(4*a*c )))/(2*a);


        JOptionPane.showMessageDialog(null , x1 + "\n\n" + x2);
    }
}
