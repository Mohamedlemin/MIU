package FPP.Practice;

public class QueueLinkedList {
    public class MyQueueException extends Exception {
        public MyQueueException(String errorMessage) {
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

    public class MyQueue<T> {
        private Node<T> front;
        private Node<T> rear;
        private int size;

        public MyQueue() {
            front = null;
            rear = null;
            size = 0;
        }

        public void enqueue(T data) {
            Node<T> node = new Node<T>(data);
            if (isEmpty()) {
                front = node;
            } else {
                rear.next = node;
            }
            rear = node;
            size++;
        }

        public T dequeue() throws MyQueueException {
            if (isEmpty()) {
                throw new MyQueueException("Queue is empty");
            }
            T data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return data;
        }

        public T peek() throws MyQueueException {
            if (isEmpty()) {
                throw new MyQueueException("Queue is empty");
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public int size() {
            return size;
        }
    }

}
        //In this implementation, MyQueueException is a custom exception class that extends
        // the built-in Exception class. It takes an error message as a parameter and passes it to
        // the parent constructor using the super keyword.
//
//        The Node class is a generic class that represents a single node in the linked list.
//        It contains a data field and a next field that points to the next node in the list.
//
//        The MyQueue class is also a generic class that represents the queue data structure.
//        It contains a front field that points to the front node in the queue, a rear field
//        that points to the rear node in the queue, and a size field that keeps track of
//        the number of elements in the queue.
//
//        The enqueue method adds a new element to the rear of the queue by creating
//        a new node with the given data, setting its next field to the current rear,
//        setting rear to the new node, and updating the front field if the queue was
//        previously empty.
//
//        The dequeue method removes and returns the front element from the queue by
//        setting front to the next node and returning the data from the original front node.
//        If the queue becomes empty after dequeuing, the rear field is also set to null.
//
//        The peek method returns the front element from the queue without removing it.
//
//        The isEmpty method checks whether the queue is empty by checking whether front is null.
//
//        The size method returns the number of elements in the queue by returning the size field.
