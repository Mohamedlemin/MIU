package MPP.midterm.association.composition.oneToOne;


public class Car {
    Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
