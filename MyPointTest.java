import javax.swing.*;

public class MyPointTest {

    public static void main(String args[])
    {
        MyPoint point = new MyPoint();

        point.setXVal(5.0);
        point.setYVal(6.0);

        System.out.println(point);


        String xHorizontalAsString;
        double xHorizontal;

        xHorizontalAsString = JOptionPane.showInputDialog(null,"Please enter a value to move the point horizontally");

        xHorizontal = Double.parseDouble(xHorizontalAsString);

        String yVerticalAsString;
        double yVertical;

        yVerticalAsString = JOptionPane.showInputDialog(null,"Please enter another value to move the point vertically");

        yVertical = Double.parseDouble(yVerticalAsString);


        point.moveHorizontally(xHorizontal);
        point.moveVertically(yVertical);

        System.out.println("\n new Location " + point);
        point.translate(xHorizontal,yVertical);

        System.out.println("\n translated " + point);

        System.out.println("\n distance from oragin " + String.format("%.0f",point.distanceFormOriginal()));




        //System.out.println("\nThe point is now " + xVal + ", " + newYVal +
        //        ", when moved\nThe point when translated is " + translate1 + ", " + translate2 + "Distance form the two points" + distanceFormOriginal();point.toString());
    }
}


