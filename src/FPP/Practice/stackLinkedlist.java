package FPP.Practice;

public class  stackLinkedlist {
    public class MyStackException extends Exception {
        public MyStackException(String errorMessage) {
            super(errorMessage);
        }
    }

    public class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public class MyStack<T> {
        private Node<T> top;
        private int size;

        public MyStack() {
            top = null;
            size = 0;
        }

        public void push(T data) {
            Node<T> node = new Node<T>(data);
            node.next = top;
            top = node;
            size++;
        }

        public T pop() throws MyStackException {
            if (isEmpty()) {
                throw new MyStackException("Stack is empty");
            }
            T data = top.data;
            top = top.next;
            size--;
            return data;
        }

        public T peek() throws MyStackException {
            if (isEmpty()) {
                throw new MyStackException("Stack is empty");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return size;
        }
    }
}

//        In this implementation, MyStackException is a custom
//        exception class that extends the built-in Exception class.
//        It takes an error message as a parameter and passes it to the parent
//        constructor using the super keyword.
//
//        The Node class is a generic class that represents
//        a single node in the linked list. It contains a data field and
//        a next field that points to the next node in the list.
//
//        The MyStack class is also a generic class that represents
//        the stack data structure. It contains a top field that points to
//        the top node in the stack and a size field that keeps track of the number
//        of elements in the stack.
//
//        The push method adds a new element to the stack by creating
//        a new node with the given data, setting its next field to the current top,
//        and setting top to the new node.
//
//        The pop method removes and returns the top element
//        from the stack by setting top to the next node and returning
//        the data from the original top node.
//
//        The peek method returns the top element from the stack without removing it.
//
//        The isEmpty method checks whether the stack is empty by checking whether top is null.
//
//        The size method returns the number of elements in the stack by returning the size field.

