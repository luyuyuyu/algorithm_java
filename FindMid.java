package list;

class FindeMid {
	//odd nodes
	public ListNode findMiddleNode(ListNode head) {
		ListNode cur = head;
		while (cur.next != null) {
			cur = cur.next.next;
			head = head.next;
		}
		return head;
	    // Write your solution here
	}
	
	//even num of nodes find 1st
	public ListNode findMiddleNode1(ListNode head) {
	    if (head == null) return null;
		ListNode fast = head;
	    ListNode slow = head;
	    while (fast.next.next != null) {
	    	fast = fast.next.next;
	    	slow = slow.next;
	    }
	    return slow;
		// Write your solution here
	}
	
	//even num find second
	public ListNode findMiddleNode2(ListNode head) {
		if (head == null) return null;
		ListNode fast = head;
	    ListNode slow = head;
	    while (fast.next.next != null) {
	    	fast = fast.next.next;
	    	slow = slow.next;
	    }
	    slow = slow.next;
	    return slow;
		// Write your solution here
	}
	//**************************
	//not know even or odd num
	public ListNode findMiddleNode3(ListNode head) {
		if (head == null) return null;
		ListNode fast = head;
	    ListNode slow = head;
	    while (fast != null && fast.next != null && fast.next.next != null) {
	    	fast = fast.next.next;
	    	slow = slow.next;
	    }
	    return slow;
		// Write your solution here
	}
	
	public static void main(String[] args) {
		
	}
}