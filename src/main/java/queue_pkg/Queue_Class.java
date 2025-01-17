package queue_pkg;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queue_Class {

	
//FIFO--queue
//LIFO--stack	
	   public static void main(String[] args) {
//	       List<String> queue = new LinkedList<>();
	       Queue<String> queue = new PriorityQueue<String>();
	       queue.add("apple");
	       queue.add("banana");
	       queue.add("cherry");
	       System.out.println("Queue: " + queue);
//	       String front=queue.remove(0);
	       String front = queue.remove();
	       System.out.println("Removed element: " + front);
	       System.out.println("Queue after removal: " + queue);
	   }
}
