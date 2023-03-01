package FPP.Lesson2.lab2.assigment_7;

import java.util.Random;

public class Prog7 {
    public static void main(String[] args){
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            int num1 = rand.nextInt(99) + 1;
            int num2 = rand.nextInt(99) + 1;
            int num3 = rand.nextInt(99) + 1;
            int num4 = rand.nextInt(99) + 1;
            System.out.printf("%2d %2d %2d %2d\n", num1, num2, num3, num4);
            System.out.print("+ ");
            int sum = num1 + num2 + num3 + num4;
            int add1 = rand.nextInt(sum-3) + 1;
            int add2 = rand.nextInt(sum-add1-2) + 1;
            int add3 = rand.nextInt(sum-add1-add2-1) + 1;
            int add4 = sum - add1 - add2 - add3;
            System.out.printf("%26d + %2d + %2d + %2d\n", add1, add2, add3, add4);
            System.out.println("____ ____ ____ ____");
        }

    }

}
