import javax.swing.*;

public class OOP_Q4_LAB2 {
    public static void main(String[] args) {
        String name,uper, surname;
        int CharLength;
        char firstInital;

        name = JOptionPane.showInputDialog("please enter your name ");

        CharLength = name.length();
        firstInital = name.charAt(0);
        uper= name.toUpperCase();
        int lastname = name.lastIndexOf(' ');
        surname = name.substring(lastname +1);

        JOptionPane.showMessageDialog(null,"name " + name + "\n inital " + firstInital + "\n Name in Upper case " + uper +
        "\n Surname " + surname);



    }
}
