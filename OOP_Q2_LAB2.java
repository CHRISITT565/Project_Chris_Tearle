import javax.swing.*;

public class OOP_Q2_LAB2 {
    public static void main(String[] args) {

        int inches, yards, count;
        JTextArea jta =new JTextArea();

        jta.setText("Yards ...Inches \n");

        for(count=0; count<10;count++){

            inches=12*(count*3);
            yards=count;

            jta.append("Yards "+ yards + " Inches " + inches +"\n");

        }
        JOptionPane.showMessageDialog(null,jta);
    }
}
