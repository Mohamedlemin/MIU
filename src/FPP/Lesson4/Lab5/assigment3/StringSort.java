package FPP.Lesson4.Lab5.assigment3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    private Comparator<String> comparator;

    public StringSort(Comparator<String> myComparator) {
        this.comparator = myComparator;
    }

    public String[] stringSort(String[] arr) {
        Arrays.sort(arr, comparator);
        return arr;
    }
}