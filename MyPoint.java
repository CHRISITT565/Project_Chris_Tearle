import javax.swing.*;

public class MyPoint{

        //declare attributes
        private double xVal;
        private double yVal;
        private double newXVal;
        private double newYVal;
        private double translate1;
        private double translate2;


        //constructors
        public MyPoint(){

            setXVal(0.0);
            setYVal(0.0);
            setNewXVal(0.0);
            setNewYVal(0.0);
            setTranslation1(0.0);
            setTranslation2(0.0);
        }

        public MyPoint(double xVal, double yVal, double newXVal, double newYVal, double translate1, double translate2){

            setXVal(xVal);
            setYVal(yVal);
            setNewXVal(newXVal);
            setNewYVal(newYVal);
            setTranslation1(translate1);
            setTranslation2(translate2);
        }




        //move horizontal
        public double moveHorizontally(){

            String xHorizontalAsString;
            double xHorizontal;

            xHorizontalAsString = JOptionPane.showInputDialog(null,"Please enter a value to move the point horizontally");

            xHorizontal = Double.parseDouble(xHorizontalAsString);

            newXVal = xVal + xHorizontal;

            return newXVal;
        }


        //move vertical
        public double moveVertically(){

            String yVerticalAsString;
            double yVertical;

            yVerticalAsString = JOptionPane.showInputDialog(null,"Please enter another value to move the point vertically");

            yVertical = Double.parseDouble(yVerticalAsString);

            newYVal = yVal + yVertical;

            return newYVal;
        }


        //translate
        public double translate(){

            String translationAsString;
            double translation, translate1, translate2;

            translationAsString = JOptionPane.showInputDialog(null,"Please enter a value to translate the point");

            translation = Double.parseDouble(translationAsString);

            translate1 = xVal + translation;
            translate2 = yVal + translation;

            return translate1;// translate2;

            return  translate2;
        }


        //mutators
        public void setXVal(double xVal){

            this.xVal = xVal;
        }

        public void setYVal(double yVal){

            this.yVal = yVal;
        }

        public void setNewXVal(double newXVal){

            this.newXVal = newXVal;
        }

        public void setNewYVal(double newYVal){

            this.newYVal = newYVal;
        }

        public void setTranslation1(double translate1){

            this.translate1 = translate1;
        }

        public void setTranslation2(double translate2){

            this.translate2 = translate2;
        }


        //accessors
        public double getXVal(){

            return xVal;
        }

        public double getYVal(){

            return yVal;
        }

        public double getNewXVal(){

            return newXVal;
        }

        public double getNewYVal(){

            return newYVal;
        }

        public double getTranslation1(){

            return translate1;
        }

        public double getTranslation2(){

            return translate2;
        }



        public String toString(){

            return "This point is " + xVal + ", " + yVal + "\nThe point is now " + newXVal + ", " + newYVal +
                    ", when moved\nThe point when translated is " + translate1 + ", " + translate2;
        }
    }
