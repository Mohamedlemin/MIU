package MPP.Week3.lab7.intfaces2;

public class EQSTriangle implements Polygon{
    private double side;

    public EQSTriangle(double side) {
        this.side = side;
    }


    @Override
    public double[] getLengths() {
        return new double[] {side, side, side};
    }
}
