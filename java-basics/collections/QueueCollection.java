package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;

public class QueueCollection {
	public static void main(String[] args) {
		System.out.println("Queue collection program started");
		Queue<String> myqueue = new PriorityQueue<>();
		myqueue.offer("apple"); //to insert an element inside queue
		myqueue.addAll(List.of("zebra","monkey","cat"));
		System.out.println("element remove=>"+myqueue.poll()); //removing element from queue;
		
		System.out.println("all elements inside myqueue=>"+myqueue);
	}
}
