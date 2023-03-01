package FPP.Lesson2.lab2.assigment_6;

public class Prog6 {
    public static void main(String[] args) {

    }
    public static String[] removeDups(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
