/** This code is complete - it tests the class Line*/
public class LineTest {
    public static void main(String[] args)
    {
        Line line1 = new Line(5,4,-17);
        System.out.println(line1.getSlope());
        System.out.println(line1.isOnLine(5,-2));
        System.out.println(line1.toString());
        System.out.println(" ");

        Line line2 = new Line(-25, 40, 30);
        System.out.println(line2.getSlope());
        System.out.println(line2.isOnLine(5,-2));
        System.out.println(" ");

        Line line3 = new Line(-10, -8, 20);
        System.out.println(line3.getSlope());
        System.out.println(line3.isOnLine(5,-2));
        System.out.println(" ");

        System.out.println(line1.isParallel(line2));
        System.out.println(line1.isParallel(line3));
    }
}
