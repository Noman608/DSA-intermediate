
public class Clinet {

	public static void main(String[] args) throws Exception { 
		Stack stack= new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		stack.display();
	    System.out.println(stack.isEmpty());
		
	}

}