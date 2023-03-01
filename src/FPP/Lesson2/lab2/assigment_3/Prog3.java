package FPP.Lesson2.lab2.assigment_3;

public class Prog3 {
    public static void main(String[] args) {
        float num1 = 1.27F;
        float num2 = 3.881F;
        float num3 = 9.6F;

        int sum = (int)( num1 + num2 + num3);
        System.out.println("the sum of the floats as an integer obtained by casting is :"+sum);

        int sum2 = Math.round(num1 + num2 + num3);
        System.out.println("the sum of the floats as an integer obtained by round is :"+sum2);

    }
}
