package MPP.Week3.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Double, Double, List<Double>> biFuntion = (x,y) -> {
			List<Double> list = new ArrayList<>(); 
			list.add(Math.pow(x,y)); 
			list.add(x * y);
			return list;
		};
		
		
		System.out.println(biFuntion.apply(2.0, 3.0));
	}
	
}
