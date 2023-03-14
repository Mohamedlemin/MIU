package FPP.Lesson4.Lab5.assigment3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "grape"};
        StringSort stringSort = new StringSort(new StringLengthComparator());
        String[] sortedArr = stringSort.stringSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}