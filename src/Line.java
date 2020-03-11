/**
 * @author Lucy Thomas
 * @since March 7, 2020
 * This program finds the slope of a line, determines if a certain
 * point is on a line, and determines if two lines are parallel
 */
public class Line {
    private double a;
    private double b;
    private double c;

    /**
     *The constructor initializes points a b and c
     * @param a
     * @param b
     * @param c
     */
    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *Calculates the slope of a line
     * @return the slope
     */
    public double getSlope() {
        return (a * -1) / (b);
    }

    /**
     * Checks if a certain point is on a line
     * @param x
     * @param y
     * @return false if the point is not on the line and true if the point is on the line
     */
    public boolean isOnLine(int x, int y) {
        if (((a * x) + (b * y) + c) == 0)
            return true;
        else
            return false;
    }

    /**
     * Checks if two lines are parallel
     * @param line
     * @return false if the lines aren't parallel and true if they are parallel
     */
    public boolean isParallel(Line line){
        if (this.getSlope() == line.getSlope())
            return true;
        else
            return false;
    }

    /**
     * Prints the equation in standard form
     * @return standard form equation of the line
     */
    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }
}

