import javax.swing.*;

public class Zoo {
    public static void main(String[] args) {
        String [] cons = {"Africa ", "Asia"};

        Animal A1 = new Animal("Elephant",cons,120.9f,10);


        Animal A2 = new Animal();
        String Homes []  = new String[2];


        A2.setType(JOptionPane.showInputDialog("Please enter an animal"));

        for (int a=0; a<Homes.length;a++)
        {
            Homes[a]= JOptionPane.showInputDialog("Enter A home[ " + a + " ]." );
        }



        A2.setContinents(Homes);

        A2.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Please enter a Weight")));
        A2.setAge(Integer.parseInt(JOptionPane.showInputDialog("Please enter an age")));


        JOptionPane.showMessageDialog(null,A2.toString() );
    }
}
