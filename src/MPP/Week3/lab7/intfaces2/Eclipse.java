package MPP.Week3.lab7.intfaces2;

public class Eclipse implements ClosedCurve{
    private double semiaxis;
    private double elateral;
    public Eclipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }


    @Override
    public double computePerimeter() {
        return 4 * semiaxis * elateral;
    }
}
