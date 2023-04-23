package MPP.Week3.lab7.intfaces2;

public interface Polygon extends ClosedCurve{
    @Override
    default double computePerimeter() {
        double perimeter = 0;
        for (double side : getLengths())
            perimeter += side;

        return perimeter;
    }
    double[] getLengths();
}
