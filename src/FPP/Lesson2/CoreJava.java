package FPP.Lesson2;

import java.awt.*;

public class CoreJava {

    public static void main(String[] args) {
        // string are immutable  => we cannot change there value
        String str1 = "Hello";
        String str2 = "He" + "llo";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        String str6 = "He";
        String str7 = str6 + "llo";
        String str8 = str7.intern();

        System.out.println(str1==str2); //true
        System.out.println(str3==str4); // false
        System.out.println(str1==str7); //false
        System.out.println(str2==str3); // false
        System.out.println(str4==str5); // true
        System.out.println(str1==str8); // true

//      Use split to break up a String into tokens based on a set of delimiters.  The statement
        String s = "hello,how,are,you,today";
        String[] parsedVals = s.split(",");
//        The elements of parsedVals are:
//        hello
//        how
//        are
//        you
//        today

        String t = "Hello,strings can be fun. They have many uses" ;
        String[] result = t.split(",|\\. | ");
        //outpu
        // ["Hello", "strings", "can", "be", "fun", "They", "have", "many", "uses"]

        byte age = 30;
        byte x = age;
        age =31;
        System.out.println(x); // x = 30

        // Reference type are copied by the reference whereas primitive
        // variable are copied by there value and
        // this values are completely independent of each other.

        Point point1 = new Point(2,4);
        Point point2 = point1;
        point1.x =5;
        System.out.println(point2); // point2 = (5 , 4)
    }
}
