//32 enhance existing stack, add function min()
package queueStack;

import java.util.Deque;
import java.util.ArrayDeque;

class StackWithMin {
	private Deque<Integer> myStack;
	private Deque<Integer> minStack;//store more than 1 min, could pop more than 1 time

	public StackWithMin() {
		myStack = new ArrayDeque<Integer>();
		minStack = new ArrayDeque<Integer>();
		// write your solution here
	}

	public int pop() {
		if (!myStack.isEmpty() && myStack.peekFirst().equals(minStack.peekFirst())) {//Integer is obj, use obj.equals()
			minStack.pop();
		}
		return myStack.isEmpty() ? -1 : myStack.pollFirst();
	}

	public void push(int element) {
		myStack.offerFirst(element);
		if (minStack.isEmpty() || element <= minStack.peekFirst()) {
			minStack.offerFirst(element);
		}
	}

	public int top() {
		return myStack.isEmpty() ? -1 : myStack.peekFirst();
	}

	public int min() {
		return minStack.isEmpty() ? -1 : minStack.peekFirst();
	}
	
	public static void main(String[] args) {

	}
}