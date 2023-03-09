package FPP.Lesson3.Lab4.assigment2.closedcurve.good;

public class Rectangle extends ClosedCurve{
    private final double width ;
    private final double length ;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length =length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
