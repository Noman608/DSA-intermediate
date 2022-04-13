
public class Queue {
	private class Node {
		int data;
		Node next;
	}

	private Node head = null;
	private Node tail = null;
	private int size;

	public void display() {
		Node temp = head;
		System.out.println("----------");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("----------");
	}

	public int Size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void enqueue(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		if (this.size > 0) {
			this.tail.next = newNode;

		}
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		} else {
			this.tail = newNode;
			this.size++;
		}

	}

	public int dequeue() throws Exception {
		if (this.size == 0)
			throw new Exception("Queue is Empty!");
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		int dequeItem = head.data;
		return dequeItem;

	}

}
