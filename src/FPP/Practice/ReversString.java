package FPP.Practice;

import java.util.Stack;

public class ReversString {
    public String reversed(String input){
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuffer res = new StringBuffer();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
}
