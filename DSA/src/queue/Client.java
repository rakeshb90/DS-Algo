package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue);
		int x=queue.remove();
		System.out.println(queue);

	}

}
