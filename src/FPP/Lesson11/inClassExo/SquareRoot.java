package FPP.Lesson11.inClassExo;

public class SquareRoot {
    public static void main(String[] args) {

        long start1 = System.nanoTime();
        System.out.println( sqrt(5) + " time : " +start1);
    }
    public static int SquareRootCal(int n){

        int mid = n/2;
        if (n<=2) return n;
        for (int i = 2;i< mid;i++){
            if (i*i==n) return i;
        }
        return -1;
    }


    public static int sqrt(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (num == 0 || num == 1) {
            return num;
        }
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long)mid * (long)mid;
            if (square == num) {
                return mid;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
