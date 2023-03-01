package FPP.Lesson2.lab2.assigment_2;

public class prog2 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1,9);
        double result1 = Math.pow(Math.PI, x);
        System.out.println("π^" + x + " = " + result1);

        int y = RandomNumbers.getRandomInt(3,14);
        double result2 = Math.pow(y, Math.PI);
        System.out.println(y + "^π = " + result2);

    }
}
