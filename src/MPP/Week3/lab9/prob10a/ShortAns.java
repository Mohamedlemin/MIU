package MPP.Week3.lab9.prob10a;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ShortAns {
    public static void main(String[] args) {
        MyInStream();
        stringStream();
    }

    public static void stringStream(){
        String StringStream = Stream.of("Bill","Thanos","Mary")
                .collect(Collectors.joining(","));
        System.out.println(StringStream);
    }

    public static void MyInStream (){
        IntStream myIntStream = IntStream.of(1,2,3,4,5);
        IntSummaryStatistics  summary = myIntStream.summaryStatistics();
        System.out.println("Max :" + summary.getMax()
        + " Min : "+ summary.getMin());

    }
}
