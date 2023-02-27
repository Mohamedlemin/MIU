package FPP.Lesson1;

public class dataType {
    public static void main(String[] args) {
        float x =2.3456F; // max 7 digit
        float y =5.4193F;
        double x1 = 2.3456;
        double y1 = 5.4193;
        System.out.println(x * y);
        System.out.println(x1 * y1);

        double a =0.7;
        double b=0.9;
        double a1 = a + 0.1;
        double b1 = b - 0.1;
        if (a1==b1) {
            System.out.println( a1+" "+ b1);
        }

        String s = "Use \"\\t\" to produce a tab";
        System.out.println(s);



    }
}
