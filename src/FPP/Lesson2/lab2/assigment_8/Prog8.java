package FPP.Lesson2.lab2.assigment_8;

public class Prog8 {

    public static int min(int[] arrayOfInts) {
        int minVal = arrayOfInts[0];
        for (int i = 1; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] < minVal) {
                minVal = arrayOfInts[i];
            }
        }
        return minVal;
    }
}
