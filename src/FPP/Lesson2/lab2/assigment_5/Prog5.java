package FPP.Lesson2.lab2.assigment_5;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a String");
        String input = sc.nextLine();
        int length = input.length();
        String reversed = "";
        for (int i = length-1; i >= 0 ; i--) {
           reversed += input.charAt(i);
        }
        System.out.println(reversed);
    }
}
