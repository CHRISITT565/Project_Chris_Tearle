public class MyPointTest {

    public static void main(String args[])
    {
        MyPoint point = new MyPoint();

        point.setXVal(5.0);
        point.setYVal(6.0);

        point.moveHorizontally();
        point.moveVertically();

        System.out.println(point.toString());
    }
}


