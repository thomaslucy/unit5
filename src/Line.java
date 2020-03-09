import javax.swing.*;

public class Line {
    private static double a;
    private static double b;
    private static double c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return (a * -1) / (b);
    }

    public boolean isOnLine(int x, int y) {
        if (((a * x) + (b * y) + c) == 0)
            return true;
        else
            return false;
    }

    public boolean isParallel(Line line){
        double slope = (a * -1) / (b);
        if (getSlope() == slope)
            return true;
        else
            return false;
    }

    public String toString(){
        return a + "x + " + b +"y + " + c + " = 0";
    }
}
