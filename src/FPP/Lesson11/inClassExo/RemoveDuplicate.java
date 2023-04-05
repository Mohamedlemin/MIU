package FPP.Lesson11.inClassExo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


public class RemoveDuplicate {

    class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public void deleteDups(LinkedListNode n) {
            LinkedListNode current = n;
            LinkedListNode previous = null;
            HashSet<Integer> set = new HashSet<>();
            while (current != null) {
                if (set.contains(current.data)) {
                    previous.next = current.next;
                } else {
                    set.add(current.data);
                    previous = current;
                }
                current = current.next;
            }

        }

}
