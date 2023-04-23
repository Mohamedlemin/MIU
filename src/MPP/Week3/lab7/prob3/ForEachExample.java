package MPP.Week3.lab7.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
				"Away", "On Vacation", "Everywhere you want to be");

		//print each element of the list in upper case format
        List<String> newList = new ArrayList<>();
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				String upperCase = s.toUpperCase();
				newList.add(upperCase);
			}
		});
		System.out.println(newList);

	}

	//implement a Consumer


}