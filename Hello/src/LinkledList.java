
public class LinkledList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		System.out.println("--------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("--------------");
	}

	public void addLast(int item) {

		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		if (this.size >= 1) {
			this.tail.next = newNode;
		}

		// update summary object
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		} else {
			this.tail = newNode;
			this.size++;
		}

	}

	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;
		if (this.size >= 1) {
			newNode.next = this.head;

		}
		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		} else {
			this.head = newNode;
			size++;
		}
	}

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is Empty!");
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is Empity!");
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LikedList is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index is not valid");
		}

		Node temp = head;
		for (int i = 1; i <= index; i++)
			temp = temp.next;

		return temp.data;

	}
	
	private Node getNodeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LikedList is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index is not valid");
		}

		Node temp = head;
		for (int i = 1; i <= index; i++)
			temp = temp.next;

		return temp;

	}

	public void addAt(int val, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid index.");
		}
		if (index == 0) {
			addFirst(val);
		} else if (index == size) {
			addLast(val);
		} else {
             	Node newNode =  new Node();
             	newNode.data = val;
             	newNode.next = null;
             	
             	Node npNode = getNodeAt(index-1);
             	Node nnNode = npNode.next;
             	
             	npNode.next = newNode;
             	newNode.next = nnNode;
             	size++;
             	
             	
		}
	}
	
	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		int removeValue = this.head.data;
		if (size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
             this.head =  this.head.next;
             this.size--;
		}
		return removeValue;
	}
	
	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		int removeValue = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node P_toBedeletNode = getNodeAt(this.size-2);
			this.tail = P_toBedeletNode;
			this.tail.next = null;
			size--;
		}
		return removeValue;
	}

	public int removAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty.");
		}
		if (index < 0 || index >= size) {
			throw new Exception("Index is not valid");
		}

		if (index == 0) {
			return removeFirst();
		} else if (index == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(index - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;

			this.size--;

			return n.data;

		}

	}
	
	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node lNode = getNodeAt(left);
			Node rNode = getNodeAt(right);

			int temp = lNode.data;
			lNode.data = rNode.data;
			rNode.data = temp;

			left++;
			right--;

		}
	}

	public void revesePointers() {
	    Node pNode = head;
	    Node cNode  = pNode.next;
	    while(cNode!=null) {
	    	Node ahNode = cNode.next;
	    	cNode.next = pNode;
	    	
	    	pNode = cNode;
	    	cNode = ahNode;
	    }

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		tail.next = null;

	}
	
	public int mid() {
		Node slowNode =this.head;
		Node fastNode =this.head;
		while(fastNode.next!=null && fastNode.next.next!=null) {
			slowNode=slowNode.next;
			fastNode = fastNode.next.next;
		}
		return slowNode.data;
		
	}
	

}
