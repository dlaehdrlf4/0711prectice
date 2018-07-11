package structure;

import java.util.PriorityQueue;
import java.util.Stack;

public class ListMain5 {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack <String> stack = new Stack<>();
		stack.push("c");
		stack.push("dsdf");
		stack.push("dff");
		//데이터가 역순으로 리턴됩니다 - 제거되면서 리턴
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//우선 순위 큐 만들기
		PriorityQueue <String> queue = new PriorityQueue(); // PriorityQueue 크기 순서대로 저장 된다. //크기가 작은 것부터 리턴
		queue.add("dong");
		queue.add("Fight");
		queue.add("dong2");
		queue.add("negozum");
		
		//데이터를 순서대로 리턴합니다.
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}

}
