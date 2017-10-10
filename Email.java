import javax.swing.*;

public class Email {
    public static void main(String[] args) {
        Message E1 = new Message();
        Message E2 = new Message();


        E2.setSender(JOptionPane.showInputDialog("Please enter Senders Name"));

        E2.setRecipient(JOptionPane.showInputDialog("Please enter a Recipents name"));

        E2.setEMessage(JOptionPane.showInputDialog("Your Message "));


        JOptionPane.showMessageDialog(null, E1.toString() + "\n\n" + E2.toString());
    }
}
