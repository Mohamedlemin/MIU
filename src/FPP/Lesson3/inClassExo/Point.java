package FPP.Lesson3.inClassExo;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object p){
        if (p == null) return false;
        if (p.getClass() != this.getClass()) return false;
        Point other = (Point) p;

        return other.x == x && other.y==y;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
