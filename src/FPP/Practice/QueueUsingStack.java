package FPP.Practice;

import java.util.Stack;

public class QueueUsingStack {
    // Q [10,20,30,40]
    // S1 [10,20,30,40] // use this for enqueue
    // S2 [40,30,20,10] // use this for dequeue
    private Stack<Integer> S1 = new Stack<>();
    private Stack<Integer> S2 = new Stack<>();

     public void Enqueue(int item){
         S1.push(item);

     }
     private void Copy(){
         while (!S1.isEmpty()){
             S2.push(S1.pop());
         }
     }
     public int Dequeue(){
         if (S2.isEmpty()) Copy();
         return S2.pop();
     }

     public int Peek(){
         if (S2.isEmpty()) Copy();
         return S2.peek();
     }
}
