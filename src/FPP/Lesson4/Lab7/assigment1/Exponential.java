package FPP.Lesson4.Lab7.assigment1;

public class Exponential {

    public double power(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * power(x, n - 1);
    }

    public static void main(String[] args){
        Exponential e = new Exponential();
        System.out.println(e.power(2, 10));
    }
}

