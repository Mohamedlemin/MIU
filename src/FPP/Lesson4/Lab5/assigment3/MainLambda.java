package FPP.Lesson4.Lab5.assigment3;

import java.util.Arrays;

public class MainLambda {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "grape"};
        StringSort stringSort = new StringSort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        String[] sortedArr = stringSort.stringSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}