package queueStack;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

class Shuffle {
	public static void shuffle(Deque<Integer> stack1, Deque<Integer> stack2) {
		while (stack1.isEmpty() == false) {
			stack2.offerFirst(stack1.pollFirst());
		}
		return;
	}
	
	public static void main(String[] args) {
		Deque<Integer> stack1 = new ArrayDeque<> ();
		for (int i = 0; i < 10; ++i) {
			stack1.offerFirst(i);
		}
		System.out.println(Arrays.deepToString(stack1.toArray()));
		Deque<Integer> stack2 = new ArrayDeque<> ();
		shuffle(stack1, stack2);
		System.out.println(Arrays.deepToString(stack2.toArray()));
	}
}