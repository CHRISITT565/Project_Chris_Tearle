import javax.swing.*;

public class OOP_Q6_LAB2 {
    public static void main(String[] args) {



    int count;
        JTextArea jta = new JTextArea();

        jta.setText("Number \t Cube \n ------\t ------- \n");

        for (count = 1; count < 16; count++) {


            jta.append("Number " + count + "\t Cube " + cube(count) + "\n");

        }
        JOptionPane.showMessageDialog(null, jta);
    }
    public static int cube(int count)
    {

        int cube = count *count*count;
        return cube;

    }
}

