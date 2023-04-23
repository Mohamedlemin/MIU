package MPP.Week3.lab11;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		return wildcardHelper(group);

	}
	public static <T> Group<T> wildcardHelper (Group<T> group){
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}

	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,3,2,3,4);
		Group<Integer> group = new Group<>(3, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
