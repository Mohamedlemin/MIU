package FPP.Lesson4.Lab5.assigment3;


import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    boolean assending;
    @Override
    public int compare(String s1, String s2) {
//        if (s1.length() < s2.length()) {
//            return -1;
//        } else if (s1.length() > s2.length()) {
//            return 1;
//        } else {
//            return 0;
//        }
        System.out.println(assending ? (s1.length() - s2.length()) : (s2.length() - s1.length()));

        return assending ? (s1.length() - s2.length()) : (s2.length() - s1.length());

    }
}