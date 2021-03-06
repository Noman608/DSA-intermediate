
public class Stack {
     private class Node{
		int data;
		Node next;
	}
    
     private Node head;
     private Node tail;
     private int size;
     
     public void display() {
		Node temp = this.head;
		System.out.println("_________________");
		while(temp!=null) {
		    System.out.println(temp.data);
		    temp=temp.next;
		}
		System.out.println("_________________");
	}
     
     public void push(int val) {
		Node newNode = new Node();
		newNode.data =val;
		newNode.next =null;
		
		if(this.size>=1) {
			newNode.next = head;
		}
		if(this.size==0) {
			this.head = newNode;
			this.tail = newNode;
			size++;
		}
		else {
			this.head =newNode;
			this.size++;
		}
	}
    public int Size() {
		return this.size;
	}
    public boolean isEmpty() {
		return this.size==0;
	}
     public int pop() throws Exception {	
		if(this.size==0)
			throw new Exception("stack is empty!");
		int data =  this.head.data;
		if (this.size==1) {
			this.head=null;
			this.tail=null;
			size--;
		}
		else {
			this.head = this.head.next;
			this.size--;
		}
		return data;
	}
     public int top() throws Exception {
    	if(this.size==0)
 		    throw new Exception("There is not element on the stack");
		return this.head.data;
	}
     
}
