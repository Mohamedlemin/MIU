package MPP.Week3.lab9.singletonImplementation;

import java.util.Optional;

public class SingletonUsingOptinal {

    private static Optional<SingletonUsingOptinal> instance = Optional.empty();
    private SingletonUsingOptinal(){}
    // thread-safe because of Optional.ifPresentOrElse
    public static SingletonUsingOptinal getInstance(){
       instance.ifPresentOrElse(
               a -> {},
               ()-> instance =Optional.of(new  SingletonUsingOptinal())
       );
       return instance.get();
    }

    public static void main(String[] args) {
        SingletonUsingOptinal singleton1 = SingletonUsingOptinal.getInstance();
        SingletonUsingOptinal singleton2 = SingletonUsingOptinal.getInstance();
        System.out.println(singleton1 == singleton2); // should print true
    }
}
