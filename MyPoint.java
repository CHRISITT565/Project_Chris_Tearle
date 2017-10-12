import javax.swing.*;

public class MyPoint{

        //declare attributes
        private double xVal;
        private double yVal;
        //private double newXVal;
        //private double newYVal;
        //private double translate1;
        //private double translate2;


        //constructors
        public MyPoint(){

            setXVal(0.0);
            setYVal(0.0);
            //setNewXVal(0.0);
            //setNewYVal(0.0);
            //setTranslation1(0.0);
            //setTranslation2(0.0);
        }

        public MyPoint(double xVal, double yVal){

            setXVal(xVal);
            setYVal(yVal);
           // setNewXVal(newXVal);
           // setNewYVal(newYVal);
           // setTranslation1(translate1);
           // setTranslation2(translate2);
        }




        //move horizontal
        public void moveHorizontally(double xunits){

            xVal = xVal + xunits;

        }


        //move vertical
        public void moveVertically(Double yUnits){


            yVal = yVal + yUnits;


        }


        //translate
        public void translate(double xunits, double yunits){



            xVal = xVal + xunits;
            yVal = yVal + yunits;




        }

        public double distanceFormOriginal()
        {
            double distance = Math.sqrt(((xVal * xVal)+ (yVal*yVal)));
            return distance;
        }


        //mutators
        public void setXVal(double xVal){

            this.xVal = xVal;
        }

        public void setYVal(double yVal){

            this.yVal = yVal;
        }




        //accessors
        public double getXVal(){

            return xVal;
        }

        public double getYVal(){

            return yVal;
        }





        public String toString(){

            return "This point is now at " + getXVal() + ", " + getYVal();
        }
    }
