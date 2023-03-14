package FPP.Lesson8.inClassExo;

public class LinkedList {
    public static void main(String[] args) {
        Node startNode = new Node();
        startNode.Data = "A";
//        System.out.println(startNode);

        Node next  = new Node();
        next.Data = "B";
        startNode.next = next;
//        System.out.println(next);

        next  = new Node();
        next.Data = "C";
        startNode.next.next = next;
        System.out.println(startNode);

        Node b  = startNode.next;

        Node c  = startNode.next.next;
        startNode.next = c;
        b= null;
        System.out.println(startNode);

        Node pos1 = startNode.next;
        Node x =  new Node();
        x.Data = " x";
        x.next = startNode.next;
        startNode.next=x;
    }

}

class Node {
    Node startNode;
    Node next;
    String Data;

    @Override
    public String toString() {
        return   Data;
    }

    public void addFirst(String s){
        Node newNode = new Node();
        newNode.Data=s;
        newNode.next= startNode;
        startNode = newNode;
    }

    public void addLast(String s){
        Node newNode = new Node();
        newNode.Data = s;

        if (startNode == null){
            startNode=newNode;
        }else {
            Node last  =startNode;
            while (last.next!=null){
                last=last.next;
            }
            last.next = newNode;
        }
    }
    public boolean search(String s){
        if (s==null) return false;
        Node temp = startNode;
        while (temp!=null){
            String t = temp.Data;
            if (s.equals(t)) return true;
        }
        temp = temp.next;
        return false;
    }

    public boolean removeNode(String s){
        if (s==null || startNode==null) return false;
        if (startNode.Data.equals(s)){
            startNode.next = startNode;
            return true;
        }
        Node previous = startNode;
        Node next = startNode.next;

        while(next !=null){
            if (s.equals(next.Data)){
                previous.next = next.next;
                return true;
            }
            previous  = next;
            next = next.next;
        }
        return false;

    }

}