package FPP.Lesson1;

import javax.swing.*;

public class hello {
    public static void main(String[] args) {
        sayHello();
    }
    public static String sayHello(){
        String msg = "Hello Mohamed lemin";
        JOptionPane.showMessageDialog(null,msg);

        return msg;
    }
}
