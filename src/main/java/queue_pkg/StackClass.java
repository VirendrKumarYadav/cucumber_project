package queue_pkg;

import java.util.Stack;

public class StackClass {

//LIFO	

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();

		st.add("apple");
		st.add("ball");
		st.add("Cat");
        
		System.out.println("stack: " + st.pop());
		System.out.println("stack: " + st);
	}
}
