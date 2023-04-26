package MPP.Week3.lab9.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue(list));
	}

	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(s -> s.flag)
				.reduce((a, b)-> a || b).orElse(false);
	}

}
