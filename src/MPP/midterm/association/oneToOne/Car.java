package MPP.midterm.association.oneToOne;

public class Car {
    Engine engine;
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
