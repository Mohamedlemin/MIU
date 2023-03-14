package FPP.Lesson8.Lab8.assigment2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		n.next = header.next;
		n.previous = header;
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	// inserts a new Node containing data so that its position in the list is now pos
	public void insert(String data, int pos) {
		Node current = header.next;
		int index = 0;
		while (current != null && index < pos) {
			current = current.next;
			index++;
		}
		if (current == null && index < pos) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + pos);
		}
		Node newNode = new Node(data);
		newNode.previous = current.previous;
		newNode.next = current;
		current.previous.next = newNode;
		current.previous = newNode;
	}

	// attempts to remove the first Node that contains data;
	// if successful, returns true; otherwise, false.
	public boolean remove(String data) {
		Node current = header.next;
		while (current != null && !current.value.equals(data)) {
			current = current.next;
		}
		if (current == null) {
			return false;
		}
		current.previous.next = current.next;
		if (current.next != null) {
			current.next.previous = current.previous;
		}
		current.next = null;
		current.previous = null;
		return true;
	}

	public class MinSort {

		public static void sort(MyStringLinkedList list) {
			if (list.header.next == null || list.header.next.next == null) {
				return; // list is already sorted
			}

			Node start = list.header.next;
			while (start.next != null) {
				Node minNode = start;
				Node current = start.next;
				while (current != null) {
					if (current.value.compareTo(minNode.value) < 0) {
						minNode = current;
					}
					current = current.next;
				}
				if (minNode != start) {
					list.swap(start, minNode);
				}
				start = start.next;
			}
		}

	}
	public void swap(Node node1, Node node2) {
		if (node1 == null || node2 == null || node1 == node2) {
			return; // nothing to swap
		}

		String temp = node1.value;
		node1.value = node2.value;
		node2.value = temp;
	}



	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
	}
}
