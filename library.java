import javax.swing.*;

public class library {
    public static void main(String[] args) {
        BOOK bk1 = new BOOK();
        BOOK bk2 = new BOOK();

        bk2.setTitle("Spooks : The Apprentice");
        bk2.setPrice(15.0f);
        bk2.setPageNum(126);
        bk2.setIsbn("000-000-000-000-1");


        JOptionPane.showMessageDialog(null,bk1.toString() + "\n" + bk2.toString());



    }
}
