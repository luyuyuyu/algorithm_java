package queueStack;

import java.util.Deque;
import java.util.ArrayDeque;

class QueueByTwoStack {
	private Deque<Integer> in; 
	private Deque<Integer> out;
	
	public QueueByTwoStack() {
	    in = new ArrayDeque<Integer> ();
	    out = new ArrayDeque<Integer> ();
		// Write your solution here.
	  }

	public Integer poll() {
		shuffle(in, out);//shuffle first then return
		if (out.isEmpty()) {
			return null;
		}
		return out.pollFirst();
	}
	
	public void shuffle(Deque<Integer> stack1, Deque<Integer> stack2) {
		if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.offerFirst(in.pollFirst());
			}
		}
	}

	public void offer(int element) {
		in.offerFirst(element);
	}

	public Integer peek() {
		shuffle(in, out);
		return out.isEmpty() ? null : out.peekFirst();
	}

	public int size() {
		return in.size() + out.size();
	}

	public boolean isEmpty() {
		return in.size() == 0 && out.size() == 0;
	}
	
	
	public static void main(String[] args) {
		
	}
}