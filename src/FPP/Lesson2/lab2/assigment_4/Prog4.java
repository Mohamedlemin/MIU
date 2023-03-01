package FPP.Lesson2.lab2.assigment_4;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String myStrings = Data.records;
        String[] rows =  myStrings.split(":");
        for(String row : rows){
            String[] col = row.split(",");
            String productId = col[0];
            System.out.println(productId);
        }
    }
}
