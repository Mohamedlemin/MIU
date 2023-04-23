package MPP.Week3.practice.mosh;

import java.util.List;
import java.util.function.Consumer;

public class lambdaDmos {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        List<String> mylist = List.of("a","b","c","d","e");
//        mylist.forEach(System.out::print);
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUperCase = item -> System.out.println(item.toUpperCase());
        mylist.forEach(print.andThen(printUperCase));
    }
    public static void greet(Printer p ){
        p.printer("hello");
    }
}
