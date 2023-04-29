package MPP.Week3.lab9.singletonImplementation;

import java.util.Optional;

public class SingletonOfNullable {

    private static Optional<SingletonOfNullable> instance = Optional.empty();

    private SingletonOfNullable() {}

    public static SingletonOfNullable getInstance() {
        return instance.orElseGet(() -> {
            SingletonOfNullable newSingleton = new SingletonOfNullable();
            instance = Optional.of(newSingleton);
            return newSingleton;
        });
    }

    public static void main(String[] args) {
        SingletonOfNullable singleton1 = SingletonOfNullable.getInstance();
        SingletonOfNullable singleton2 = SingletonOfNullable.getInstance();
        System.out.println(singleton1 == singleton2); // should print true
    }
}
