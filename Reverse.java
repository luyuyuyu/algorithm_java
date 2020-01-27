package list;

class Reverse {
	//iterative
	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
		// Write your solution here
	}
	//recursion
	//standard answer
	public ListNode reverse1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverse1(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	/*public ListNode reverse1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = null;
		return helper(prev, head);
	}
	
	public ListNode helper(ListNode prev, ListNode head) {
		if (head == null) {
			return prev;
		}
		ListNode next = head.next;
		head.next = prev;
		prev = head;
		head = next;
		return helper(prev, head);
	}
	//wrong answer
	/*public ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode end = head.next;
		head.next = null;
		while (end != null && end.next != null) {
			ListNode temp = end.next;
			end.next = head;
			head = end;
			end = temp;
		}
		end.next = head;
		return end;
		// Write your solution here
	}*/
	
	public static void main(String[] args) {
		
	}
}