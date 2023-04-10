package MPP.midterm.association.oneToOne;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new Engine());
        car.start();
    }
}
