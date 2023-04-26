package MPP.Week3.lab7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format

  myConsumer.accept(list);

    }

    //implement a Consumer
    public static Consumer<List<String>> myConsumer = (l) -> l.forEach(s -> System.out.println(s.toUpperCase()));

}
