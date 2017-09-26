import javax.swing.*;

public class OOP_Q3_LAB2 {
    public static void main(String[] args) {
        String name;
        int Length, width, area;
        float costPerSq, Quote;
        JTextArea q = new JTextArea();

        name= JOptionPane.showInputDialog("please enter Your name ");
        Length = Integer.parseInt(JOptionPane.showInputDialog("please enter The length of the room "));
        width = Integer.parseInt(JOptionPane.showInputDialog("please enter The length of the room "));
        costPerSq = Float.parseFloat(JOptionPane.showInputDialog("please enter the cost for the carpet"));
            area=area = (Length*width);
        Quote = area*costPerSq;

        q.setText("Quotation for "+ name + "\n");

        q.append("Length Of Room:" + Length + "\n Width Of room: " + width + "\n Area Of Room: " + area + "\n Cost Per Square Meter of carpet: " +
        +  costPerSq + "\n Total cost for carpet: " + Quote);

        JOptionPane.showMessageDialog(null,q);




    }
}
