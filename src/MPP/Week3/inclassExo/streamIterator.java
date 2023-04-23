package MPP.Week3.inclassExo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamIterator {
    public static void main(String[] args) {
        List<Integer> stream = Stream.iterate(1, n->n+2)
                .skip(4)
                .limit(8)
                .collect(Collectors.toList());

        System.out.println(stream);
    }

}
